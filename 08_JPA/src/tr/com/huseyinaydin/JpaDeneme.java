package com.mimaraslan;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */

public class JpaDeneme {
	public static void main(String[] args) {
		Personel personel = new Personel();
		//personel.setPersonelid(1);
		personel.setPersonelAdi("Hasan");
		personel.setPersonelSoyadi("Aydın");
	
		//---JPA------------------------------
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU_08_JPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(personel);
		entityTransaction.commit();
		System.out.println(personel);
		entityManager.close();
		entityManagerFactory.close();
	}
}