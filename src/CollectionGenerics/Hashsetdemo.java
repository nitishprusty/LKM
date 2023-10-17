package CollectionGenerics;

import java.util.*;

public class Hashsetdemo {

	public static void main(String[] args) {
		Set<String> hs = new LinkedHashSet<String>();
		hs.add("Apparel");
		hs.add("Spring");
		hs.add("Hibernate");
		hs.add("SpringBoot");
		hs.add("MicroServices");
		hs.add("Spring");
		
		Iterator<String> It = hs.iterator();
		
		while(It.hasNext()) {
			System.out.println(It.next());
		}
	}

}
