
public class thismethod {
	
	public thismethod(){
		System.out.println("Default Constructor");
	}
	
	public thismethod(String s) {
		this();
		System.out.println("thismethod constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thismethod obj = new thismethod("String");
		obj.getClass();

	}

}
