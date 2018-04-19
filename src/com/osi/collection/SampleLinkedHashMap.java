package com.osi.collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class SampleLinkedHashMap {
	public static void main(String args[]){
		Map<Integer, String> lhm = new LinkedHashMap();
		lhm.put(101, "Ram");
		lhm.put(104, "Sam");
		lhm.put(103, "Guna");
		lhm.put(102, "Suresh");
		lhm.put(109, null);
		lhm.put(112, "Sam");
		lhm.put(121, null);
		lhm.put(132, "Suresh");
		lhm.put(null, "Naresh");
		
//		for (Integer key : lhm.keySet()){
//			System.out.println("Key: " + key);
//		}
//		
//		for (String value : lhm.values()){
//			System.out.println("Value: " + value);
//		}
		
		System.out.println(lhm);
		
		lhm.remove(null);
		
		System.out.println(lhm);
		
		
	}

}
