package package2;

import package1.Employee;

public class protecteddemo extends Employee{
	
	final int a = 10;
	
	protecteddemo(){
		super();
	}
	
//	void modifydata() {   throws an error
//		this.a = 5;
//	}
	
	void getCompanyDetails() {
		System.out.println(super.cname);
		System.out.println(super.c_code);
	}
	
	public void getData() {
		System.out.println("Method Overriding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		protecteddemo obj = new protecteddemo();
		obj.getCompanyDetails();
		obj.getData();
		

	}

}
