'use strict';

angular.module('myApp').controller('LoginCtrl', [ 'LoginService', '$state','$rootScope',
                                function( LoginService, $state, $rootScope) {
	
	var login = this;
	login.username='';
	login.password='';
    
	$rootScope.navigateToLogin = false;
	
	login.signIn = signIn;
    
     function signIn() {
    	var parms = {'username': login.username, 'password':login.password}
    	var http = LoginService.login(parms);
    	
    	/* http.then( 
    		function(response) {
	    		$rootScope.navigateToLogin = true;
	        	$state.go('dashboard')},
        	function(reject) {
	    		$rootScope.navigateToLogin = false;
	    		console.log("Error in Logging in");
	        });*/
    	
    }
	
}]);