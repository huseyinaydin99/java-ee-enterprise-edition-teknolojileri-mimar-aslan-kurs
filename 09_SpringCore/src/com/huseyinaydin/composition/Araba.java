package tr.com.huseyinaydin.composition;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */
public class Araba {
	
	Yakit yakit;
	
	public Araba() {
		this.yakit = new Yakit();
	}

	public void calistir() {
		yakit.depo();
		System.out.println("Araba çalışıyor.");
	}
	
}