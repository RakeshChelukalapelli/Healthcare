package com.slokam.da.hc.service;

import java.util.List;

import com.slokam.da.hc.entity.Patient;
import com.slokam.da.hc.exception.PatientException;

public interface IPatientService {

	 public List<Patient> getAllPatients(String sortBy) throws PatientException;
	 public void savePatient(Patient patient) throws PatientException;
	 public Patient getPatientById(Integer id) throws PatientException;
	 public abstract List<String> getDoctorNamesByPatientName(String name)throws PatientException;
}
