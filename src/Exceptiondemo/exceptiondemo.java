package Exceptiondemo;

public class exceptiondemo {

	public static void main(String[] args) {
		
		try {
		//NumberFormat 
		int a = Integer.parseInt("Nitish");
		System.out.println(a);
		}catch(Exception e) {
			e.printStackTrace(); ///Sout("Number Format Exception");
		}
		
		//ArrayIndexOutofBound
		try {
		int [] arr = new int[2];
		System.out.println(arr[4]);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Arithmetic Exception
		try {
		System.out.println(10/0);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		

	}

}
