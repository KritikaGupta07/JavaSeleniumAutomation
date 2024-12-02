package collectiondemos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ListExample2 {

	public static void main(String[] args) {
		
		System.out.println(args);

		// list, collection, iterable interface methods are accessible
		List l1 = new ArrayList(); 
		
		//Collection and iterable interface are accessible 
		Collection l2 = new ArrayList();
		
		//Only Iterable interface methods are accessible
		Iterable l3 = new ArrayList();
		
		
		//ArrayList Class, List, Collection, Iterable interface s methods are accessible
		ArrayList l4 = new ArrayList();
		
		// only object methods are accessible
		Object l5 = new ArrayList();
				
	}

}
