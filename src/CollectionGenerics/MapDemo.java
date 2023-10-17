package CollectionGenerics;

import java.util.*;

public class MapDemo {
	
	public static void main(String [] args) {
		Map<Integer,String> hs = new HashMap<>();
		hs.put(2,"Hey");
		hs.put(1, "Hello");
		hs.put(4, "Hola");
		hs.put(3, "Hii");
		
		/*
		for(Map.Entry<Integer,String> m : hs.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		*/
		//sort by ascending
	    hs.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
	    System.out.println();
	    //sort by descending
	    hs.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
	}

}
