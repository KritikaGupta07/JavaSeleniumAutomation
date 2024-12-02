package oops;


class TestRun{
		
	public static void main(String[] args) {
			
		Bicycle b1 = new Bicycle();
		b1.changeGear(2);
		b1.speedUp(3);
		b1.applyBrakes(1);

		System.out.println("Bicycle present state : ");
		b1.printStates();

		Bike b2 = new Bike();
		b2.changeGear(1);
		b2.speedUp(4);
		b2.applyBrakes(3);

		System.out.println("Bike present state : ");
		b2.printStates();
	}
}