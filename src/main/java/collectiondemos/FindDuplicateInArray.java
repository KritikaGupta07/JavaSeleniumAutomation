package collectiondemos;

import java.util.*;
import java.util.Map.Entry;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		
		
		boolean duplicate = false;
		
		int arr[] = {12,15,89,8,9,74,52,2,0};
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		
		for(int i : arr) {
			
			if(map.containsKey(i)) {
				
				map.put(i, map.get(i) + 1);
			}
			else {
				
				map.put(i,1);
			}
		}
		
		Set<Entry<Integer, Integer>> allEntries = map.entrySet();
		
		for(Entry<Integer,Integer> en : allEntries) {
			
			if(en.getValue() > 1 ) {
				
				duplicate = true;
				System.out.println(en.getKey() + " " + en.getValue());
			}
		}
		
		if(!duplicate) {
			
			System.out.println("Duplicate not found");
		}
		
	}

}
