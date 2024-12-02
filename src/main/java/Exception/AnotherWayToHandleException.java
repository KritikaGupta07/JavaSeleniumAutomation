package Exception;

public class AnotherWayToHandleException {

	public static void main(String[] args) {
		
		System.out.println("Program started...");
		
		System.out.println("Program in progress...");
		
		try {
			
			Thread.sleep(5000);
		}
		
		catch(Exception e) {
			
			System.out.println(e.getMessage());
		}
		
		System.out.println("Program finished...");
		
		System.out.println("Program exited...");
	}

}
