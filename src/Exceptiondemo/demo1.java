package Exceptiondemo;


public class demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int x = Integer.parseInt("Nitish");
			System.out.println(x);
			try {
			int a = 10/0;
			System.out.println(a);
			try {
				int [] arr = new int[5];
				arr[10] = 7;
			}catch(Exception e) {
				System.out.println("Array Index out of Bound Exception");
			}
			
			}catch(Exception e) {
				System.out.println("Arithmetic Exception");
			}
			
			
		}catch(Exception e) {
			System.out.println("Arithmetic Exception");
		}

	}

}
