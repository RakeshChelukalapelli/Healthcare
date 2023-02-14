package com.slokam.da.hc.service.impl;

import java.util.Date;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.slokam.da.hc.dao.AppointmentDAO;
import com.slokam.da.hc.dao.PatientDAO;
import com.slokam.da.hc.entity.Appointment;
import com.slokam.da.hc.entity.Patient;
import com.slokam.da.hc.exception.PatientException;
import com.slokam.da.hc.service.IAppointmentService;
@Service
public class AppointmentServiceImpl implements IAppointmentService{
	private static Logger LOGGER = LoggerFactory.getLogger(AppointmentServiceImpl.class);
	@Autowired
	private AppointmentDAO appointDao;
	
	@Autowired
	private PatientDAO patientDao;
	
	@Override
	public void createAppointment(Appointment appointment) throws PatientException {
		LOGGER.debug("Entered into createAppointment");
		
		try {
			if(appointment!=null) {
				appointment.setTaken(new Date());
				LOGGER.debug("Appointment Details::"+appointment);
				if(appointment.getPatient()!=null && appointment.getPatient().getId()!=null) {
					Optional<Patient> patientFromDBOptional = patientDao.findById(appointment.getPatient().getId());
					if(patientFromDBOptional.isPresent()) {
						appointment.setPatient(patientFromDBOptional.get());
					}
				}
				appointDao.save(appointment);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new PatientException("DB problem", e);
		}
		LOGGER.debug("Exit from createAppointment");
	}
	
}
