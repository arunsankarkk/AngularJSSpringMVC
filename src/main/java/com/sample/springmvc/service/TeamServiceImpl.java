package com.sample.springmvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.springmvc.dao.TeamDao;
import com.sample.springmvc.model.Team;

@Service("teamService")
public class TeamServiceImpl implements TeamService {
	
	@Autowired
	private TeamDao teamDao;

	@Override
	public Team saveTeam(Team team) {
		return teamDao.saveTeam(team);
	}

	@Override
	public void updateTeam(Team team) {
		teamDao.updateTeam(team);		
	}

	@Override
	public List<Team> getTeamList() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
