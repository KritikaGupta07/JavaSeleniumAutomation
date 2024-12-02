package collectiondemos;

import java.util.*;
import java.util.Map.Entry;

public class FindDuplicate {

	public static void main(String[] args) {
		
		
		String str = "Selenium";
		
		char[] ch = str.toCharArray();
		
		Map<Character,Integer> map = new HashMap<Character, Integer>();
		
		for(char c : ch) {
			
			if(map.containsKey(c)) {
				
				map.put(c, map.get(c) + 1);
				
			}
			else {
				
				map.put(c,1);
			}
			
		}
		
		System.out.println(map);
		
		Set<Entry<Character, Integer>> allEntries = map.entrySet();
		
		for(Entry<Character, Integer> en : allEntries) {
			
			System.out.println("Key : " + en.getKey() + " Value is : " + en.getValue());
		}
		
	}

}
