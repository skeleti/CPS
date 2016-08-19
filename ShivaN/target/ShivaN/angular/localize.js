angular.module('app.localize', []) 
    .factory('settings', ['$rootScope', function($rootScope){
    // supported languages
    var settings = {
        languages: [
            {
                language: 'English',
                translation: 'English',
                langCode: 'en',
                flagCode: 'us'
            },
            /*{
                language: 'Hindi',
                translation: 'हिन्दी',
                langCode: 'hi',
                flagCode: 'hi'
            },*/
            {
                language: 'Telugu',
                translation: 'తెలుగు',
                langCode: 'te',
                flagCode: 'te'
            }
        ]

    };

    return settings;

}])
     .controller('LangController', ['$scope', 'settings', 'localize','localStorageService', function($scope, settings, localize,localStorageService) {
    $scope.languages = settings.languages;
    $scope.currentLang = settings.currentLang;
    $scope.setLang = function(lang) {
        settings.currentLang = lang;
        $scope.currentLang = lang;
        localize.setLang(lang);
    }
    // set the default language
    $scope.setLang(localStorageService.get('userLanguage') || $scope.currentLang);

}])



    .factory('localize', ['$http', '$rootScope', '$window', 'localStorageService', function($http, $rootScope, $window, localStorageService){
        var localize = {
            currentLocaleData: {},
            currentLang: {},
            setLang: function(lang) {
                $http({method: 'GET', url: localize.getLangUrl(lang), cache: false})
                    .success(function(data) {
                        localize.currentLocaleData = data;
                        localize.currentLang = lang;
                        $rootScope.currentLocaleData = localize.currentLocaleData;
                        $rootScope.$broadcast('localizeLanguageChanged');
                        localStorageService.add('userLanguage',lang);
                    }).error(function(data) {
                        console.log('Error updating language!');
                    })
            },
            getLangUrl: function(lang) {
                return 'langs/' + lang.langCode + '.json';
            },

            localizeText: function(sourceText) {
                return localize.currentLocaleData[sourceText];
            }
        };

        return localize;
    }])

    .directive('localize', ['localize', function(localize) {
        return {
            restrict: 'A',
            scope: {
                sourceText: '@localize'
            },
            link: function(scope, element, attrs) {
                scope.$on('localizeLanguageChanged', function() {
                    var localizedText = localize.localizeText(scope.sourceText);
                    if (element[0].localName.toLowerCase() == 'input' || element[0].localName.toLowerCase() == 'textarea') element.attr('placeholder', localizedText)
                    else element.text(localizedText);
                });
            }
        }
    }])
;

