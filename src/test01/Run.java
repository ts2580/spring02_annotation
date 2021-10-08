package test01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("test01/ApplicationContext.xml");
		
		System.out.println(context.getBean("car"));
	}

}
