package com.spring.collegeregistration.entity;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class College {
	@Id
	@GeneratedValue
	private Long id;
	private String collegename;
	private String collegeid;
	private String address;
	private String telephoneNo;
	private String aboutus;
    @ElementCollection(targetClass=String.class)
	private List<String> academis;
    @ElementCollection(targetClass=String.class)
	private List<String> branches;

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public String getCollegeid() {
		return collegeid;
	}
	public void setCollegeid(String collegeid) {
		this.collegeid = collegeid;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getTelephoneNo() {
		return telephoneNo;
	}
	public void setTelephoneNo(String telephoneNo) {
		this.telephoneNo = telephoneNo;
	}
	public String getAboutus() {
		return aboutus;
	}
	public void setAboutus(String aboutus) {
		this.aboutus = aboutus;
	}
	public List<String> getAcademis() {
		return academis;
	}
	public void setAcademis(List<String> academis) {
		this.academis = academis;
	}
	public List<String> getBranches() {
		return branches;
	}
	public void setBranches(List<String> branches) {
		this.branches = branches;
	}


}
