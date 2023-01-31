package tr.com.huseyinaydin.springinterface;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */

public class Araba {
	Yakit yakit;
	public Araba(Yakit yakit) {
		this.yakit = yakit; 
	}
	public void calistir() {
		yakit.depo();
		System.out.println("Araba çalışıyor.");
	}
}