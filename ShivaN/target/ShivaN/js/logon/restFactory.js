angular.module('myApp').factory('myfact', ['$resource',function($resource) {
return $resource('http://192.168.1.220:8080/CPS-Application/services/user/get',{},{
	getData : {
			method: 'GET',
			isArray : false,
			cache : false
}
})
}]);
