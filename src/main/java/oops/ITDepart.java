package oops;

public abstract class ITDepart implements Employee {

	

	@Override
	public abstract void salary();
	
	
	@Override
	public void goodies() {
		
		System.out.println("Laptop");
	}

	@Override
	public void work() {
		
		System.out.println("Automation");
		
	}

}
