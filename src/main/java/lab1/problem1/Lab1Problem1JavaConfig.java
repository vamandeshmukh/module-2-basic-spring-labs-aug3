package lab1.problem1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class Lab1Problem1JavaConfig {

	public static void main(String[] args) {

		ApplicationContext ctx = new AnnotationConfigApplicationContext(JavaConfig.class);
		Employee employee = ctx.getBean(Employee.class);
		System.out.println(employee.toString());
		((AbstractApplicationContext) ctx).close();

	}

}
