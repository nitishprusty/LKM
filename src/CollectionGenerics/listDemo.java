package CollectionGenerics;

import java.util.*;

public class listDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> al = new ArrayList<Integer>();
		
		for(int i = 1;i<=5;i++) {
			al.add(i);
		}
		
		System.out.println(al);
		
		Iterator<Integer> i = al.iterator();
//		while(i.hasNext()) { //Initially the cursor position at -1
//			System.out.println(i.next());
//		}
//		
//		//for loop
//		for(int k = 0;k<al.size();k++) {
//			System.out.println(al.get(k));
//		}
//		
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		for(int j=6;j<=10;j++) {
			al2.add(j);
		}
		
		al.addAll(al2);
		System.out.println(al);
		
		System.out.println(al.remove(5));
		System.out.println(al);
		
		   
		
		

	}

}
