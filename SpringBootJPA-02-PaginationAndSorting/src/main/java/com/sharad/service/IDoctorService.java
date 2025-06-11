package com.sharad.service;

import org.springframework.data.domain.Page;

import com.sharad.entity.Doctor;


public interface IDoctorService {
	 public Iterable<Doctor>showDoctorBySorting(boolean asc,String... properties);
	 public Page<Doctor>showDoctorinfoByPageNo(int pageNo, int pageSize);
	
}