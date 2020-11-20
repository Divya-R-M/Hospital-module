package com.cg.jpa_healthassist.serviceImpl;

import com.cg.jpa_healthassist.model.Doctor;
import com.cg.jpa_healthassist.model.Patient;
import com.cg.jpa_healthassist.service.IDoctorService;
import com.cg.jpa_healthassist.exception.DoctorNotFoundException;
import com.cg.jpa_healthassist.daoImpl.DoctorDaoImpl;

public class DoctorServiceImpl implements IDoctorService {
	DoctorDaoImpl doctorDao = new DoctorDaoImpl();

	/*
	 * This method is to call the method in the DAO layer in this service layer for
	 * adding new patient medical history/ public void persist(Doctor doctor) {
	 * doctorDao.persist(doctor); } /** This method is to call the method in the DAO
	 * layer in this service layer for viewing the medical history of the patient
	 * 
	 * @throws PatientNotFoundException
	 **/
	public Doctor findByDoctorId(long id) throws DoctorNotFoundException {
		return doctorDao.findByDoctorId(id);
	}

	/*
	 * This method is to call the method in the DAO layer in this service layer for
	 * viewing the medical all the history of the patient
	 */
	public void removeDoctor(long doctorId) throws DoctorNotFoundException {
		doctorDao.removeDoctor(doctorId);
	}

	public void addDoctor(Doctor doctor) {
		doctorDao.addDoctor(doctor);
	}

	public boolean update(Doctor doctor, String specialization) {
		return doctorDao.update(doctor, specialization);
	}

	public void persist(Doctor doctor) {
		doctorDao.persist(doctor);

	}

	public void updateDoctorDetails(int doctorId1, Doctor doctor1, int option) {
		doctorDao.update(doctor1, 9876234176L);

	}
		
	}