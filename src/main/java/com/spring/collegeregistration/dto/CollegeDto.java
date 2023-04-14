package com.spring.collegeregistration.dto;

import java.util.List;

public class CollegeDto {
	private String collegename;
	private String address;
	private String telephoneNo;
	private String aboutus;
	private List<String> academis;
	private List<String> branches;

	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
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
