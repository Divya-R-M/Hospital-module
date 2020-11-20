package com.cg.jpa_healthassist.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import com.cg.jpa_healthassist.daoImpl.DoctorDaoImpl;
import com.cg.jpa_healthassist.model.Doctor;

public class DoctorDaoImplTest {

	DoctorDaoImpl doctorDao = new DoctorDaoImpl();
	Doctor doctor=new Doctor();
	@Test
	
	public void addDoctorTest() {
		doctor.setDoctorId(985444);
		doctor.setDoctorName("Shiva");
		doctor.setDepartment("Surgical");
		doctor.setSpecialization("Eye");
		doctor.setDoctorPhNo(9865467852L);
		assertNotNull(doctor.getDoctorId());
	}
	@Test
    public void test2_findByDocorid_ShouldReturnDoctorwithGivenId() {
		Doctor doctorFound=doctorDao.findByDoctorId(2);
		assertEquals("Alice",doctorFound.getDoctorName());
	}

	/*
	 * Test the update doctor method of doctor and checks whether the entered id and specialization is updated or not
	 */
	@Test
	public void test3_update_GivenIdAndSpecialization() {
		doctorDao.update(doctor,"Surgeon");
		Doctor doctor=doctorDao.findByDoctorId(100);
		assertEquals("Surgeon",doctor.getSpecialization());
	}
	
	@Test
	public void testDoctorId()
	{
		doctor.setDoctorId(1);
		assertEquals(doctor.getDoctorId(),1);
		assertNotEquals(doctor.getDoctorId(),3);
	}
	@Test
	public void testDoctorName() {
		doctor.setDoctorName("Anmol");
		assertEquals(doctor.getDoctorName(),"Anmol");
		assertNotEquals(doctor.getDoctorName(),"Ayush");
	}
	@Test
	public void testSpecialization() {
		doctor.setSpecialization("Skin");
		assertEquals(doctor.getSpecialization(),"Skin");
		assertNotEquals(doctor.getSpecialization(),"Surgeon");
	}
	@Test
	public void testDoctorPhNo() {
		doctor.setDoctorPhNo(7028291878L);
		assertEquals(doctor.getDoctorPhNo(),"7028291878");
		assertNotEquals(doctor.getDoctorPhNo(),"8922372222");
	}
}
