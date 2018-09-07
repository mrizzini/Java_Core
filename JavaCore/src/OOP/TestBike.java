package OOP;

public class TestBike {

	public static void main(String[] args) {

		Bike bike = new Bike();
		
		bike.color = "Black";
		bike.StartBike();
		
		makeHonda honda = new makeHonda();
		honda.color = "Blue";
		honda.StartBike(); // makeHonda
		honda.tireType();
		
		
		Bike bike1 = new makeHonda();
		bike1.StartBike(); // makeHonda
		bike1.stopBike(); // bike
		
		
	}

}

//INHERITANCE
