package aop005;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Start {
	public static void main(String[] args) {
		ApplicationContext ctx = 
				new ClassPathXmlApplicationContext("aop005.xml");
		Person romeo = ctx.getBean("boy", Person.class);
		romeo.runSomething();
		((ClassPathXmlApplicationContext)ctx).close();
	}
}
