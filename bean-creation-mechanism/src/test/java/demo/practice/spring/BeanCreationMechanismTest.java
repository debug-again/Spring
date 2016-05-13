package demo.practice.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import demo.practice.spring.SampleBean;

public class BeanCreationMechanismTest {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:*-context.xml");
		
		/* ------------- Instantiation with constructor ---------------------  */
		context.getBean("sampleBeanCons", SampleBean.class).display();
		context.getBean("sampleBeanConsArg", SampleBean.class).display();
		
		System.out.println("----------------------------------------------------");
		
		/* ------------- Instantiation with instance factory ---------------------  */
		context.getBean("sampleBeanFromInstanceFactory", SampleBean.class).display();
		context.getBean("sampleBeanFromInstanceFactoryArg", SampleBean.class).display();
		
		System.out.println("----------------------------------------------------");
		
		/* ------------- Instantiation with instance factory ---------------------  */
		context.getBean("staticSampleBeanFactory", SampleBean.class).display();
		context.getBean("staticSampleBeanFactoryArg", SampleBean.class).display();
		
	}

}
