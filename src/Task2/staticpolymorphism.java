package Task2;

public class staticpolymorphism {
	
	static void display() {
		System.out.println("Diaplaying some contents");
	}
	static void display(int x) {
		System.out.println("Display " + x);
	}
	static void display(int x,int y) {
		System.out.println("x = " + x + " y = " + y);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		display();
		display(10);
		display(10,20);

	}

}
