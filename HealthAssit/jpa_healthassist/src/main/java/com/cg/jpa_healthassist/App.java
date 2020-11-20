package com.cg.jpa_healthassist;

import com.cg.jpa_healthassist.model.Bed;
import com.cg.jpa_healthassist.model.Doctor;
import com.cg.jpa_healthassist.model.Patient;

public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Patient patient = new Patient();
    	patient.setPatientName("Divya");
    	patient.setPatientId(101);
    	patient.setPatientAge(22);
    	patient.setPhoneNumber(9942367256L);
        patient.setPatientAddress("14,BigBazzar street,ooty");
        
        System.out.println(patient);
        
        Doctor doctor = new Doctor();
        doctor.setDoctorId(1);
        doctor.setDoctorName("Gowtham");
        doctor.setSpecialization("HeartSpecialist");
        doctor.setDepartment("Cardiology");
        doctor.setDoctorPhNo(8768964390L);
        
        System.out.println(doctor);
        
        Bed bed = new Bed();
        bed.setBedId(11);
        bed.setBedType("SpringMattresses");
        
        System.out.println(bed);
    }
}
