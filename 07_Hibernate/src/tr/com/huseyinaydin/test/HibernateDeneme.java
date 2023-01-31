package tr.com.huseyinaydin.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.mimaraslan.Personel;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */

public class HibernateDeneme {
	public static void main(String[] args) {
		Personel personel = new Personel();
		//personel.setPersonelid(1);
		personel.setPersonelAdi("Hüseyin");
		personel.setPersonelSoyadi("Aydin");
		personel.setPersonelEmail("onetwotreebirbabahindi@zımzımettin.org.tr");

		SessionFactory sessionFactory =new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(personel);	
		session.getTransaction().commit();
	}
}
