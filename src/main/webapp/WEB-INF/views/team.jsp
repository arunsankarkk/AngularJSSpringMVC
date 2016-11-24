<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Insert title here</title>
	</head>
	<body>
	  <div class="generic-container">
        <div class="panel panel-default">
	        <div class="panel-heading"><span class="lead">TEAM </span></div>
	        <div class="formcontainer">
			<form ng-submit="teamctrl.submit()" name="myTeamForm" class="form-horizontal">
				<div class="row generic-container" ng-if="teamctrl.TEAM_LIST">
					<div>
						<div ui-grid="teamctrl.gridOptions" class="myGrid"></div>
					</div>
				</div>
		
				<div>
					<div class="formcontainer" ng-if="teamctrl.CREATE_TEAM = true">
		              <form  name="myTeamForm1" class="form-horizontal" >
		              	 <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Team Name</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="teamctrl.newTeam.teamName" name="teamName" class="username form-control input-sm" 
                                   required />
                                  <div class="has-error" ng-show="myTeamForm.$dirty">
                                      <span ng-show="myTeamForm.teamName.$error.required">This is a required field</span>
                                  </div>
                              </div>
                          </div>
                      </div>
                        
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Country</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="teamctrl.newTeam.country" name="country" class="form-control input-sm" required/>
                                  <div class="has-error" ng-show="myTeamForm.$dirty">
                                      <span ng-show="myTeamForm.country.$error.required">This is a required field</span>
                                  </div>
                              </div>
                          </div>
                      </div>

                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Home Stadium</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="teamctrl.newTeam.homeStadium" class="form-control input-sm" name="stadium"  required/>
                                  <div class="has-error" ng-show="myTeamForm.$dirty">
                                      <span ng-show="myTeamForm.stadium.$error.required">This is a required field</span>
                                  </div>
                              </div>
                          </div>
                      </div>
                      
                      <div class="row">
                          <div class="form-group col-md-12">
                              <label class="col-md-2 control-lable" for="file">Wealth</label>
                              <div class="col-md-7">
                                  <input type="text" ng-model="teamctrl.newTeam.teamWealth" required name="wealth" class="form-control input-sm"/>
                                  <div class="has-error" ng-show="myTeamForm.$dirty">
                                      <span ng-show="myTeamForm.wealth.$error.required">This is a required field</span>
                                  </div>
                              </div>
                          </div>
                      </div>
                      
                      <div class="row">
	                      <div class="form-actions floatRight">
	                      		 <button type="button" ng-click="teamctrl.saveTeam('save')" class="btn btn-success">SAVE</button>
                      		</div>
                      		
                      		<div class="form-actions floatRight">
	                      		 <button type="button" ng-click="teamctrl.saveTeam()" class="btn btn-primary">UPDATE</button>
                      		</div>
                      </div>
 					<div ng-if="teamctrl.newTeam.teamId !== '' "class="alert alert-success">
                      	{{teamctrl.message}}
                      </div>
		                </form>
		              </div>
				</div>
			</form>
		</div>
		</div></div>
	</body>
</html>