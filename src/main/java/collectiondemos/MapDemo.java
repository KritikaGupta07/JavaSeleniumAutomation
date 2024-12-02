package collectiondemos;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		
		
		Map<Integer, String> hm1 = new HashMap<Integer, String>();
		
		hm1.put(11, "Chitra");
		hm1.put(12, "Kiran Kumar");
		hm1.put(13, "Abhishek");
		hm1.put(14, "Neha");
		hm1.put(15, "Surthi");
		hm1.put(16, "Rushali");
		hm1.put(17, "Otwani");
		hm1.put(null, null);
		hm1.put(18, null);
		hm1.put(18, "Kritika");
		
		System.out.println("HashMap  : " + hm1);
		
		Map<Integer,String> hm2 = new LinkedHashMap<Integer, String>();
		
		hm2.put(11, "Chitra");
		hm2.put(12, "Kiran Kumar");
		hm2.put(13, "Abhishek");
		hm2.put(14, "Neha");
		hm2.put(15, "Surthi");
		hm2.put(16, "Rushali");
		hm2.put(17, "Otwani");
		hm2.put(null, null);
		hm2.put(18, null);
		hm2.put(18, "Kritika");
		
		System.out.println("LinkedHashMap  : " + hm2);
		
		Map<Integer,String> hm3 = new TreeMap<Integer, String>();
		
		hm3.put(10, "Zara");
		hm3.put(11, "Chitra");
		hm3.put(12, "Kiran Kumar");
		hm3.put(13, "Abhishek");
		hm3.put(14, "Neha");
		hm3.put(15, "Surthi");
		hm3.put(16, "Rushali");
		hm3.put(17, "Otwani");
		hm3.put(17, "Neha");
		hm3.put(18, "Kritika");
		
		System.out.println("TreeMap  : " + hm3);
	}

}
