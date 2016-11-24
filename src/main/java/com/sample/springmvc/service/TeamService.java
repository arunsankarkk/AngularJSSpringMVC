package com.sample.springmvc.service;

import java.util.List;

import com.sample.springmvc.model.Team;

public interface TeamService {

	Team saveTeam(Team team);
	
	void updateTeam(Team team);
	
	List<Team> getTeamList();
}
