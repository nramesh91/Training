package sample.code;

import java.util.ArrayList;
import java.util.Iterator;

public class SampleArrayList {
	public static void main(String args[]){
		ArrayList<String> al = new ArrayList<String>();
		al.add("Ram");
		al.add("Sam");
		al.add("Ram");
		al.add(1, "Jan");
		System.out.println("Size: " + al.size());
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		al.remove(3);
		System.out.println("Size: " + al.size());
		System.out.println("ArrayList: " +al);
	}

}
