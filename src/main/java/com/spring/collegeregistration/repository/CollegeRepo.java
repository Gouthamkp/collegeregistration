
package com.spring.collegeregistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.spring.collegeregistration.entity.College;

public interface CollegeRepo extends JpaRepository<College, Long> {
	
	
	public College findByCollegeid(String collegeid);
	
	@Query("SELECT u FROM College u WHERE u.collegeid= ?1")
	public College findCollegeDetailsByCollegeid(String collegeid);
	
	
}
