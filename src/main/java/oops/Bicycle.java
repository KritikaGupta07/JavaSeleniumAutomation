package oops;

class Bicycle implements Vehicle{
	
	int speed;
	int gear;

	public void changeGear(int newGear) {
		
		gear = newGear;
	}

	public void speedUp(int increament) {
			
		speed = speed + increament;
	}

	public void applyBrakes(int decreament) {
			
		speed = speed - decreament;
			
	}
		
	public void printStates() {
			
		System.out.println("Speed " + speed + " Gear : " + gear);
	}
		
}