package com.slokam.da.hc.service;

import com.slokam.da.hc.entity.Visiting;
import com.slokam.da.hc.exception.PatientException;

public interface IVisitingService {
	public void visit(Visiting visiting) throws PatientException;
}
