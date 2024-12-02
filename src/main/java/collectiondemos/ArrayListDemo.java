package collectiondemos;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList list1 = new ArrayList();
		
		list1.add(10);
		list1.add(15.5);
		list1.add(true);
		list1.add(10);
		list1.add(null);
		list1.add("Selenium");
		list1.add('a');
		
		System.out.println(list1);
		
		list1.add(3, "Java");
		System.out.println(list1);
		
		System.out.println(list1.size());
		
		System.out.println(list1.remove(0));
		
		System.out.println(list1);
		
		System.out.println(list1.get(6));
		
		System.out.println(list1.set(6,'A'));
		
		System.out.println(list1);
		
		System.out.println(list1.contains("Java"));
		
		System.out.println(list1.isEmpty());
		
		System.out.println(list1);
	}

}
