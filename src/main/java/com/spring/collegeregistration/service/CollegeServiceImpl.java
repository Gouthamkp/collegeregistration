package com.spring.collegeregistration.service;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.collegeregistration.dto.CollegeDto;
import com.spring.collegeregistration.entity.College;
import com.spring.collegeregistration.repository.CollegeRepo;


@Service
public class CollegeServiceImpl implements CollegeService{

	@Autowired
	CollegeRepo collegeRepo;
	
	@Override
	
	public College collegeRegistration(CollegeDto collegeDto) {
		
		College registration= new College();
		
		registration.setCollegename(collegeDto.getCollegename());
		registration.setAddress(collegeDto.getAddress());
		registration.setTelephoneNo(collegeDto.getTelephoneNo());
		registration.setAboutus(collegeDto.getAboutus());
		registration.setAcademis(collegeDto.getAcademis());
		registration.setBranches(collegeDto.getBranches());
		
		
		Random random= new Random();
		int collegeid= random.nextInt()+1;
		String CollegeID= "CID" + collegeid;
		registration.setCollegeid(CollegeID);
		registration= collegeRepo.save(registration);
		return registration;
	}

	@Override
	public College collegeDetails(String collegeid) {
		
		College college= collegeRepo.findByCollegeid(collegeid);
	
		return college;
	}

	@Override
	public College updateCollegeDetails(String collegeid, String collegename, String address, String telephoneNo,
			String aboutus) {
		College college= collegeRepo.findCollegeDetailsByCollegeid(collegeid);
		
		if(college!=null) 
		{
			college.setCollegename(collegename);
			college.setAddress(address);
			college.setTelephoneNo(telephoneNo);
			college.setAboutus(aboutus);
			college= collegeRepo.save(college);
		}
		else
		{
			System.out.println("No details found");
			
		}
		return college;
	}

	@Override
	public String deleteCollegeDetails(String collegeid) {
		
		College college= collegeRepo.findCollegeDetailsByCollegeid(collegeid);
		collegeRepo.delete(college);
		return "deleted";
	}

	@Override
	public List<College> getAllCollegeDetails() {
		
		List<College> college= collegeRepo.findAll();
		return college;
	}
	

}
