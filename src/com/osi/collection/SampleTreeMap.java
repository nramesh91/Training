package com.osi.collection;

import java.util.Map;
import java.util.TreeMap;

public class SampleTreeMap {
	public static void main(String args[]){
		Map<Integer, String> tm = new TreeMap();
		tm.put(101, "Ram");
		tm.put(104, "Sam");
		tm.put(103, "Guna");
		tm.put(102, "Suresh");
		tm.put(109, "Ram");
		tm.put(112, "Sam");
		tm.put(121, "Guna");
		tm.put(132, "Suresh");
		tm.put(142, "Suresh");
		
		for (Integer key : tm.keySet()){
			System.out.println("Key: " + key);
		}
		
		for (String value : tm.values()){
			System.out.println("Value: " + value);
		}
	}

}
