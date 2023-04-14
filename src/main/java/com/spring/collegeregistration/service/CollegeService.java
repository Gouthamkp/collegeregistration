package com.spring.collegeregistration.service;

import java.util.List;

import com.spring.collegeregistration.dto.CollegeDto;
import com.spring.collegeregistration.entity.College;

public interface CollegeService {
	
	public College collegeRegistration(CollegeDto collegeDto);
	
	public List<College> getAllCollegeDetails();
	
	public College collegeDetails(String collegeid);
	
	public College updateCollegeDetails(String collegeid,String collegename,String address,String telephoneNo,String aboutus);

	public String deleteCollegeDetails(String collegeid);
}
