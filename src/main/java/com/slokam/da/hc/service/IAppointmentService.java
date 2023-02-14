package com.slokam.da.hc.service;

import com.slokam.da.hc.entity.Appointment;
import com.slokam.da.hc.exception.PatientException;

public interface IAppointmentService {
	public abstract void createAppointment(Appointment appointment) throws PatientException;
}
