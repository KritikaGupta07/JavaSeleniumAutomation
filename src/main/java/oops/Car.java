package oops;

public class Car extends VehicleClass {
	
	String model;
	
	public Car(String brand, String model) {
		
		super(brand);
		this.model = model;
	}
	
	public void displayInfo() {
		
		super.displayInfo();
		System.out.println("Model Name from Car Class");
	}

	public static void main(String[] args) {
		
		Car c1 = new Car("Mercedes","1926");
		c1.displayInfo();
		Car c2 = new Car("BMW","1927");
		c2.displayInfo();
		Car c3 = new Car("Audi","1965");
		c3.displayInfo();

	}

}
