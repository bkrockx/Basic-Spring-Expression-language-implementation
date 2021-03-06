package controller;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	public static void main(String[] args){
		
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Author author = (Author)context.getBean("authorBean");
		System.out.println(author.toString());
		context.close();
		
	}

}
