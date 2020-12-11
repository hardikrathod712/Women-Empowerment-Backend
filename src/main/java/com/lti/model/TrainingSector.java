package com.lti.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TrainingSectors")
public class TrainingSector {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sectorId;
	private String sectorName;
	private String sectorDescription;
	
	@OneToMany(mappedBy="sector")
	private List<NGO> ngo=new ArrayList<NGO>();
	
	public TrainingSector() {

	}

	public int getSectorId() {
		return sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	public String getSectorName() {
		return sectorName;
	}

	public void setSectorName(String sectorName) {
		this.sectorName = sectorName;
	}

	public String getSectorDescription() {
		return sectorDescription;
	}

	public void setSectorDescription(String sectorDescription) {
		this.sectorDescription = sectorDescription;
	}
	
	
}
