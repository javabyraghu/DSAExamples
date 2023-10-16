package com.app.recursion;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ArrayElementsFrequencyMinMax {
	
	public static void main(String[] args) {
		int[] arr = {10,15,15,10,12,23,45,12,10};
		Map<Integer,Integer> map = new HashMap<>();
		
		for(int element : arr) {
			if(map.containsKey(element)) {
				int val = map.get(element);
				map.put(element, val + 1);
			} else {
				map.put(element, 1);
			}
		}
		int minElement = 0;
		int minCount = arr.length;
		int  maxElement = 0;
		int  maxCount = 0;
		
		Set<Entry<Integer,Integer>> set = map.entrySet();
		
		for(Entry<Integer,Integer> entry : set ) {
			int key = entry.getKey();
			int val = entry.getValue();
			if(val > maxCount) {
				maxCount = val;
				maxElement = key;
			} if(val < minCount) {
				minCount = val;
				minElement = key;
			}
		}
		
		System.out.println(minElement +" " + maxElement);
	} 

}
