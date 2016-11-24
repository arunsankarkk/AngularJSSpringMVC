/**
 * 
 */

'use strict';

App.controller('teamListCtrl', ['$scope', '$state', 'teamService', 
                                 function($scope, $state, teamService) {
	
	var team = this;
	team.newTeam={'teamId': "" , 'teamName': "",'country':"" , 'homeStadium': "", 'teamWealth':""};
	
	team.CREATE_TEAM = true;
	team.TEAM_LIST = false;
	team.teamList=[];
	team.message = "";
	
	team.saveTeam = saveTeam;
	
	team.gridOptions = {
		columnDefs : [
		{ field: 'teamName', name: 'Team Name',},
		{ field: 'country', name: 'Country', },
		{ field: 'homeStadium', name: 'Home Stadium', },
		{field: 'teamWealth', name: 'Team Wealth', }
		]
	};
	  	
	var loadTeamList = function() {
		selectView(true, false);
		team.teamList = teamService.loadTeamList();
	}
  
	function saveTeam(save) {
		if(save === 'save') {
			selectView(false, true);
			teamService.saveTeam(team);
		} else {
			teamService.updateTeam(team);
		}
		
	}
	
	var selectView = function(list, create){
		team.TEAM_LIST = list;
		team.CREATE_TEAM = create;
	}
	
}]);