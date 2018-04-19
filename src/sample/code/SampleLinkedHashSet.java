package sample.code;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class SampleLinkedHashSet {
	public static void main(String args[]){
		Set<String> lhs = new LinkedHashSet<String>();
		lhs.add("Ram");
		lhs.add("Sam");
		lhs.add("");
		lhs.add("Aam");
		
		System.out.println("Size: " + lhs.size());
		Iterator<String> itr = lhs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
