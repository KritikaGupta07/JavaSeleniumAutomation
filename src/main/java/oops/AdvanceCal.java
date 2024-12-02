package oops;

public class AdvanceCal implements Calc {

	public static void main(String[] args) {
		
		AdvanceCal obj1 = new AdvanceCal();
		
		obj1.add();
		obj1.sub();
		obj1.mul();
		obj1.div();

	}

	public void mul() {

		System.out.println("I am in mul method.");
	}

	public void div() {

		System.out.println("I am in div method.");
	}

	@Override
	public void add() {

		System.out.println("I am in add method.");
	}

	@Override
	public void sub() {

		System.out.println("I am in sub method.");
	}

}
