package com.cg.jpa_healthassist;

import java.time.LocalDateTime;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.persistence.EntityManager;

import com.cg.jpa_healthassist.entity.DoctorEntity;
import com.cg.jpa_healthassist.exception.DoctorNotFoundException;
import com.cg.jpa_healthassist.exception.PatientNotFoundException;
import com.cg.jpa_healthassist.model.Doctor;
import com.cg.jpa_healthassist.service.IDoctorService;
import com.cg.jpa_healthassist.serviceImpl.DoctorServiceImpl;
import com.cg.jpa_healthassist.service.IDoctorService;

/** class to implement main method
 * 
 *  @author Divya
 *
 */
public class DoctorMain {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws DoctorNotFoundException {
		DoctorServiceImpl doctorService = new DoctorServiceImpl();
		int choice;
		do {
			System.out.println("------Doctor Menu------");
			System.out.println("1. Add Doctor");
			System.out.println("2. Remove Doctor");
			System.out.println("3. Update Doctor");
			System.out.println("4. Exit");			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter your choice");
			choice=0;
			try {
				choice = sc.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Invalid option,please choose a valid option");
			}
			sc.nextLine();
			switch (choice) {
			case 1: 
				System.out.println("Enter the Doctor Name : ");
				String doctorName=sc.nextLine();
				sc.nextLine();
				System.out.println("Enter the Specialization : ");
				String specialization=sc.nextLine();
				System.out.println("Enter the department : ");
				String department=sc.nextLine();
				System.out.println("Enter the Phone Number");
				long doctorPhNo=sc.nextLong();
				Doctor doctor=new Doctor(doctorName,specialization,department,doctorPhNo);
				doctorService.addDoctor(doctor);
				break;
			case 2:
				System.out.println("Enter the Doctor id to be removed : ");
				long id = sc.nextLong();
				doctorService.removeDoctor(id);
			case 3:
				System.out.println("Enter the Doctor specialization to be updated : ");
				Doctor doctor1=new Doctor();
				String specialization1=sc.nextLine();
				doctorService.update(doctor1, specialization1);
			case 4:
				choice=4;
		}
	}while(choice!=4);
	}
}
		
			