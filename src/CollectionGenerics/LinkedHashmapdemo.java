package CollectionGenerics;

import java.util.*;

public class LinkedHashmapdemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lh = new LinkedHashMap<>();
		
		lh.put(3, "Java");
		lh.put(2, "Python");
		lh.put(1, "Salesforce");
		
		System.out.println(lh);

	}

}
