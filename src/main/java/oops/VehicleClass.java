package oops;

public class VehicleClass {
	
	String brand;
	
	public VehicleClass(String brand) {
		
		this.brand = brand;
	}
	
	public void displayInfo() {
		
		System.out.println("Vehicle brand : " + brand);
	}

}
