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
	private Long account_number;
	@Temporal(TemporalType.DATE)
	private Date registration_date;
	private Long balance;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "userId", referencedColumnName = "userId")
    private User user;
	
	
	public String getAccount_type() {
		return account_type;
	}

	public void setAccount_type(String account_type) {
		this.account_type = account_type;
	}

	public Long getAccount_number() {
		return account_number;
	}

	public void setAccount_number(Long account_number) {
		this.account_number = account_number;
	}

	public Date getRegistration_date() {
		return registration_date;
	}

	public void setRegistration_date(Date registration_date) {
		this.registration_date = registration_date;
	}
	
	public int getSukanyaAccountId() {
		return sukanyaAccountId;
	}

	public void setSukanyaAccountId(int sukanyaAccountId) {
		this.sukanyaAccountId = sukanyaAccountId;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Account_type=" + account_type + ", account_number=" + account_number + ", registration_date="
				+ registration_date + "]";
	}

}
