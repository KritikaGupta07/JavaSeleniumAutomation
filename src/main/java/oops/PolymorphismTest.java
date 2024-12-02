package oops;

public class PolymorphismTest {

	// Compile Time Polymorphism

	public static void main(String[] args) {

		PolymorphismTest obj = new PolymorphismTest();
		obj.add(23, 9, 8);
		obj.add(10, 123);
		obj.add(12.4,23.9);
	}

	public void add(double a, double b) {

		double c = a + b;
		System.out.println("Sum of two number is: " + c);
	}

	public void add(int a, int b) {

		int c = a + b;
		System.out.println("Sum of two number is: " + c);
	}

	public void add(int a, int b, int c) {

		int d = a + b + c;
		System.out.println("Sum of three number is: " + d);
	}

}
