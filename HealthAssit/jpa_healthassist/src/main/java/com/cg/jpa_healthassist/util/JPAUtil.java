package com.cg.jpa_healthassist.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.cg.jpa_healthassist.model.Doctor;

/**
 * This JPAUtil class performs common task like getting entityManager instance
 *  and releasing entityManager.
 *
 */
public class JPAUtil {
	private static EntityManagerFactory entityManagerFactory;

	/**
	 * Create the entity manager factory to produce the entity manager.
	 */
	static {
		entityManagerFactory = Persistence.createEntityManagerFactory("JPA-PU");
	}

	public static EntityManager getEntityManager() {
		return entityManagerFactory.createEntityManager();
	}

	/**
	 * Start the transaction.
	 */
	public void beginTransaction(EntityManager em) {
		em.getTransaction().begin();
	}

	/**
	 * Save all the changes in the database.
	 */
	public void commitTransaction(EntityManager em) {
		em.getTransaction().commit();
	}

	/**
	 * Close the transaction.
	 */
	public void closeEntityManager(EntityManager em) {
		em.close();
	}

	public boolean update(Doctor doctor, long doctorPhNo) {
		// TODO Auto-generated method stub
		return false;
	}


}
