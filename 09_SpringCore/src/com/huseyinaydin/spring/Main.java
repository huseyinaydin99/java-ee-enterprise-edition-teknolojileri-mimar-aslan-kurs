package tr.com.huseyinaydin.spring;

/**
 * @apiNote Mimar Aslan abinin kursundan öğrendiklerim.
 * @since 1994
 */

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class Main {
	public static void main(String[] args) {
		//Araba araba = new Araba();
		BeanFactory beanFactory = new XmlBeanFactory(new FileSystemResource("springConf.xml"));
		Araba araba = (Araba) beanFactory.getBean("araba");
		araba.calistir();
	}
}