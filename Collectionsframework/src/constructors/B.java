package constructors;

public class B extends A {

	public B() {
		super(); // Super key word should be first calling statement and its purpose is to call
				 // the parent class constructor
		System.out.println("child class constructor");
	}

	public B(int i) {
		super(10);
		System.out.println("child class one param");
	}

	public static void main(String[] args) {

		B b = new B();
		B b1 = new B(10);

	}

}
