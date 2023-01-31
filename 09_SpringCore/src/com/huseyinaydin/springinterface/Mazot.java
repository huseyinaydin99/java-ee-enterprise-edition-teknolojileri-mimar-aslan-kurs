package tr.com.huseyinaydin.springinterface;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */
public class Mazot implements Yakit {
	@Override
	public void depo() {
		System.out.println("Depoda mazot var.");
	}

}
