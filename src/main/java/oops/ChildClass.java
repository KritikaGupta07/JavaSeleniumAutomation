package oops;

public class ChildClass extends Parent {

	public void display() {

		System.out.println("I am in child class display method.");
	}

	public void display(String name) {

		System.out.println("I am in child class display method with a name variable: " + name);
	}

	public static void main(String[] args) {

		
		ChildClass c = new ChildClass();
		c.display();
		
		Parent p  = new Parent();
		p.display(); 
		
		
		// remember this for method overriding case.
		Parent obj = new ChildClass();
		obj.display();  // if  having the same method  , creating the object of childclass and referenceing 
						//to parent class then child class method will be called.
	}

}
