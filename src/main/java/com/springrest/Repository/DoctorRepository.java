package com.springrest.Repository;

import org.springframework.data.repository.CrudRepository;

import com.springrest.entity.Doctor;

public interface DoctorRepository extends CrudRepository<Doctor, Integer>{

}
