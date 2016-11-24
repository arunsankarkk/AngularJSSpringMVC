'use strict';

var App = angular.module('myApp',['ui.router', 'ui.grid']);

App.config(['$stateProvider', function($stateProvider) {

$stateProvider
.state('login', {
    url: "/login",
    views: {
        "main": {
            templateUrl: "login",
            controller: "LoginCtrl",
            controllerAs: "lgctrl"
        }
    }
})
.state('user', {
    url: "/user",
    views: {
          "main": {
              templateUrl: "UserManagement",
              controller: "UserController",
              controllerAs: "userCtrl"
          }
    }
	}).state('dashboard', {
		url: "/dashboard",
		views:{
			"main":{
				templateUrl: "dashboard",
				controller: "dashboardCtrl",
				controllerAs: "dbctrl"
			}
		}
	}).state('teamList', {
		url:"/team",
		views:{
			"main":{
				templateUrl: "team",
	            controller: "teamListCtrl",
	            controllerAs: "teamctrl"
			}
		}
	});
	// $urlRouterProvider.otherwise({redirectTo: '/login'});

/*$routeProvider.when('/', {templateUrl: 'login.jsp', controller: "LoginCtrl as lgctrl"});
$routeProvider.when('/User', {templateUrl: 'userManagemet.jsp', controller: "UserController"});


$routeProvider.otherwise({ redirectTo: "/"});*/


}]);


