package tr.com.huseyinaydin.spring;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */
public class Araba {
	
	Yakit yakit;
	/*
	public Araba() {
		this.yakit = new Yakit();
	}
	*/
	
	public Araba(Yakit yakit) {
		this.yakit = yakit; 
	}

	public void calistir() {
		yakit.depo();
		System.out.println("Araba çalışıyor.");
	}
	
}