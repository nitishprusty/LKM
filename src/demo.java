
public class demo {
	int x = 100; //instance variable 
    
	void show(int p) { //p  is a local variable
		System.out.println(p);
	}
	{
		System.out.println("Hello");
	}
	static {
		System.out.println("Good morning Accenture");
	}
	static {
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    demo obj = new demo();
        System.out.println("Hey");
        obj.show(90);
        try {
        	
        	String str = "java";
        	Integer i = Integer.valueOf(str);
        	
        }catch(Exception e) {
        	e.printStackTrace();
        }
	}

}
