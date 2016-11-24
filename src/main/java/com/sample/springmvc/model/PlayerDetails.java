package com.sample.springmvc.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/*@Entity
@Table(name="PLAYER_DETAILS")*/
public class PlayerDetails {
	
	private Integer playerDetailId;
	private String fullName;
	private Double height;
	private Double weight;
	private Date DOB;
	
	private Set<Team> formerClubs;

	
	@Id
	@GeneratedValue
	public Integer getPlayerDetailId() {
		return playerDetailId;
	}

	public void setPlayerDetailId(Integer playerDetailId) {
		this.playerDetailId = playerDetailId;
	}

	@Column(name="FULLNAME", nullable=false)
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name="HEIGHT", nullable=false)
	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	@Column(name="WEIGHT", nullable=false)
	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	@Column(name="DOB", nullable=false)
	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public Set<Team> getFormerClubs() {
		return formerClubs;
	}

	public void setFormerClubs(Set<Team> formerClubs) {
		this.formerClubs = formerClubs;
	}
	
	
	
	

}
