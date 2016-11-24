package com.sample.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*@Entity
@Table(name="PLAYER")*/
public class Player {

	
	private Integer playerId;
	
	private String playerName;
	
	private String position;
	
	private String alternatePosition;
	
	private String nationality;
	
	private Double weeklywage;
	
	private Double value;
	
	private Team team;
	
	private PlayerDetails playerDetails;
	
	private Integer totalClubGoals;
	
	private Integer totalIntnlGoals;
	
	private Integer totalClubAssists;
	
	private Integer totalIntnlAssists;

	public Player() {
		super();
	}

	@Id
	@GeneratedValue
	public Integer getPlayerId() {
		return playerId;
	}

	public void setPlayerId(Integer playerId) {
		this.playerId = playerId;
	}

	@Column(name="PLAYER_NAME", nullable=false,length=30)
	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	
	@Column(name="PLAYER_POSITION", nullable=false,length=15)
	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	@Column(name="PLAYER_ALTR_POSITION", nullable=true,length=15)
	public String getAlternatePosition() {
		return alternatePosition;
	}

	public void setAlternatePosition(String alternatePosition) {
		this.alternatePosition = alternatePosition;
	}
	
	@Column(name="NATIONALITY", nullable=false,length=20)
	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	
	@Column(name="WEEKLY_WAGE", nullable=true,length=10)
	public Double getWeeklywage() {
		return weeklywage;
	}

	public void setWeeklywage(Double weeklywage) {
		this.weeklywage = weeklywage;
	}

	@Column(name="VALUE", nullable=true,length=20)
	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	@Column(name="TOTAL_CLUB_GOALS", nullable=true,length=5)
	public Integer getTotalClubGoals() {
		return totalClubGoals;
	}

	public void setTotalClubGoals(Integer totalClubGoals) {
		this.totalClubGoals = totalClubGoals;
	}

	@Column(name="TOTAL_INTL_GOALS", nullable=true,length=5)
	public Integer getTotalIntnlGoals() {
		return totalIntnlGoals;
	}

	public void setTotalIntnlGoals(Integer totalIntnlGoals) {
		this.totalIntnlGoals = totalIntnlGoals;
	}

	@Column(name="TOTAL_CLUB_ASSISTS", nullable=true,length=5)
	public Integer getTotalClubAssists() {
		return totalClubAssists;
	}

	public void setTotalClubAssists(Integer totalClubAssists) {
		this.totalClubAssists = totalClubAssists;
	}

	@Column(name="TOTAL_INTL_ASSISTS", nullable=true,length=5)
	public Integer getTotalIntnlAssists() {
		return totalIntnlAssists;
	}

	public void setTotalIntnlAssists(Integer totalIntnlAssists) {
		this.totalIntnlAssists = totalIntnlAssists;
	}

	public PlayerDetails getPlayerDetails() {
		return playerDetails;
	}

	public void setPlayerDetails(PlayerDetails playerDetails) {
		this.playerDetails = playerDetails;
	}
	
}
