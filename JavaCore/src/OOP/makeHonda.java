package OOP;

public class makeHonda extends Bike {

	public void tireType() {
		System.out.println("Tubeless tires");
	}
	
	// Method overiding - Overrides bike method
	public void StartBike() {
		System.out.println("Self start the bike");
	}
	
}

//INHERITANCE