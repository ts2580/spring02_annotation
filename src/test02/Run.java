package test02;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Run {
	
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("test02/applicationContext.xml");
		Rent rent = context.getBean("rent", Rent.class);
		System.out.println(rent);
		
		Book book = context.getBean("book", Book.class);
		// appConfig의 book메서드 퍼옴
		// 사실 이렇게 퍼올일은 거의 없음
		System.out.println(book);
	}
}
