package sample.code;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class SampleLinkedList {
	public static void main(String args[]){
		List<String> ll = new LinkedList<String>();
		ll.add("Ram");
		ll.add("Sam");
		ll.add("Ram");		
		ll.add(1, "Jan");
		System.out.println("Size: " + ll.size());
		ll.remove(3);
		ListIterator<String> itr = ll.listIterator();  
		while(itr.hasNext())
			System.out.println(itr.next());
		while(itr.hasPrevious())
			System.out.println(itr.previous());
	}

}
