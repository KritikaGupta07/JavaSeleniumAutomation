package collectiondemos;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapKeyStringValueListInteger {

	public static void main(String[] args) {
		
		
		Map<String, List<Integer>> map = new HashMap<String, List<Integer>>();
		
		map.put("Samir", Arrays.asList(1234,6578,1987));
		
		map.put("Chitra", Arrays.asList(12376,19987));
		
		map.put("Himanshu", Arrays.asList(187234,3456578,1900087,76548,9840098));
		
		System.out.println(map);
		
		System.out.println(map.get("Himanshu").get(2));
		
 	}

}
