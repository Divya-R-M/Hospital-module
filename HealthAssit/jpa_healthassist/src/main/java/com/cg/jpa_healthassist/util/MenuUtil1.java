package com.cg.jpa_healthassist.util;

import java.util.Scanner;

import com.cg.jpa_healthassist.exception.DoctorNotFoundException;
import com.cg.jpa_healthassist.exception.PatientNotFoundException;
import com.cg.jpa_healthassist.model.Doctor;
import com.cg.jpa_healthassist.model.Patient;
import com.cg.jpa_healthassist.serviceImpl.DoctorServiceImpl;
import com.cg.jpa_healthassist.serviceImpl.PatientServiceImpl;
/*
 * MenuUtil class to interact with the hospital admin to perform operations on the database
 * and print all methods and services
 */
public class MenuUtil1 {

	public static void main(String[] args) throws DoctorNotFoundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("-----------Hospital Menu-----------");
		System.out.println("-----------Welcome to admin service-----------");
		System.out.println("Choose 1 for Doctor");
		System.out.println("Choose 2 for Patient");
		System.out.println("Enter your choice");
		int choice = sc.nextInt();
		DoctorServiceImpl doctorService = new DoctorServiceImpl();
		PatientServiceImpl patientService = new PatientServiceImpl();
		if (choice == 1) {
			Doctor doctor = new Doctor();
			System.out.println("Doctor Menu");
			System.out.println("1. Add Doctor");
			System.out.println("2. Delete Doctor");
			System.out.println("3. Update Doctor");
			System.out.println("Enter your choice");
			int option = sc.nextInt();
			switch (option) {

			case 1:
				doctor.setDoctorId(sc.nextLong());
				doctor.setDoctorName(sc.next());
				doctor.setSpecialization(sc.next());
				doctor.setDepartment(sc.next());
				doctor.setDoctorPhNo(sc.nextLong());
				doctorService.persist(doctor);
				break;
			case 2:
				int doctorId = sc.nextInt();
				doctorService.removeDoctor(doctorId);
				break;
			case 3:
				System.out.println("Enter the id to be updated:");
				int doctorId1 = sc.nextInt();
				System.out.println("Enter the Doctor Menu");
				System.out.println("Doctor Update Menu ");
				System.out.println("1. Update the Doctor name");
				System.out.println("2. Update the specialization");

				Doctor doctor1 = new Doctor();
				int selection = sc.nextInt();
				try {
					if (selection == 1) {
						String updateName = sc.next();
						doctor1.setDoctorName(updateName);
					} else if (selection == 2) {
						String updateSpecialization = sc.next();
						doctor1.setSpecialization(updateSpecialization);
					} else {
						throw new DoctorNotFoundException("Invalid Selection");
					}
				} catch (DoctorNotFoundException e) {
					e.printStackTrace();
				}
				doctorService.updateDoctorDetails(doctorId1, doctor1, option);
				break;
			}
		} else if (choice == 2) {
			Patient patient = new Patient();
			System.out.println("Patient Menu");
			System.out.println("1. Search Patient By Id");
			System.out.println("2. Remove Patient");
			System.out.println("3. Update Patient");
			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			try {
				switch (ch) {
				case 1:
					long patientId = sc.nextLong();
					patientService.findByPatientId(patientId);
					break;
				case 2:
					long patientId1 = sc.nextLong();
					patientService.removePatient(patientId1);
					break;
				case 3:
					System.out.println("Enter the Patient id");
					int Id = sc.nextInt();
					System.out.println("Patient Update Menu ");
					System.out.println("1. Update the name");
					System.out.println("2. Update the Patient id");
					System.out.println("3. Update the Phone number");

					int option = sc.nextInt();
					switch (option) {
					case 1:
						String updateName = sc.next();
						patient.setPatientName(updateName);
						break;
					case 2:
						long updatePatId = sc.nextLong();
						patient.setPatientId(updatePatId);
						break;
					case 3:
						long updatePhone = sc.nextLong();
						patient.setPhoneNumber(updatePhone);
						break;
					default:
						throw new PatientNotFoundException("Invalid Selection");
					}
					patientService.updatePatient(patient,9876365434L);
				}
			} catch (PatientNotFoundException e) {
				e.printStackTrace();
			}

		}
		// sc.close();
	}

}