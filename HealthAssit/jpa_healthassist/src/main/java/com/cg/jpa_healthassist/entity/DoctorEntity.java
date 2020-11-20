package com.cg.jpa_healthassist.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

public class DoctorEntity {

	@Entity
	@NamedQuery(name = "findByDoctorId", query = "SELECT c from Doctor c WHERE c.doctorId = :dId")
	@Table(name = "doctor")
	public class doctor implements Serializable {
		private static final long serialVersionUID = 1L;
		@Id
		// @GeneratedValue(strategy=GenerationType.IDENTITY)
		/*
		 * @Column private int doctorId;
		 */
		@Column(name = "DOCTORId")
		private int doctorId;
		@Column
		private String doctorName;
		@Column
		private String department;
		@Column
		private String specialization;
		@Column
		private String doctorPhNo;
		@Column
		private LocalDateTime treatmentdate;

		public doctor(int doctorId, String doctorName, String department, String specialization, String doctorPhNo,
				LocalDateTime treatmentdate) {
			super();
			this.doctorId = doctorId;
			this.doctorName = doctorName;
			this.department = department;
			this.specialization = specialization;
			this.doctorPhNo = doctorPhNo;
			this.treatmentdate = treatmentdate;
		}

		public int getDoctorId() {
			return doctorId;
		}

		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}

		public String getDepartment() {
			return department;
		}

		public void setDepartment(String department) {
			this.department = department;
		}

		public String getSpecialization() {
			return specialization;
		}

		public void setSpecialization(String specialization) {
			this.specialization = specialization;
		}

		public String getDoctorPhNo() {
			return doctorPhNo;
		}

		public void setDoctorPhNo(String doctorPhNo) {
			this.doctorPhNo = doctorPhNo;
		}

		public LocalDateTime getTreatmentdate() {
			return treatmentdate;
		}

		public void setTreatmentdate(LocalDateTime treatmentdate) {
			this.treatmentdate = treatmentdate;
		}

		public String getDoctorName() {
			return doctorName;
		}

		public void setDoctorName(String doctorName) {
			this.doctorName = doctorName;
		}

		@Override
		public String toString() {
			return "doctor [doctorId=" + doctorId + ", doctorName=" + doctorName + ", department=" + department
					+ ", specialization=" + specialization + ", doctorPhNo=" + doctorPhNo + ", treatmentdate="
					+ treatmentdate + "]";
		}
	}

}
