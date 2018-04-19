package com.osi.collection;

import java.util.HashMap;
import java.util.Map;

public class SampleHashMap {
	public static void main(String args[]){
		Map<Integer, String> hm = new HashMap();
		hm.put(101, "Ram");
		hm.put(104, "Sam");
		hm.put(103, "Guna");
		hm.put(102, "Suresh");
		hm.put(109, null);
		hm.put(112, "Sam");
		hm.put(121, null);
		hm.put(132, "Suresh");
		hm.put(null, "Naresh");
		
//		for (Integer key : hm.keySet()){
//			System.out.println("Key: " + key);
//		}
//		
//		for (String value : hm.values()){
//			System.out.println("Value: " + value);
//		}
		
		System.out.println(hm);
		
		hm.remove(null);
		
		System.out.println(hm);
		
		
	}

}
