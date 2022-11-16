package com.employee.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;



@Entity
@Table(name="Registration")
public class People {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="Id")
	private long id;
	
	@Column(name="firstname")
	private String firstname;
	
	@Column(name="lastname")
	private String lastname;
	
	@JsonFormat(pattern = "yyyy-mm-dd",shape = Shape.STRING)
	@Column(name="birthday")
	private String birthday;

	@Column(name="emailId")
	private String emailId;
	
	@Column(name="mobilenumber")
	private Long mobilenumber;
	
	@Column(name="employeeid")
	private String employeeid;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="skills")
	private String skills;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getbirthday() {
		return birthday;
	}

	public void setbirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getEmail() {
		return emailId;
	}

	public void setEmail(String email) {
		this.emailId = email;
	}

	public Long getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(String employeeid) {
		this.employeeid = employeeid;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	@Override
	public String toString() {
		return "People [firstname=" + firstname + ", lastname=" + lastname + ", birthday=" + birthday + ", email="
				+ emailId + ", mobilenumber=" + mobilenumber + ", employeeid=" + employeeid + ", gender=" + gender
				+ ", skills=" + skills + "]";
	}

	public People(String firstname, String lastname, String birthday, String email, Long mobilenumber,
			String employeeid, String gender, String skills) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthday = birthday;
		this.emailId = email;
		this.mobilenumber = mobilenumber;
		this.employeeid = employeeid;
		this.gender = gender;
		this.skills = skills;
	}

	public People() {
		super();
	}
	
	
}
