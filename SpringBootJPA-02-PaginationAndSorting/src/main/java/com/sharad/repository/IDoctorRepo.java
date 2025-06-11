package com.sharad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sharad.entity.Doctor;

@Repository
public interface IDoctorRepo extends JpaRepository<Doctor, Integer> {
	
	
	
	

}
