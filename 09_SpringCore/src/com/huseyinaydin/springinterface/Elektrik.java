package tr.com.huseyinaydin.springinterface;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */
public class Elektrik implements Yakit {
	@Override
	public void depo() {
		System.out.println("Bataryada elektrik var.");
	}
}
