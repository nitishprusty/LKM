package TreeMapDemo;

import java.util.*;

public class EmployeeUi {
	
	public static void main(String [] args) {
		EmployeeSalary emp1 = new EmployeeSalary(1,"Nitish",56987.90);
		EmployeeSalary emp2 = new EmployeeSalary(2,"Alex",46987.90);
		EmployeeSalary emp3 = new EmployeeSalary(3,"Tom",36987.90);
		
		List<EmployeeSalary> emplist = new ArrayList<>();
		emplist.add(emp1);
		emplist.add(emp2);
		emplist.add(emp3);
		
		Collections.sort(emplist,new EmployeeSalary(0,null,0));
		
		System.out.println("Sorted salary list - ");
		
		for(EmployeeSalary es : emplist) {
			System.out.println("Eid is - " + es.Eid);
			System.out.println("Employee Name - " + es.name);
			System.out.println("Employee Salary is - " + es.salary);
			System.out.println();
		}
	}

}
