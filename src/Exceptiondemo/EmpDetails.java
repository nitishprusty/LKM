package Exceptiondemo;

public class EmpDetails {
	
	public static void validation(int proj_id)throws ArithmeticException
	{
		if(proj_id == 100) {
			throw new ArithmeticException("Project is Pharma");
		}else {
			throw new NullPointerException("Invalid Projects");
		}
	}
	public static void main(String [] args) {
		try {
			validation(100);
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
