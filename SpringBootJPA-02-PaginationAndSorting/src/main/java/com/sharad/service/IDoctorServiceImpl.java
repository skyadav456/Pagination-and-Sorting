package com.sharad.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.sharad.entity.Doctor;
import com.sharad.repository.IDoctorRepo;

@Service
public class IDoctorServiceImpl implements IDoctorService {
	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public Iterable<Doctor> showDoctorBySorting(boolean asc, String... properties) {
		Sort sort=Sort.by(asc?Direction.ASC:Direction.DESC,properties);
		Iterable<Doctor> it= doctorRepo.findAll(sort);
		return it;
	}

	@Override
	public Page<Doctor> showDoctorinfoByPageNo(int pageNo, int pageSize) {
		Pageable pageable=PageRequest.of(pageNo, pageSize);
		Page<Doctor> page = doctorRepo.findAll(pageable);
		return page;
	}



	

}
