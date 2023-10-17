
public class stringbuilderdemo {

	public static void main(String[] args) {
		
		/*StringBuilder is a class which is used to create mutable string 
         * which is not synchronized and it is more efficient than StringBuffer
         */
		
		StringBuilder sb = new StringBuilder("Learning Java");
	   /*	sb.append("At LKM Accenture"); //Learning Java At LKM Accenture
		
		sb.insert(13, "Happily"); //Learning Java Happily At LKM Accenture
		System.out.println(sb);
		
		sb.replace(9, 12, "String");
		sb.reverse();*/
	    System.out.println(sb.capacity());
	    
	    /*ensure Capacity ensures that the given capacity is lesser than current capacity
	     * if it is greater than current capacity old_capacity*2+2
	     */
		
	    
	    sb.ensureCapacity(20);
	    System.out.println(sb.capacity());

	}

}
