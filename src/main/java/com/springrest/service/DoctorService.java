package com.springrest.service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springrest.Repository.DoctorRepository;
import com.springrest.entity.Doctor;

@Service
public class DoctorService {
	@Autowired
	private DoctorRepository repo;

	public Doctor saveDoctor(Doctor s) {
		return repo.save(s);
	}

	public List<Doctor> getAllDoctors() {
		return (List<Doctor>) repo.findAll();
	}

	public Doctor updateDoctor(Doctor d, Integer id) {

		Optional<Doctor> docterDb = this.repo.findById(id);

		Doctor doctorUpdate = docterDb.get();
		doctorUpdate.setSalary(d.getSalary());
		repo.save(d);
		return doctorUpdate;

	}

	public List<Doctor> getDoctorByCategory(String category) {
		List<Doctor> l = (List<Doctor>) repo.findAll();
		List<Doctor> l1 = new ArrayList<Doctor>();
		for (Doctor s : l) {
			if (s.getCategory().equals(category)) {
				l1.add(s);
			}
		}
		Collections.sort(l1, new ComparatorCategory());
		return l1;
	}

}
