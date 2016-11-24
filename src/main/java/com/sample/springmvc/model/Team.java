package com.sample.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TEAM")
public class Team {
	
	private Integer teamId;
	private String teamName;
	private String country;
	private String homeStadium;
	private Integer teamWealth;
	
	public Team() {
		
	}
	
	@Id
	@GeneratedValue
	public Integer getTeamId() {
		return teamId;
	}
	public void setTeamId(Integer teamId) {
		this.teamId = teamId;
	}
	
	@Column(name="TEAM_NAME", nullable=false)
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	
	@Column(name="COUNTRY", nullable=false)
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	@Column(name="HOME_STADIUM", nullable=false)
	public String getHomeStadium() {
		return homeStadium;
	}
	public void setHomeStadium(String homeStadium) {
		this.homeStadium = homeStadium;
	}
	
	@Column(name="TEAM_WEALTH", nullable=false)
	public Integer getTeamWealth() {
		return teamWealth;
	}
	public void setTeamWealth(Integer teamWealth) {
		this.teamWealth = teamWealth;
	}
	
	
}
