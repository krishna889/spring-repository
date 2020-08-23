package co.NetworkTest;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.access.ContextBeanFactoryReference;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.networks.in.Apple11Max;
import com.networks.in.Jio;
import com.networks.in.NetworkApi;
import com.networks.in.Samsung;

public class NetworkTest {
public static void main(String[] args) {
//	   ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
//	   NetworkApi network=(NetworkApi) context.getBean("bsnl");
//	  network.calls();
//	  network.data();
//	  network.msgs();
//	  System.out.println("--------------");
//	  
////	  
//	  Samsung samsung=(Samsung) context.getBean("samsung");
//	  samsung.connectNetwork();
//	  System.out.println("********** ****** ********    *********");
//	  Apple11Max app=(Apple11Max) context.getBean("apple");
//	  app.ConnectNetwork();
	  Resource resource=new FileSystemResource("src/main/resources/spring.xml");
	  XmlBeanFactory xml=new XmlBeanFactory(resource);
	  NetworkApi jio=(NetworkApi) xml.getBean("jio");
	  jio.calls();
	  jio.data();
	  jio.msgs();
	  
	  
}}
