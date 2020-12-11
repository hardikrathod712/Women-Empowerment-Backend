package com.lti.model;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class SukanyaAccount{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sukanyaAccountId;
	private String account_type;
	private String account_number;
	@Temporal(TemporalType.DATE)
	private Date registration_date;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
	
	
	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public String getAccount_number() {
		return account_number;
	}

	public void setAccount_number(String account_number) {
		this.account_number = account_number;
	}

	public Date getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}
	
	
	
	@Override
	public String toString() {
		return "Account_type=" + account_type + ", account_number=" + account_number + ", registration_date="
				+ registration_date + "]";
	}

}
