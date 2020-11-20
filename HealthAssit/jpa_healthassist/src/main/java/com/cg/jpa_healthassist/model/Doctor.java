package com.cg.jpa_healthassist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
/*author: Charushi and Divya
desc:Doctor Model
*/ 
@Entity
@Table(name="doctor")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long doctorId;
	private String doctorName;
	private String specialization;
	private String department;
	private long doctorPhNo;

	public Doctor(String doctorName, String specialization, String department, long doctorPhNo) {
		super();
		this.doctorName = doctorName;
		this.specialization = specialization;
		this.department = department;
		this.doctorPhNo = doctorPhNo;
	}

	public Doctor() {
		super();
	}


	public long getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(long doctorId) {
		this.doctorId = doctorId;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public long getDoctorPhNo() {
		return doctorPhNo;
	}

	public void setDoctorPhNo(long doctorPhNo) {
		this.doctorPhNo = doctorPhNo;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", specialization=" + specialization
				+ ", department=" + department + ", doctorPhNo=" + doctorPhNo + "]";
	}


}
