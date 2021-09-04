package lab1.problem1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Lab1Problem1Xml {

	public static void main(String[] args) {

		ApplicationContext ctx = new ClassPathXmlApplicationContext("lab1prob1.xml");
		Employee employee = ctx.getBean("employee", Employee.class);
		System.out.println(employee.toString());
		((AbstractApplicationContext) ctx).close();

	}

}
