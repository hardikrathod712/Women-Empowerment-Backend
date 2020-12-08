package com.lti.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TrainingSectors")
public class TrainingSector {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sectorId;
	private String ngoName;
	private String sectorName;
	private String sectorDescription;
	@Temporal(TemporalType.DATE)
	private Date startDate;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	private Address trainingAddress;
	private int trainingSeats;

	public TrainingSector() {

	}

	public int getSectorId() {
		return sectorId;
	}

	public void setSectorId(int sectorId) {
		this.sectorId = sectorId;
	}

	public String getNgoName() {
		return ngoName;
	}

	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
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

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Address getTrainingAddress() {
		return trainingAddress;
	}

	public void setTrainingAddress(Address trainingAddress) {
		this.trainingAddress = trainingAddress;
	}

	public int getTrainingSeats() {
		return trainingSeats;
	}

	public void setTrainingSeats(int trainingSeats) {
		this.trainingSeats = trainingSeats;
	}

}
