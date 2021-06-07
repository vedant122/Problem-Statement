package com.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Table(name="details" , schema="mobilewebsite")
@Entity
public class Models {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@Column(name="name",nullable = false)
	String Name;
	
	@Column(name="surname",nullable = false)
	String Surname;
	
	@Column(name="mobilenumber",nullable = false)
	String MobileNumber;
	
	@Column(name="flatbuildingnumber",nullable = false)
	String FBNo;
	
	@Column(name="address",nullable = false)
	String Address;
	
	@Column(name="city",nullable = false)
	String City;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSurname() {
		return Surname;
	}

	public void setSurname(String surname) {
		Surname = surname;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getFBNo() {
		return FBNo;
	}

	public void setFBNo(String fBNo) {
		FBNo = fBNo;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public Models() {
		// TODO Auto-generated constructor stub
	}
}
