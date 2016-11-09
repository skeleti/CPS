angular.module('App').controller('userRegController',['$scope','$window','userRegFactory',function($scope,$window,userRegFactory){
	

	$scope.firstName=null;
	$scope.lastName=null;
	$scope.userName=null;
	$scope.password=null;
	
	$scope.resetButton=function(){
	 
		$scope.firstName=null;
		$scope.lastName=null;
		$scope.userName=null;
		$scope.password=null;
		
	}
	
	$scope.saveObject={};
console.log($scope.saveObject); 
	

	
	$scope.saveButton=function(){
	alert('hello');
	console.log($scope.saveObject);
		$scope.saveObject.firstName=$scope.firstName;
		$scope.saveObject.lastName=$scope.lastName;
		$scope.saveObject.userName=$scope.userName;
		$scope.saveObject.password=$scope.password;
		console.log($scope.saveObject);
		userRegFactory.saveUser($scope.saveObject);
	}
	
	
}]);

