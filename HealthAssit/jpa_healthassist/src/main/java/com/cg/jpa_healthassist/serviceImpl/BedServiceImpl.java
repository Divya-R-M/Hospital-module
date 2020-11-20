package com.cg.jpa_healthassist.serviceImpl;

import java.util.List;

import com.cg.jpa_healthassist.daoImpl.BedDaoImpl;
import com.cg.jpa_healthassist.exception.BedNumNotFoundException;
import com.cg.jpa_healthassist.model.Bed;
import com.cg.jpa_healthassist.service.IBedService;

public class BedServiceImpl implements IBedService {
	/*author: Charushi and Divya
	desc:Implementing services present in bedService
	*/
	BedDaoImpl bedDao = new BedDaoImpl();

	@Override
	public void addBed(Bed bed) {
		bedDao.addBed(bed);
	}

	@Override
	public void removeBed(int bedId) throws BedNumNotFoundException {
		bedDao.removeBed(444);
	}

	@Override
	public void updateBed(int bedId, Bed bed) throws BedNumNotFoundException {
		bedDao.updateBed(222, bed);
	}

	@Override
	public List<Bed> getAllBeds() {
		List<Bed> bedList = bedDao.getAllBeds();
		return bedList;
	}
}
