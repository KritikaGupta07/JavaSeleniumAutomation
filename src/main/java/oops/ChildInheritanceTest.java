package oops;

public class ChildInheritanceTest extends InheritanceTest {

	public void mul() {

		System.out.println("Method from child class for multiplication.");
	}

	public void div() {

		System.out.println("Method from child class for division.");
	}

	public static void main(String[] args) {
		
		// reference matter the most here
		
		ChildInheritanceTest ch = new ChildInheritanceTest();
		// Child class object and child class references will allow to access base class as well as child class methods.
		
		ch.add(); // Base class method
		ch.sub(); // Base class method
		ch.div(); // Child class method
		ch.mul(); // Child class method
		
		InheritanceTest obj = new InheritanceTest();
		// Base class object and base class references will allow to access only base class methods
		obj.add(); // Base class method
		obj.sub(); // Base class method
		
		
		InheritanceTest ob = new ChildInheritanceTest();
		// Child class object and base class references will allow to access only base class methods		
		ob.add(); // Base class method
		ob.sub(); // Base class method
		
		//ChildInheritanceTest c = new InheritanceTest();
		// Base class object and child class references is invalid		

		
	}
}
