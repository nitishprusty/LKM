import java.util.Scanner;
public class task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Modulus - " + a%b);
        System.out.println("Increment - " + a++ + " , " + b++);
        System.out.println("Addition assign - ");
        a += b;
        System.out.println(a);
        System.out.println("Substraction Assignment - ");
        a -= b;
        System.out.println(a);
        System.out.println("Division Assignment");
        a /= b;
        System.out.println(a);
        System.out.println("Modulus assignment");
        a %= b;
        System.out.println(a);
        System.out.println("Decrement - " + a-- + "," + b--);
        sc.close();
        
	}

}
