package collectiondemos;

import java.util.ArrayList;

public class ListWithGeneric2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		
		list1.add(12);
		list1.add(15);
		list1.add(13);
		list1.add(12);
		
		System.out.println(list1);
		
		ArrayList<Double> list2 = new ArrayList<Double>();
		
		list2.add(12.98);
		list2.add(15.9);
		list2.add(13.0);
		list2.add(12.2);
		
		System.out.println(list2);
		
		ArrayList<Object> list3 = new ArrayList<Object>();
		list3.add("Selenium");
		list3.add('A');
		list3.add(12);
		list3.add(45.7);
		list3.add(true);
		list3.add(list2);
		
		System.out.println(list3);
	}
	

}
