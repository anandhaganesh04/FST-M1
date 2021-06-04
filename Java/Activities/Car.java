package activities;

public class Car {
String color;
String transmission;
int make;
int tyres;
int doors;

 public Car() {						//Constructor
		
		tyres = 4;
		doors = 4; 
   } 
   


public void displaycharactersistics() {
	   System.out.println(color);
	   System.out.println(make);
	   System.out.println(transmission);
	   
   }
   public void accelerate() {
	   System.out.println("Car is moving forward");
   }
   public void brake() {
	   System.out.println("Car has stopped");
	  
   }
}
