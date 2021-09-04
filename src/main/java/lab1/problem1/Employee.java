package lab1.problem1;

/*
// for annotation based configuration 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Employee {

	@Value("12345")
	private int employeeId;
	@Value("Harriet")
	private String employeeName;
	@Value("40000")
	private double salary;
	@Value("PES-BU")
	private String businessUnit;
	@Value("30")
	private int age;
*/

public class Employee {

	private int employeeId;
	private String employeeName;
	private double salary;
	private String businessUnit;
	private int age;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double salary, String businessUnit, int age) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.businessUnit = businessUnit;
		this.age = age;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getBusinessUnit() {
		return businessUnit;
	}

	public void setBusinessUnit(String businessUnit) {
		this.businessUnit = businessUnit;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee Details \n----------------------\nEmployee ID : " + employeeId + "\nEmployee Name : "
				+ employeeName + "\nEmployee Salary : " + salary + "\nEmployee BU : " + businessUnit
				+ "\nEmployee Age : " + age;
	}

}
