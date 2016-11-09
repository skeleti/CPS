angular.module('App').controller(
		'userRegController',
		[ '$scope', '$window', 'userRegFactory',
				function($scope, $window, userRegFactory) {

					$scope.firstName = null;
					$scope.lastName = null;
					$scope.userName = null;
					$scope.password = null;
					$scope.status=null;

					$scope.resetButton = function() {

						$scope.firstName = null;
						$scope.lastName = null;
						$scope.userName = null;
						$scope.password = null;

					}

					$scope.saveObject = {};

					$scope.saveButton = function() {
						$scope.saveObject.firstName = $scope.firstName;
						$scope.saveObject.lastName = $scope.lastName;
						$scope.saveObject.userName = $scope.userName;
						$scope.saveObject.password = $scope.password;
						console.log($scope.saveObject);
						userRegFactory.saveUser($scope.saveObject).then(function(result){
							$scope.status=result;
							$scope.firstName = null;
							$scope.lastName = null;
							$scope.userName = null;
							$scope.password = null;
						});
						
						
					}

				} ]);
