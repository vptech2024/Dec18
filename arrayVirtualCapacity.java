package org.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class arrayVirtualCapacity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> ar = new ArrayList<Object>();
		System.out.println(ar.size());
		ar.add("Heena");
		ar.add("vp");
		ar.add("Ami");
		System.out.println(ar.size());
		//System.out.println(ar.capacity());
		for(int i=0;i<ar.size();i++) {
			//System.out.println(ar.getFirst());
			System.out.println(ar.get(i));
		}
		System.out.println(" 1.------------");
		
		for(Object s:ar) {
			System.out.println(s);
		}
		System.out.println(" 2.------------");
		ar.stream().forEach(ele->System.out.println(ele));
		
		System.out.println(" 3.------------");
		Iterator<Object> it = ar.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}
