package lab1.problem1;

import org.springframework.context.annotation.Bean;

public class JavaConfig {

	@Bean
	public Employee employee() {
		return new Employee(12345, "Harriet", 40000, "PES-BU", 30);
	}

}
