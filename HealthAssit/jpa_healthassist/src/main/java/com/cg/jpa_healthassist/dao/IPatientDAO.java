package com.cg.jpa_healthassist.dao;

import com.cg.jpa_healthassist.model.Patient;

import java.util.List;

public interface IPatientDAO {
	/*author: Charushi and Divya
	desc:Functionalities present in patient class
	*/
	public void persist(Patient patient);

	public Patient findByPatientId(long id);

	public List<Patient> findAll();

	public boolean update(Patient patient, String patientAddress);

	public boolean updatePatient(Patient patient, long patientPhoneNumber);

	public void removePatient(long patientId);
}