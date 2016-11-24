<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
	<body>
		<div class="row generic-container">
			<div ng-if="dbctrl.MAIN_DASHBOARD_VIEW">
				<div class="well well-lg pad-btm-80 col-md-2">
				<a href="static/image/arun.jpg" class="thumbnail">
					<div ng-click="dbctrl.loadPlayers()">VIEW PLAYER</div>
					<img src="static/image/arun.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236">
				</a>
				</div>
				
				<div class="well well-lg pad-btm-80 col-md-2">
					<a href="" class="thumbnail">
						<div ng-click="dbctrl.createTeam()">CREATE TEAM</div>
						<img src="static/image/Epl_teams.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236">
					</a>
				</div>
				<div class="well well-lg pad-btm-80 col-md-2">
					<a href="" class="thumbnail">
						<div ng-click="dbctrl.createPlayer()">CREATE PLAYER</div>
						<img src="static/image/create_palyer.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236">
					</a>
				</div>
				<div class="well well-lg pad-btm-80 col-md-2">
					<a ng-href="" class="thumbnail">
						<div ng-click="dbctrl.loadTeamList()">VIEW TEAMS</div>
						<img src="static/image/arun.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236">
					</a>
				</div>	
			</div>
			
			<div ng-if="dbctrl.VIEWTEAMMODE">
				<div class="well well-lg pad-btm-80 col-md-2">
				<a href="static/image/arun.jpg" class="thumbnail">
					<div ng-click="dbctrl.loadPlayers()">VIEW PLAYER</div>
					<img src="static/image/arun.jpg" class="img-rounded" alt="Cinque Terre" width="304" height="236">
				</a>
				</div>
			
			</div>
		</div>
	</body>
</html>