package oops;

public class HRTeam extends ITDepart {

	public static void main(String[] args) {
		
		HRTeam hr = new HRTeam();
		hr.goodies();
		hr.work();
		hr.salary();
		hr.bonus();
		
		
		ITDepart it = new HRTeam();
		it.goodies();
		it.work();
		it.salary();
		
		
		//ITDepart it1 = new ITDepart();
		// If our class is not fully implemented  then  we will not allow to create object
	}

	@Override
	public void salary() {
		
		System.out.println("5LPA");
	}
	
	public void bonus() {
		System.out.println("1 Lakh");
	}

}
