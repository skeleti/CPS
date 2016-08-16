var app =angular.module('myApp', ['ngResource']);
app.controller('myCtrl',['$scope','$window','myfact',function($scope,$window,myfact) {
   $scope.login = function(){
 		 	myfact.getData({userName: $scope.userName,password:$scope.password}).$promise.then(function (response) {
      				if(response.role == 'admin'){
				$window.location.href="views/index.html";
			}else{
				$scope.ValidationSummary = true;
			}
						});
			};
}]);
