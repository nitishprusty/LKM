package TreeMapDemo;

import java.util.Comparator;

public class EmployeeSalary implements Comparator<EmployeeSalary>{
	
	int Eid;
	String name;
	double salary;
	
	public EmployeeSalary(int Eid,String name,double salary) {
		super();
		this.Eid = Eid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compare(EmployeeSalary emp1, EmployeeSalary emp2) {
		EmployeeSalary employeeSalary1 = (EmployeeSalary) emp1;
		EmployeeSalary employeeSalary2 = (EmployeeSalary) emp2;
		
		if(employeeSalary1.salary > employeeSalary2.salary) {
			return 1;//will swap
		}
		
		else if(employeeSalary1.salary < employeeSalary2.salary) {
			return -1;//not swap
		}
		else {
			return 0; //equal
		}
		

	}
	
	

}
