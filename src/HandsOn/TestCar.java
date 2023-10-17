package HandsOn;
import java.util.Scanner;
public class TestCar {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the model Name");
		String modelName = sc.next();
		System.out.println("Enter the color");
		String color = sc.next();
		System.out.println("Enter the manufacturer");
		String manufacturer = sc.next();
		
		Car obj = new Car(modelName,color,manufacturer);
		System.out.println("Car model Name - " + obj.model);
		System.out.println("Color is - " + obj.Color);
		System.out.println("Manufacturer - " + obj.manufacturer);

	}

}
