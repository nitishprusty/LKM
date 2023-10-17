package TreeMapDemo;

import java.util.*;

public class demo {

	public static void main(String[] args) {
		
		NavigableMap<Integer,String> nm = new TreeMap<Integer,String>();
		
		nm.put(2, "aa");
		nm.put(4, "bb");
		nm.put(1, "cc");
		
		nm.put(3, "dd");
		nm.put(5, "ee");
		
		System.out.println(nm.descendingMap());
		
		//headMap 
		System.out.println(nm.headMap(4,true));  //{1=cc, 2=aa, 3=dd, 4=bb}
		System.out.println(nm.headMap(4,false)); //{1=cc, 2=aa, 3=dd}
		
		//tailmap
		System.out.println(nm.tailMap(3,true));  //{3=dd, 4=bb, 5=ee}
		System.out.println(nm.tailMap(3,false)); //{4=bb, 5=ee}
		
		//submap
		System.out.println(nm.subMap(2, true,4,true));  //{2=aa, 3=dd, 4=bb}
	}

}
