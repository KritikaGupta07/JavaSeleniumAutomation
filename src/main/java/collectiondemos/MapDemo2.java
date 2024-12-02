package collectiondemos;

import java.util.LinkedHashMap;
import java.util.*;
import java.util.Map;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<String, Object> student = new LinkedHashMap<String, Object>();
		
		student.put("Name", "Dinesh");
		student.put("Phone", 654789);
		student.put("City", "BLR");
		student.put("Paid", true);
		
//		String[] coureses = new String[3];
//		 
//		coureses[0] = "Java";
//		coureses[1] = "Selenium";
//		coureses[2] = "API";
//		student.put("Courses", coureses);  // at the courses it will display the reference because array is a reference data type
		
		List<String> courselist = new LinkedList<String>();
		courselist.add("Java");
		courselist.add("Selenium");
		courselist.add("API");
		
		student.put("Courses", courselist);
		
		System.out.println(student);
		
	}

}
