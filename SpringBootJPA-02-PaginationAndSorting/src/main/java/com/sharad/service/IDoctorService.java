package com.sharad.service;

import com.sharad.entity.Doctor;


public interface IDoctorService {
	 public Iterable<Doctor>showDoctorBySorting(boolean asc,String... properties);
	
}