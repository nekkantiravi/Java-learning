package MethodOverloading;

public class MethodOverloading {

	public static void main(String[] args) {
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 30);
		obj.main(40);
		obj.main(20, "ravi");
	

	}

	public static void main(int p) {
      System.out.println("main method");
	}

	public static void main(int q, String string) {
		System.out.println(q +string);
		//System.out.println(p);

	}
//you can overload main method also
//you can not create a method inside a method
//duplicate methods: i.e same method name with same number of arguments is not allowed

//method overloading--When the method name is same with different input parameters with different data types with in the same class
	public void sum() {
		System.out.println("Sum method..zero parameters");
	}

	public void sum(int i) {
		System.out.println("sum method..1 input parameter:" + i);

	}

	public void sum(int k, int j) {
		System.out.println("sum method..2 input parameter:" + (k + j));
	}
}