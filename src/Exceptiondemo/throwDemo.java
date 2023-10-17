package Exceptiondemo;

public class throwDemo {

	public static void main(String[] args) throws ArithmeticException{
		try {
			throw new ArithmeticException();
		}catch(Exception e) {
			System.out.println("Exception Handled");
		}

	}

}
