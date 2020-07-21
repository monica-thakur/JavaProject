package practice;

public class testCar {

	public static void main(String[] args) {
		BMW b = new BMW();
		b.start();
		b.stop();
		b.refuel();
		b.autoParking();
		b.engine();
	
		
		System.out.println("-----");
		
		Car c = new Car();
		c.start();
		c.stop();
		c.refuel();
		c.engine();
		
		System.out.println("------");
		
		Vehicle v= new Vehicle();
		v.engine();
		
		
	}

}


