package com.slokam.da.hc.service;

import com.slokam.da.hc.entity.Doctor;
import com.slokam.da.hc.entity.Visiting;
import com.slokam.da.hc.exception.PatientException;

public interface IDoctorService {
	public void save(Doctor doctor) throws PatientException;
}
