package com.springrest.service;

import java.util.Comparator;

import com.springrest.entity.Doctor;

public class ComparatorCategory implements Comparator<Doctor> {

	@Override
	public int compare(Doctor o1, Doctor o2) {
		if(o1.getExp()>o2.getExp()) {
			return -1;
		}
		else if(o1.getExp()<o2.getExp()) {
			return +1;
		}
		return 0;
	}

	

}
