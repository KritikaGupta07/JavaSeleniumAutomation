package Exception;

public class TryCatchFinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program Started...");
		
		try {
			
			String s = null;
			
			System.out.println("Length of string is : " + s.length());
			
		}
		
		catch(Exception e) {
			
			System.out.println("Catch block will handle the exception");
			
			System.out.println(e.getMessage());
		}
		
		finally {
			
			System.out.println("You entered into the finally block");
		}
		
		System.out.println("Program Completed...");
		
		System.out.println("Program exited...");

	}

}
