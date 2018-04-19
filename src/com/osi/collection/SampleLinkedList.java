package com.osi.collection;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SampleLinkedList {
	public static void main(String args[]){
		List ll = new LinkedList();
		ll.add(100);
		ll.add("LinkedList");
		ll.add("Ramu");
		ll.add("Sam");
		
		Iterator itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}

}
