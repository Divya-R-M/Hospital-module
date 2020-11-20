package com.cg.jpa_healthassist.service;
import com.cg.jpa_healthassist.model.Patient;
public interface IPatientService {
	

		public interface IPatientDAO {

				/**
				 * This method will save the data of the patient in database.
				 * @param patient, Instance of patient to persist.
				 */
				public void persist(Patient patient);
				
				/**
				 * Search the patient with given id in the db.
				 * @param id of the patient to search.
				 * @return the instance of patient if present else return null.
				 */
				public Patient findByPatientId(long patientId);
				
				/**
				 * add the given instance of patient into the database. 
				 * @param patient id to remove.
				 */
				public void removePatient(long patientId);
				
				/**
				 * Update the patient inside database
				 * @param id of the patient.
				 * @return true if successfully updated else return false.
				 */
				public boolean update(Patient patient, long patientPhoneNumber);
			}

}
