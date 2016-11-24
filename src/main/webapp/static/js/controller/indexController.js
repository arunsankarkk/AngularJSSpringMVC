'use strict';

angular.module('myApp').controller('IndexController', [ '$state','$rootScope', function( $state, $rootScope) {
	
	var login = this;
     
	$rootScope.navigateToLogin = false;
	login.signIn = signIn;
	login.menuClick = menuClick;
     
     function signIn() {
    	$rootScope.navigateToLogin = true;
    	$state.go('login');
    }
     
     function menuClick(arg) {
    	 if(arg === 'TEAM') {
    		 $state.go('createTeam');
    	 } else if(arg === 'PLAYER'){
    		 $state.go('user');
    	 }
     }
	
}]);