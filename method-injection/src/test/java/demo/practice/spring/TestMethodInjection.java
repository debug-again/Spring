package demo.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMethodInjection {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:*-config.xml");
		context.getBean("singleton", Singleton.class).display();
		context.getBean("singleton", Singleton.class).display();
		context.getBean("singleton", Singleton.class).display();
	}
}
