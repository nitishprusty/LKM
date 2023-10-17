package ArrayDemo;
import java.util.Scanner;
public class ArrayDemo {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int size = sc.nextInt();
		
		int [] arr = new int[size];
		System.out.println("Enter the elements you want to insert");
		for(int i = 0;i<size;i++) {
		   arr[i] = sc.nextInt();
		}
        printarr(arr);
	}
	void printarr(int [] arr) {
		for(Integer i : arr) {
			System.out.print(i + " ");
		}
	}

}
