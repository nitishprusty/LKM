package Task;

public class Details {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee emp1 = new Employee();
		emp1.setEmpid("1001");
		emp1.setEmpname("Raj");
		
		Employee emp2 = new Employee();
		emp2.setEmpid("1002");
		emp2.setEmpname("Kamal");
		
		Employee emp3 = new Employee();
		emp3.setEmpid("1003");
		emp3.setEmpname("Shyam");
		
		System.out.println("Before Changes");
		System.out.println(emp1.getEmpid());
		System.out.println(emp1.getEmpname());
		System.out.println(Employee.cname);
		System.out.println(Employee.stream1);
		
		System.out.println(emp2.getEmpid());
		System.out.println(emp2.getEmpname());
		System.out.println(Employee.cname);
		System.out.println(Employee.stream1);
		
		System.out.println(emp3.getEmpid());
		System.out.println(emp3.getEmpname());
		System.out.println(Employee.cname);
		System.out.println(Employee.stream1);
		
		
		System.out.println("\n");
		
		
		System.out.println("Before Changes");
		System.out.println(emp1.getEmpid());
		System.out.println(emp1.getEmpname());
		System.out.println(Employee.cname);
		System.out.println(Employee.stream1);
		
		System.out.println(emp2.getEmpid());
		System.out.println(emp2.getEmpname());
		System.out.println(Employee.cname);
		System.out.println(Employee.stream1);
		
		System.out.println(emp3.getEmpid());
		System.out.println(emp3.getEmpname());
		System.out.println(Employee.cname);
		System.out.println(Employee.stream2);
		
		

	}

}
