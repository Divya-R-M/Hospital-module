package com.cg.jpa_healthassist.serviceImpl;
import com.cg.jpa_healthassist.daoImpl.PatientDAOImpl;
import com.cg.jpa_healthassist.model.Patient;

public class PatientServiceImpl {
	/*author: Charushi and Divya
	desc:Implementing services present in PatientService
	*/
	PatientDAOImpl patientDao=new PatientDAOImpl();
	
	public void persist(Patient patient) {
		patientDao.persist(patient);
	}
	public Patient findByPatientId(long patientId) {
		return patientDao.findByPatientId(patientId);
	}
	public void removePatient(long patientId) {
		patientDao.removePatient(patientId);
	}
	public boolean updatePatient(Patient patient, long patientPhoneNumber) {
		return patientDao.updatePatient(patient,patientPhoneNumber);
	}
}
