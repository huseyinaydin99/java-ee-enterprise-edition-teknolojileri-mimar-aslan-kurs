package tr.com.huseyinaydin.springinterface;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */

public class Main {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("SpringBeanConf.xml");
		Araba araba = (Araba) applicationContext.getBean("araba");
		araba.calistir();
		
	}

}
