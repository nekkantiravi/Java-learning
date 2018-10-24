package Polymorphism;

public class TestCar {

	public static void main(String[] args) {
		// Static polymorphism or compile time polymorphism
		BMW b = new BMW();
		b.engine();
		b.fuel();
		b.theftSafety();
		b.start();
		b.steering();

		System.out.println("#######");

		Car c = new Car();
		c.engine();
		c.start();
		c.steering();

		System.out.println("*************");
		// Top casting
		Car c1 = new BMW();// child class object can be referred by parent class reference
							// variable--Dynamic polymorphism/run time poly..
		c1.engine();
		c1.start();
		c1.fuel();
		c1.steering();

		System.out.println("@@@@@@@@@@@");

		// Downcasting
		BMW b1 = (BMW) new Car();

		b1.engine();
		b1.theftSafety();

	}

}
