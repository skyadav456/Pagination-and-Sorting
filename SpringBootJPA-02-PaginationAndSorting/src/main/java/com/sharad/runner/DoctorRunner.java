package com.sharad.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sharad.service.IDoctorService;

@Component
public class DoctorRunner implements CommandLineRunner {
	@Autowired
	IDoctorService doctorService;

	@Override
	public void run(String... args) throws Exception {
		
		/*	try {
				doctorService.showDoctorBySorting(true, "docName","specialization").forEach(System.out::println);;
			}catch(Exception e){
				e.printStackTrace();
			}*/
		
		try {
			doctorService.showDoctorinfoByPageNo(1, 5).forEach(System.out::println);;
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	}


