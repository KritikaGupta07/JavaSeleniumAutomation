package collectiondemos;

import java.util.*;
import java.util.Map.Entry;

public class MapExample {

	public static void main(String[] args) {
		
		
		Map<String,String> m1 = new HashMap<String,String>();
		
		m1.put("Se", "Selenium");
		
		m1.put("Je", "Jenkins");
		
		m1.put("Tn", "TestNG");
		
		Set<Entry<String,String>> allEntries = m1.entrySet();
		
		System.out.println(allEntries);
		
		for(Entry<String,String> en : allEntries) {
			
			System.out.println("Key : " + en.getKey() + " Values : " + en.getValue());
		}
		
	}

}
