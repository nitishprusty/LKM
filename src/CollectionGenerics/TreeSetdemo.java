package CollectionGenerics;

import java.util.*;

public class TreeSetdemo {

	public static void main(String[] args) {
		TreeSet<Integer> ts = new TreeSet<>();
		ts.add(1001);
		ts.add(2001);
		ts.add(3001);
		
		System.out.println(ts);
		
		NavigableSet<Integer> ns = ts.descendingSet();
		
		Iterator<Integer> it = ns.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
