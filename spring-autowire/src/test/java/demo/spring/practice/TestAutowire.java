package demo.spring.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:application-*.xml");
		context.getBean("byConstructor", ByConstructor.class).display();
		context.getBean("byName", ByName.class).display();
		context.getBean("byType", ByType.class).display();
		context.getBean("default", DefaultNo.class).display();
	}
}
