package activities;

public class Activity1 {
  
	
	
	public static void main(String[] args) {			// Main method
		// TODO Auto-generated method stub
		
		Car carName = new Car(); //Object creation
		
		carName.color = "Blue";                   // Assigning values to object
		carName.make = 2021;
		carName.transmission = "Automatic";
		carName.displaycharactersistics();
		carName.accelerate();
		carName.brake();
	}

}
