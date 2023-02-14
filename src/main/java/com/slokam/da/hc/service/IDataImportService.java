package com.slokam.da.hc.service;

import com.slokam.da.hc.exception.PatientException;

public interface IDataImportService {
	public void importData(String filePath) throws  PatientException;
}
