package com.cg.jpa_healthassist.service;

import java.util.List;

import com.cg.jpa_healthassist.exception.BedNumNotFoundException;
import com.cg.jpa_healthassist.model.Bed;

public interface IBedService {

	 public void addBed(Bed bed);
		public void removeBed(int bedId) throws BedNumNotFoundException; 
		public void updateBed(int bedId, Bed bed) throws BedNumNotFoundException;
		public List<Bed> getAllBeds(); 
}
