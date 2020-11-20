package com.cg.jpa_healthassist.test;

import com.cg.jpa_healthassist.dao.IDoctorDao;
import com.cg.jpa_healthassist.daoImpl.DoctorDaoImpl;
import com.cg.jpa_healthassist.model.Doctor;
public class DoctorDaoImpl_FindDoctor_Test {
	
	public static void main(String[] args){
		IDoctorDao doctorDao=new DoctorDaoImpl();
		Doctor doctor = doctorDao.findByDoctorId(768543698L);
		System.out.println(doctor);
	}
}
