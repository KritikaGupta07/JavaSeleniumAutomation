package collectiondemos;

import java.util.ArrayList;

public class ListWithGeneric {

	public static void main(String[] args) {
		
		ArrayList<String> list1 = new ArrayList<String>();
		
		list1.add("Selenium");
		list1.add("Cypress");
		list1.add("Playwrite");
		System.out.println(list1.get(1));
		
		System.out.println(list1.remove(0));
		
		System.out.println(list1);
		
		
	}

}
