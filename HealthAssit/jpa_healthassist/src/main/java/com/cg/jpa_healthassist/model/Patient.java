package com.cg.jpa_healthassist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*author: Charushi and Divya
desc:Patient Model
*/ 
@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long patientId;
	private String patientName;
	private int patientAge;
	private long phoneNumber;
	private String patientAddress;
	// private String prescription;
	// private String patientUserName;
	// private String patientPassword;
	/**
	 * Relate patient id with patient user name.
	 */
	// private static Map<Long,String> patientCredentials = new HashMap<>();

	/**
	 * Create an instance of patient with given parameters.
	 * 
	 * @param patientName
	 * @param patientAge
	 * @param phoneNumber
	 * @param patientAddress
	 * @param patientUserName
	 * @param patientPassword
	 */
	public Patient(String patientName, int patientAge, long phoneNumber, String patientAddress, String patientUserName,
			String patientPassword) {
		super();
		this.patientName = patientName;
		this.patientAge = patientAge;
		this.phoneNumber = phoneNumber;
		this.patientAddress = patientAddress;
	}

	public Patient() {
		super();
	}

	/**
	 * @return the map of the credentials i.e patient id and patient user name.
	 */

	public long getPatientId() {
		return patientId;
	}

	public void setPatientId(long patientId) {
		this.patientId = patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public int getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(int patientAge) {
		this.patientAge = patientAge;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getPatientAddress() {
		return patientAddress;
	}

	public void setPatientAddress(String patientAddress) {
		this.patientAddress = patientAddress;
	}

	@Override
	public String toString() {
		return "Patient [patientId=" + patientId + ", patientName=" + patientName + ", patientAge=" + patientAge
				+ ", phoneNumber=" + phoneNumber + ", patientAddress=" + patientAddress + "]";
	}

}
