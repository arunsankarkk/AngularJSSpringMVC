package com.sample.springmvc.dao;

import java.util.List;

import com.sample.springmvc.model.Team;

public interface TeamDao {

	Team saveTeam(Team team);
	
	void updateTeam(Team team);
	
	List<Team> getTeamList();
}
