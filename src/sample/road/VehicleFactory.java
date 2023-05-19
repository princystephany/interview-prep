package sample.road;

import sample.auto.Vehicle;

public class VehicleFactory {

	public static void main(String[] args) {
 
		Car c=new Car();
		Bus b=new Bus();
		Bike m=new Bike();
			
 		c.car();
		b.bus();
		m.bike();

		
		
	}

}
