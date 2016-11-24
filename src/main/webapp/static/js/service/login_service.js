'use strict';

App.factory('LoginService', ['urlConstants','httpService','$rootScope','$q','$state',
                             function(urlConstants, httpService, $rootScope, $q, $state){

    var loginfactory = {
            login:login
        };
    
    return loginfactory;
    
    function login(login) {
    	var deferred = $q.defer(); 
    	httpService.post(urlConstants.REST_SERVICE_LOGIN_URI, login)
    	.then(
            function (response) {
            	$rootScope.navigateToLogin = true;
	        	$state.go('dashboard')
            },
            function(errResponse){
            	console.log("Error in login")
            });
    	 return deferred.promise;
    }

}]);