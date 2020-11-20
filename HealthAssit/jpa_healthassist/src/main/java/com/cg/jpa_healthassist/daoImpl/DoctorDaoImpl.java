package com.cg.jpa_healthassist.daoImpl;
import javax.persistence.EntityManager;
import com.cg.jpa_healthassist.dao.IDoctorDao;
import com.cg.jpa_healthassist.exception.DoctorNotFoundException;
import com.cg.jpa_healthassist.model.Doctor;
import com.cg.jpa_healthassist.model.Patient;
import com.cg.jpa_healthassist.util.JPAUtil;

	public class DoctorDaoImpl extends JPAUtil implements IDoctorDao {
		/*author: Charushi and Divya
		desc:Implementing functionalities present in dao interface present in doctor class
		*/
		@Override
		public void persist (Doctor doctor) {
			EntityManager em = getEntityManager();
			beginTransaction(em);
			em.persist(doctor);
			commitTransaction(em);
			closeEntityManager(em);
		}
		
		@Override
		public Doctor findByDoctorId(long id) {
			EntityManager em = getEntityManager();
			beginTransaction(em);
			Doctor doctor=em.find(Doctor.class, id);
			commitTransaction(em);
			closeEntityManager(em);
			return doctor;
		}

		@Override
		public void removeDoctor(long doctorId) throws DoctorNotFoundException {
			EntityManager em = getEntityManager();
			beginTransaction(em);
			Doctor doctor = em.find(Doctor.class, doctorId);
			if(doctor!=null) {
				em.remove(doctor);
			}else {
				throw new DoctorNotFoundException("Doctor id is not found");
			}
			commitTransaction(em);
			closeEntityManager(em);
		}
		
			
		@Override
		public boolean update(Doctor doctor, String specialization) {
			EntityManager em = getEntityManager();
			beginTransaction(em);
			Doctor doctorToUpdate=em.find(Doctor.class, doctor.getDoctorId());
			commitTransaction(em);
			closeEntityManager(em);
			if(doctorToUpdate==null) {
				return false;
			}
			else {
				doctorToUpdate.setSpecialization(specialization);
				return true;
			}
			
			}

		@Override
		public void addDoctor(Doctor doctor) {
			EntityManager em = getEntityManager();
			beginTransaction(em);
			em.persist(doctor);
			commitTransaction(em);
			closeEntityManager(em);
		}

		public void update(int i, Patient patient, int j) {
			// TODO Auto-generated method stub
			
		}
   	
	}