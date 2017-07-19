package com.cps.entity;

import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "user_details")
public class UserDetails {

	@Id
	@Column(name="id")
	@GeneratedValue(generator="userId", strategy= GenerationType.SEQUENCE )
	@SequenceGenerator(name="userId", sequenceName="seq_userId",allocationSize = 1)
	private Integer id;

	@Basic
	@Column(name = "first_name")
	private String firstName;

	@Basic
	@Column(name = "last_name")
	private String lastName;
	
	@Basic
	@Column(name = "password")
	private String password;

	@Basic
	@Column(name = "role")
	private String role;

	@Basic
	@Column(name = "email")
	private String email;
	
	@Basic
	@Column(name = "dob")
	private Date dob;
	
	@Basic
	@Column(name = "mobile")
	private String mobile;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	

}
