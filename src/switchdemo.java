import java.util.*;
public class switchdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the level");
        int level = sc.nextInt();
        switch(level) {
        case 1 :
        	System.out.println("Beginner");
        	break;
        case 2 :
        	System.out.println("Intermediate");
        	break;
        case 3:
        	System.out.println("Advanced");
        	break;
        }
        sc.close();
	}

}
