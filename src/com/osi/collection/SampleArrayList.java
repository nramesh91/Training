package com.osi.collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class SampleArrayList {
	public static void main(String args[]){
		List al = new ArrayList();
		al.add(100);
		al.add("Collection");
		al.add("Ammu");
		al.add("Ramu");
		al.add("Ammu");
//		for(String s : al){
//			System.out.println(s);
//		}
		
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
