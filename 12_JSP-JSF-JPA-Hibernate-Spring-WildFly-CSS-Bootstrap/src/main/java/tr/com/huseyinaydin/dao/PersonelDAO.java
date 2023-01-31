package tr.com.huseyinaydin.dao;

import java.util.List;

import tr.com.huseyinaydin.model.Personel;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */

public interface PersonelDAO {

	public String personelEkle(Personel p);

	public List<Personel> personelAra();

	public List<Personel> personelAra(Personel p);

	public String personelDuzenle(Personel p);

	public String personelSil(Personel p);

}

 