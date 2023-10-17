import java.util.*;
public class reverseaNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int num = sc.nextInt();
        System.out.println("Before Reverse");
        System.out.println("Number is " + num);
        System.out.println("After Reverse");
        System.out.println("Number is " + reverse(num));
        sc.close();
	}
	
	static int reverse(int num) {
		int rev = 0;
		int remainder;
		while(num > 0) {
			remainder = num%10;
			rev = rev*10 + remainder;
			num = num/10;
		}
		return rev;
	}

}
