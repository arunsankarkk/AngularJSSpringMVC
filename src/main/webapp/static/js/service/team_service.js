/**
 * 
 */

App.service('teamService', ['urlConstants','$q','httpService','urlConstants', 
                            function(urlConstants, $q, httpService, urlConstants) {
	
	this.loadTeamList = function() {
		var deferred = $q.defer(); 
		var http = httpService.get(urlConstants.GET_TEAM_LIST);
    	http.then(
            function (response) {
                deferred.resolve(response);
            },
            function(reject){
                deferred.reject(reject);
            });
    	 return deferred.promise;
	}
	
	this.saveTeam = function(team) {
		var http = httpService.post(urlConstants.SAVE_TEAM, team.newTeam);
			http.then(
	            function (response) {
	            	team.message="Team Saved Successfully";
	            	team.newTeam = response.data;
	            },
	            function(reject){
	            	team.message="Error in saving";
	            });
	}
	
	this.updateTeam = function(team) {
		var http = httpService.post(urlConstants.UPDATE_TEAM, team.newTeam);
			http.then(
	            function (response) {
	            	team.message="Team Record Updated Successfully";
	            	team.newTeam = response.config.data;
	            },
	            function(reject){
	            	team.message="Error in updating";
	            });
	}
}]);