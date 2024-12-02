package collectiondemos;

public class WrapperDemo {

	public static void main(String[] args) {
		
		int a = 10;
		Integer b = 20;
		
		System.out.println(a+b);
		
		//Boxing 
		//Primitive to corresponding wrapper or object type 
		int i = 3;
		Integer n = i;
		System.out.println("Boxing: " + n);
		
		//Unboxing
		//Converting wrapper to primitive data type
		Integer o = new Integer(34);
		int j = o;
		System.out.println("Unboxing : " + j);
	}

}
