package com.employee.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Login")
public class Login {

	@Id
	@Column(name="emailId")
	private String emailId;

	@Column(name="password")
	private String password;

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Login [emailId=" + emailId + ", password=" + password + "]";
	}

	public Login(String emailId, String password) {
		super();
		this.emailId = emailId;
		this.password = password;
	}

	public Login() {
		super();
	}

	
	}