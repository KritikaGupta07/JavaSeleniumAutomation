package collectiondemos;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem {

	public static void main(String[] args) {
		
		List<String> morning = new ArrayList<String>();
		morning.add("Samir");
		morning.add("Dinesh");
		morning.add("Neha");
		morning.add("Chitra");
		System.out.println("Morning Batch Student: " + morning);
		
		List<String> evening = new ArrayList<String>();
		evening.add("Anu");
		evening.add("Ritika");
		evening.add("Sirish");
		evening.add("Suraj");
		System.out.println("Evening Batch Student: " + evening);
		
		List<String> weekend = new ArrayList<String>();
		weekend.add("Abhishek");
		weekend.add("Deepika");
		System.out.println("Weekend Batch Student : "+ weekend);
		
		List<List<String>> masterbatch = new ArrayList<List<String>>();
		masterbatch.add(morning);
		masterbatch.add(evening);
		masterbatch.add(weekend);
		
		System.out.println("Master Batch Student : " + masterbatch);
		
		System.out.println(masterbatch.get(2));
		
		
		
		
 
	}

}
