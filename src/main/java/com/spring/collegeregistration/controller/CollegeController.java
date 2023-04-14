package com.spring.collegeregistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.collegeregistration.dto.CollegeDto;
import com.spring.collegeregistration.entity.College;
import com.spring.collegeregistration.service.CollegeServiceImpl;

@RestController
public class CollegeController {

	@Autowired
	CollegeServiceImpl collegeServiceImpl;
	
	@PostMapping("collegeRegistraton")
	public ResponseEntity<Object> college(@RequestBody CollegeDto dto)
	{
		return ResponseEntity.ok(collegeServiceImpl.collegeRegistration(dto));
	}
	
	@GetMapping("getAll")
	public List<College> getAllCollegeDetails()
	{
		
		return collegeServiceImpl.getAllCollegeDetails();
	}
	

	@GetMapping(value ="collegeDetails")
	public ResponseEntity<College> collegeDetails(@RequestParam String collegeid)
	{	
		College college= collegeServiceImpl.collegeDetails(collegeid);
		
		if(college!=null && college.getCollegeid()!=null) 
		{
			return ResponseEntity.ok(college);
		}
		else 
		{
			return null;
		}
	}
	
	@GetMapping(value ="updateCollegeDetails")
	public ResponseEntity<College> updateCollegeDetails(@RequestParam String collegeid,@RequestParam String collegename,@RequestParam String address,@RequestParam String telephoneNo,@RequestParam String aboutus)
	{
		College college= collegeServiceImpl.updateCollegeDetails(collegeid, collegename, address, telephoneNo, aboutus);
		return ResponseEntity.ok(college);
	}
	
	@DeleteMapping(value="deleteCollege/{collegeid}")
	public ResponseEntity<String> deleteCollegeDetails(@PathVariable String collegeid)
	{
		return ResponseEntity.ok(collegeServiceImpl.deleteCollegeDetails(collegeid));
	}
	
	
	

}
