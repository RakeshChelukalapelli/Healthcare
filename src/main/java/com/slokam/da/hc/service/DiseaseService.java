package com.slokam.da.hc.service;

import com.slokam.da.hc.entity.Disease;
import com.slokam.da.hc.exception.PatientException;

public interface DiseaseService {
	public abstract void addDisease(Disease disease) throws PatientException;
}
