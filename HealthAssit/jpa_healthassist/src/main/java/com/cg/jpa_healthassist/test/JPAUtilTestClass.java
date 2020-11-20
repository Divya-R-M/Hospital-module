package com.cg.jpa_healthassist.test;

import javax.persistence.EntityManager;

import com.cg.jpa_healthassist.util.JPAUtil;

public class JPAUtilTestClass extends JPAUtil{

	public static void main(String[] args) {

		EntityManager em = getEntityManager();
		System.out.println(em);
	}

}
