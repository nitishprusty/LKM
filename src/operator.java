import java.util.*;
public class operator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a & b); //bitwise and
        System.out.println(a | b);  //bitwise or
        System.out.println(a ^ b);  //bitwisexor
        if(a == 10 && b == 20) {
        	System.out.println("You guessed the right number");
        }else if(a == 10 || b == 20) {
        	System.out.println("You partially gueseed the right number");
        }else {
        	System.out.println("Incorrect guess");
        }
        sc.close();
	}

}
