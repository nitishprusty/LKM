package Handson2;
import java.util.*;
public class Employee {
	
	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double getVariable_pay() {
		return variable_pay;
	}

	public void setVariable_pay(double variable_pay) {
		this.variable_pay = variable_pay;
	}

	private int empid;
	private int age;
	private double salary;
	private double variable_pay;
	
	public Employee(int empid,int age,double salary,double variable_pay) {
		this.empid = empid;
		this.salary = salary;
		this.variable_pay = variable_pay;
		this.age = age;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		System.out.println("Enter empid");
		int empid = sc.nextInt();
		System.out.println("Enter variable pay");
		double variable_pay = sc.nextDouble();
		System.out.println("Enter salary");
		double salary = sc.nextDouble();
		Employee obj = new Employee(empid,age,salary,variable_pay);
		
		System.out.println("Emp id : " + obj.getEmpid());
		System.out.println("Age : " + obj.getAge());
		System.out.println("Salary : " + obj.getSalary());
		System.out.println("Varible pay : " + obj.getVariable_pay());
			

	}

}
