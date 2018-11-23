package Polymorphism;

public class BMW extends Car {
//When same methods is present in parent class and child class with same name and same number arguments is called method overriding
	public void start() {
		System.out.println("BMW start method");
	}
	public void engine() {
		System.out.println("BMW engine method");

	}
	public void theftSafety() {
		System.out.println("BMW theftSafety method");
	}

}
