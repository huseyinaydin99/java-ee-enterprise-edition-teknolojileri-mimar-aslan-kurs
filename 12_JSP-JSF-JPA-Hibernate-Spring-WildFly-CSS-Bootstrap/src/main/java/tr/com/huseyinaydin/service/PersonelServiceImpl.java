package tr.com.huseyinaydin.service;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import tr.com.huseyinaydin.dao.PersonelDAO;
import tr.com.huseyinaydin.model.Personel;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */

@Service
@ManagedBean(name="personelService")
@SessionScoped
public class PersonelServiceImpl implements PersonelService {

	private PersonelDAO personelDAO;
	public void setPersonelDAO(PersonelDAO personelDAO) {
		this.personelDAO = personelDAO;
	}
	@Override
    @Transactional
    public String personelEkle(Personel p) {
		return this.personelDAO.personelEkle(p);
    }
    @Override
    @Transactional
    public List<Personel> personelAra() {
        return this.personelDAO.personelAra();
    }
    @Override
    @Transactional
    public List<Personel> personelAra(Personel p) {
        return this.personelDAO.personelAra(p);
    }
	@Override
	@Transactional
	public String personelDuzenle(Personel p) {
		return this.personelDAO.personelDuzenle(p);		  
	}
	@Override
	@Transactional
	public String personelSil(Personel p) {
		return this.personelDAO.personelSil(p);	
	} 
}