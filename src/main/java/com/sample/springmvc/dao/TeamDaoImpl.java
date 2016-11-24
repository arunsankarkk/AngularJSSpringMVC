package com.sample.springmvc.dao;

import java.io.Serializable;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.sample.springmvc.model.Team;

@Repository
public class TeamDaoImpl extends AbstractDao<Integer, Team> implements TeamDao {

	@Override
	@Transactional
	public Team saveTeam(Team team) {
		Serializable id = save(team);
		team.setTeamId((Integer) id);
		return team;
	}

	@Override
	@Transactional
	public void updateTeam(Team team) {
		update(team);
	}

	@Override
	public List<Team> getTeamList() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
