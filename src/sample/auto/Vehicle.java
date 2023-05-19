package sample.auto;

public class Vehicle {

	String type="Vehicle";

	public void start() {
        
		System.out.println(type+" starts");
	}

	public void stop() {
		System.out.println(type+" stops");
	}

	public void start(String Update) {

		System.out.println( Update+"Button start");
	}

	class Car extends Vehicle{
			
		
	}

	class Bus extends Vehicle{
	
		
	}
	class Bike extends Vehicle{
	
		
	}
	

	
	public static void main(String[] args) {

	}
}
