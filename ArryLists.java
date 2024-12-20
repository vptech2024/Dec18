package org.collections;

import java.util.ArrayList;

public class ArryLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arrLst = new ArrayList<>();
		arrLst.add("a");
		arrLst.add("b");
		arrLst.add("c");
		
		for(int i=0; i<arrLst.size();i++) {
			System.out.println(arrLst.get(i));
		}
		System.out.println("-------------");
		String str = "madam";
		for(int i=0;i<str.length();i++){
			System.out.println(i);
			System.out.println(str.charAt(i));
		}
		System.out.println("-------------");
		int ab[]= {3,4,5,6};
		String stra[] = {"ami","vp","pra"};
		System.out.println(ab.length);
		for(int i=0;i<stra.length;i++) {
			
			System.out.println(stra[i]);
		}
		System.out.println("-------------");
		
		ArrayList<Object> nob1=new ArrayList<Object>();
		nob1.add(1);
		nob1.add("VP");
		nob1.add(40);
		nob1.add("Kori");
		System.out.println(nob1);
		for(int i=0;i<nob1.size();i++) {
			System.out.println(nob1.get(i));
		}
		
	}

}
