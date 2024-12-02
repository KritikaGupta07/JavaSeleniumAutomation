package StringDemo;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class StringTestDemo {

	public static void main(String[] args) {
		
		String str = "Java Selenium";
		
		//length()
		System.out.println("length() function : " + str.length());
		
		
		//charAt()
		char c = str.charAt(10);
		System.out.println("charAt() : " + c);
		
		System.out.println("charAt() : " + str.charAt(10));
		
		
		//substring(i)
		System.out.println("substring() : " + str.substring(2));
		
		//substring(i,j)
		System.out.println("substring() : " + str.substring(2,10));  
		
		
		String str1 = "Java";
		String str2 = "Play";
		
		//concat
		String out = str1.concat(str2);
		
		System.out.println("concat() : " + out);
		
		//indexOf()
		String s = "Learn Share And Grow";
		System.out.println("indexOf() : " + s.indexOf("And"));
		
		System.out.println("indexOf() : " + s.indexOf("play"));
		
		//indexOf(String s,int i)
		System.out.println("indexOf() : " + s.indexOf("ro", 5));
				
		//lastIndexOf(String s)
		System.out.println("lastIndexOf() : " + s.lastIndexOf("e"));
		
		//equals()
		String c1 = "Geeks";
		String c2 = "geeks";
		String c3 = "Geeks";
		System.out.println("equals() : " + c1.equals(c2));
		System.out.println("equals() : " + c1.equals(c3));
		
		//equalsIgnoreCase()
		System.out.println("equalsIgnoreCase() : " + c1.equalsIgnoreCase(c2));
		System.out.println("equalsIgnoreCase() : " + c2.equalsIgnoreCase(c3));
		
		//compareTo()
		System.out.println(c1.compareTo(c2));
		System.out.println(c1.compareTo(c3));
		System.out.println(c2.compareTo(c3));
		
		//compareToIgnoreCase()
		System.out.println(c1.compareToIgnoreCase(c2));
		System.out.println(c1.compareToIgnoreCase(c3));
		System.out.println(c2.compareToIgnoreCase(c3));
		
		
		String s1 = "    Learn Share Learn  ";
		
		//trim()
		System.out.println(s1.trim());
		
		String s2 = "HeLLO";
		
		String s3 = "heLlO";
		
		//toLowerCase()
		System.out.println(s2.toLowerCase());
		
		//toUpperCase()
		System.out.println(s3.toUpperCase());
		
		//replace(oldChar, newchar)
		System.out.println(s3.replace('h', 'H'));
		
		//contains()
		String r1 = "Java Selenium Course";
		String r2 = "Selenium";
		String r3 = "check";
		
		System.out.println(r1.contains(r2));
		System.out.println(r1.contains(r3));
		
		//toCharArray()
		char[] ch = r2.toCharArray();
		System.out.println(ch);
		
		//startswith(string)
		System.out.println(r1.startsWith(r2));
		System.out.println(r1.startsWith(r3));
		
	}

}
