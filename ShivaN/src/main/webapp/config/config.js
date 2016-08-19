var app = angular.module('App',['ui.router','ngResource']);

app.config(function($stateProvider,$urlRouterProvider){
	
	$urlRouterProvider.otherwise('/home');
	
	$stateProvider.state('userRegistration',{
		url:'/userRegistration',
		templateUrl: '../views/userRegistration.html'
	});
});