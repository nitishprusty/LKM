package Activity2;

public class TestShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Circle circle = new Circle();
		circle.draw();
		circle.rotate();
		
		Triangle triangle  = new Triangle();
		triangle.draw();
		triangle.calculateperimeter();
		
		Shape s1 = new Circle();
		s1.draw();
		/*s1.rotate();   throws error*/
		Circle cir = (Circle) s1;
	    cir.rotate();
		
		Shape s2 = new Triangle();
		s2.draw();
		/*s2.calculateperimeter();  throws error*/
		
		Triangle tria = (Triangle)s2;
		tria.calculateperimeter();
		
		

	}

}
