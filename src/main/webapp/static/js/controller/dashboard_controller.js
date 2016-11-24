'use strict';

App.controller('dashboardCtrl', ['$scope', '$state', 'dashboardService', function($scope, $state, dashboardService) {
	
	var dashboard = this;
	
	dashboard.title = "Dashboard View"
	dashboard.loadPlayers = loadPlayers;
	dashboard.createPlayer = createPlayer;
	dashboard.loadTeamList = loadTeamList;
	dashboard.createTeam = createTeam;
	
	dashboard.teams={"teamList": []};
	
	dashboard.VIEWTEAMMODE = false;
	dashboard.MAIN_DASHBOARD_VIEW = true;
	
	
	var resetViews = function (flag) {
		if(flag === 'MAIN_DASHBOARD_VIEW') {
			dashboard.MAIN_DASHBOARD_VIEW = true;
			dashboard.VIEWTEAMMODE = false;
		} else if (flag === 'VIEW_TEAM_MODE') {
			dashboard.MAIN_DASHBOARD_VIEW = false;
			dashboard.VIEWTEAMMODE = true;
		}
	}
	
	resetViews('MAIN_DASHBOARD_VIEW');
	
	function createTeam() {
		$state.go('teamList');
	}
	
	function createPlayer() {
		$state.go('user');
	}
	
	function loadTeamList() {
		$state.go('teamList');
	}
	
	function loadPlayers() {

	}
	
	/*function loadTeamList() {
		dashboard.teams.teamList = dashboardService.loadTeamList()
		.then( function (response) {
			dashboard.teamList = dashboardService.loadTeamList();
			resetViews('VIEW_TEAM_MODE');
        }).then( function(reject) {
    		console.log("Error in Logging in");
    	});
	}*/
	
	
	
}]);