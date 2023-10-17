import java.util.Scanner;
public class methodOverloadingdemo {
	String name;
	long sim1;
	long sim2;
	void Contact(String name,long sim1) {
		this.name = name;
		this.sim1 = sim1;
		System.out.println("Name is " + name);
		System.out.println("Personal Contact Number " + sim1);
	}
	
	void Contact(String name,long sim1,long sim2) {
		this.name = name;
		this.sim1 = sim1;
		this.sim2 = sim2;
		System.out.println("Name is " + name);
		System.out.println("Personal Contact Number " + sim1);
		System.out.println("Company Number is " + sim2);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = sc.next();
		System.out.println("Enter the personal  Contact Number");
		long sim1 = sc.nextLong();
		System.out.println("Enter the company Contact Number");
		long sim2 = sc.nextLong();
		
		methodOverloadingdemo obj = new methodOverloadingdemo();
		obj.Contact(name, sim1);
		obj.Contact(name, sim1, sim2);
		
		sc.close();

	}

}
