
public class Cricketer {
	String name,country;
	int age;
	
	void getDetails(String name,String country,int age) {
		this.name = name;
		this.country = country;
		this.age = age;
		
		System.out.println("Name - " + name + "\n" + "Country - " + country + "\n" + "Age - " + age);
		
	}
	
	void run() {
		System.out.println("Running");
	}
	
	void bat() {
		System.out.println("Batting");
	}
	
	void bowl() {
		System.out.println("Bowling");
	}
	
	void field(){
		System.out.println("Fielding");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cricketer obj = new Cricketer();
		obj.getDetails("Virat Kohli","India",34);
		obj.run();
		obj.bat();
		obj.bowl();
		obj.field();

	}

}
