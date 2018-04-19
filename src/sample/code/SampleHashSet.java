package sample.code;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SampleHashSet {
	public static void main(String args[]){
		Set<String> hs = new HashSet<String>();
		hs.add("Ram");
		hs.add("Sam");
		hs.add("Aam");
		System.out.println("Size: " + hs.size());
		Iterator<String> itr = hs.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
