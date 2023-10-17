package CustomException;

public class File {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			custom("Hey");
		}catch(Myclass e) {
			System.out.println(e);
		}

	}
	
	static void custom(String msg) throws Myclass{
		
		if(msg.equalsIgnoreCase("Hey")) {
			throw new Myclass("Hey Msg is declared");
		}else {
			System.out.println("Try something else");
		}
		
	}

}
