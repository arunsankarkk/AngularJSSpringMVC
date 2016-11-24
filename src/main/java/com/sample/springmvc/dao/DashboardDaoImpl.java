package com.sample.springmvc.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sample.springmvc.model.Team;

@Repository("dashboardDaoImpl")
public class DashboardDaoImpl extends AbstractDao<Integer, Team> implements DashboardDao {

	
	@Override
	public List<Team> getTeamList() {
		return getTeamList();
	}

}
