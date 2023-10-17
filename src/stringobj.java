
public class stringobj {

	public static void main(String[] args) {
		
		//String are the combination of array of characters
		
		String str = "Accenture";
		System.out.println(str.length());
		System.out.println(str.charAt(5));
		
		//equals
		String str1 = "hello";
		String str2 = "hey";
		String str3 = "HEY";
		System.out.println(str1.equals(str2));
		System.out.println(str2.equalsIgnoreCase(str3));
		
		
		String s1 = "ACC";
		String s2 = "ACC";
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(str));
		System.out.println(str1.compareTo(str2));
		
	    System.out.println(str.substring(2,5));
	    
	    System.out.println(str.indexOf('c'));
	    
	    System.out.println(str.toUpperCase());
	    System.out.println(str.toLowerCase());
	    
	    System.out.println(str.lastIndexOf('e'));

	}

}
