package com.sample.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sample.springmvc.model.Team;
import com.sample.springmvc.service.TeamService;

@RestController
public class TeamRestController {
	
	@Autowired
	private TeamService teamService;
	
	@RequestMapping(path="/loadTeamList", method=RequestMethod.GET)
	public ResponseEntity<List<Team>> getTeamList() {
		List<Team> teamList = teamService.getTeamList();
		
		if(teamList.isEmpty()){
            return new ResponseEntity<List<Team>>(HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }
        return new ResponseEntity<List<Team>>(teamList,HttpStatus.OK);
	}
	
	@RequestMapping(path="/saveTeam", method=RequestMethod.POST)
	public ResponseEntity<Team> saveTeam(@RequestBody Team team )  {
		team = teamService.saveTeam(team);
		return new ResponseEntity<Team>( team, HttpStatus.CREATED);
	}
	
	@RequestMapping(path="/updateTeam", method=RequestMethod.POST)
	public ResponseEntity<List<Team>> updateTeam(@RequestBody Team team )  {
		teamService.updateTeam(team);
		return new ResponseEntity<List<Team>>(HttpStatus.CREATED);
	}
	

}
