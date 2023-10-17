package Exceptiondemo;

public class StackOverFlowDemo {
	
	
	static int display(int a) {
		return 2 + display(a + 5);
	}

	public static void main(String[] args) {
		
		System.out.println(display(2));
       
	}

}
