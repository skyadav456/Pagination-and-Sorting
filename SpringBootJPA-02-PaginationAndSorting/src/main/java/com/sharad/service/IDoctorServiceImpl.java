package com.sharad.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

import org.springframework.beans.factory.annotation.Autowired;
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



	

}
