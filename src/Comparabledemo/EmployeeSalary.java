package Comparabledemo;

public class EmployeeSalary implements Comparable<EmployeeSalary>{
	
	int Eid;
	String name;
	double Salary;
	
	public EmployeeSalary(int Eid,String name,double Salary) {
		super();
		this.Eid = Eid;
		this.name = name;
		this.Salary = Salary;
	}

	@Override
	public int compareTo(EmployeeSalary o) {
		//if strings are not equal
		if(this.name.compareTo(o.name) < 0) {
			return -1;
		}
		else if(this.name.compareTo(o.name) > 0){
			return 1;
		}else {
			return 0;
		}
	}

}
