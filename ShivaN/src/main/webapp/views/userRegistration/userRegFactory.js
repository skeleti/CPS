angular.module('App').factory('userRegFactory',['$http','$q',function($http,$q){
	
	return{
                   saveUser: function(finalObject){
            console.log(finalObject);
            return $http.post('http://192.168.2.185:8080/CPS-Application/services/user/new', finalObject)
                .then(
                    function(response){
                        return response.data;
                    },
                    function(errResponse){
                        console.error('Error while submitBulk data');
                        return $q.reject(errResponse);
                    }
                );
        }		


	      }
	
}]);


