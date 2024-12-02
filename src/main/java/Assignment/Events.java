package Assignment;

import java.util.*;

public class Events {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("All participate register your name here (type 'done' for finish) : ");
		
		HashSet<String> name = new HashSet<String>();
		
		while(true) {
			
			String str = sc.nextLine();			
			
			if(str.equalsIgnoreCase("done")) {
				
				break;
			}
			
			name.add(str);
		}
		
		System.out.println("Name of all the registered participate " );
		
		for(String s : name) {
			
			System.out.println("- " + s);
		}
		
		sc.close();

	}

}
