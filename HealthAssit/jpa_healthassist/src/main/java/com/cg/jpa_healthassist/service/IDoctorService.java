package com.cg.jpa_healthassist.service;
import com.cg.jpa_healthassist.model.Doctor;
import com.cg.jpa_healthassist.entity.DoctorEntity;
import com.cg.jpa_healthassist.exception.DoctorNotFoundException;
//import com.cg.jpa_healthassist.dao.DoctorDaoImpl;
import java.util.List;
public interface IDoctorService {
	
	public interface IDoctorDAO {
		/*This method will save doctor's data into database
		 * @param doctor, Instance of doctor to persist
	*/	
		public void persist(Doctor doctor);
		
		/*Search doctor with given id in database.
		@param id of doctor to search,
		@return the instance of doctor if present else return null*/
		public Doctor findByDoctorId(long id);
		
		/*Remove the given instance of doctor from database if present.
		@param doctor to remove*/
		
		public void removeDoctor(long id) throws DoctorNotFoundException;
		
		/*Add doctor in the database
		 * @param doctor to add
		 * */
         public void addDoctor(Doctor doctor);
		
		/*
		 * Update the doctor inside database. 
		 * @param specialization of doctor to update
		 */
		public boolean update (Doctor doctor,String specialization);


	}
}