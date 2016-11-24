package com.sample.springmvc.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.springmvc.dao.DashboardDao;
import com.sample.springmvc.model.Team;

@Service("dashboardService")
public class DashboardServiceImpl implements DashboardService {

	Collection<Team> teamList = new ArrayList<>();

	@Autowired
	private DashboardDao dashboardDao;
	
	@Override
	public List<Team> getTeamList() {
		return createTempTeams();
	}

	private List<Team> createTempTeams() {
		List<Team> teams = new ArrayList<>();
		
		Team team1 = new Team();
		team1.setTeamId(1);
		team1.setTeamName("MANCHESTER UNITED");
		team1.setCountry("ENGLAND");
		team1.setHomeStadium("OLD TRAFFORD");
		team1.setTeamWealth(123456789);
		
		teams.add(team1);
		return teams;
	}
}
