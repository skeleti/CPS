var app =angular.module('myApp', ['ngResource']);
app.controller('myCtrl',['$scope','$window','myfact',function($scope,$window,myfact) {
   $scope.login = function(){
 		 	myfact.getData().$promise.then(function (response) {
	console.log(response[0].bankCode);
      				if(response[0].bankCode == 3500){
				$window.location.href="views/index.html";
			}
						});
			};
}]);
