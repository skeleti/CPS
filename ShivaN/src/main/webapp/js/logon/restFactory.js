angular.module('myApp').factory('myfact', ['$resource',function($resource) {
return $resource('http://192.168.1.220:8080/kls-application-1.1.0.0/json/master/bankParameter',{},{
	getData : {
			method: 'GET',
			isArray : true,
			cache : false
}
})
}]);
