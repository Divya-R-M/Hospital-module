package com.cg.jpa_healthassist.daoImpl;

import java.util.List;

import javax.persistence.EntityManager;

import com.cg.jpa_healthassist.dao.IBedDao;
import com.cg.jpa_healthassist.exception.BedNumNotFoundException;
import com.cg.jpa_healthassist.model.Bed;
import com.cg.jpa_healthassist.util.JPAUtil;

public class BedDaoImpl extends JPAUtil implements IBedDao {
	/*author: Charushi and Divya
	desc:Functionalities present in patient class
	*/
	@Override
	public void addBed(Bed bed) {
		
	}

	@Override
	public Bed removeBed(int bedId) throws BedNumNotFoundException {
		EntityManager em = getEntityManager();
		beginTransaction(em);
		Bed bed1 = em.find(Bed.class, bedId);
		if (bed1 != null) {
			em.remove(bed1);
			return bed1;
		} else {
			throw new BedNumNotFoundException("Bed number not found");
		}
	}

	@Override
	public Bed updateBed(int bedId, Bed bed) throws BedNumNotFoundException {
		{
			EntityManager em = getEntityManager();
			Bed bed1 = em.find(Bed.class, bedId);
			if (bed1 != null) {
				bed = em.merge(bed);
				return bed;
			} else {
				throw new BedNumNotFoundException("Bed number not found");
			}
		}

	}

	@Override
	public List<Bed> getAllBeds() {
		EntityManager em = getEntityManager();
		List<Bed> bedList = em.createQuery("Select bed From Bed bed", Bed.class).getResultList();
		return bedList;
	}

}
