package com.java.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity

@Table(name="tbl_emp",uniqueConstraints = @UniqueConstraint(name="email_unique",columnNames = "email_address"))
public class Emp {
	
	@Id
	
	@SequenceGenerator(name="emp_squence",sequenceName = "emp_squence",allocationSize = 1)
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "emp_squence")
	private long id;
	private String ename;
	
	@Column(name="email_address")
	private String email;
	private String password;
	private  String address;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Emp [id=" + id + ", ename=" + ename + ", email=" + email + ", password=" + password + ", address="
				+ address + "]";
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
