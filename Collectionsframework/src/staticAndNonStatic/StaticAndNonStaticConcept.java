package staticAndNonStatic;

public class StaticAndNonStaticConcept {

	String name = "ravi";
	static int i = 10;

	public void sendMail() {
		System.out.println("Send mail method");
	}

	public static void sum() {
		System.out.println("Sum method");
	}

	public static void main(String[] args) {

		// how to call static methods and variables?
		sum();// direct calling

		StaticAndNonStaticConcept.sum();// calling by class name

		// how to call non static var.. and methods?
		StaticAndNonStaticConcept obj = new StaticAndNonStaticConcept();// by creating object
		System.out.println(obj.name);
		obj.sendMail();

		// can i access static methods by object reference?Yes we can access but not
		// recommended
		obj.sum();
	}

}
