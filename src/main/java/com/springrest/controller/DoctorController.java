package com.springrest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.dto.UpdateDoctor;
import com.springrest.entity.Doctor;
import com.springrest.service.DoctorService;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

	@Autowired
	private DoctorService doctorservice;

	@PostMapping("/saveDoctor")
	public Doctor saveDoctor(@RequestBody Doctor doctor) {
		return doctorservice.saveDoctor(doctor);
	}

	@GetMapping("/fetch")
	public List<Doctor> getAllDoctors() {
		return doctorservice.getAllDoctors();

	}

	@GetMapping("/fetch/{category}")
	public List<Doctor> getDoctorByCateogry(@PathVariable String category) {
		return doctorservice.getDoctorByCategory(category);
	}

	@PutMapping("/update/{id}")
	public Doctor updateDoctor(@RequestBody Doctor doctor, @PathVariable Integer id) {
		return doctorservice.updateDoctor(doctor, id);
	}

}
