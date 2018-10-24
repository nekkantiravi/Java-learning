package functionsInJava;

public class FunctionsInJava {

	public static void main(String[] args) {
		FunctionsInJava obj = new FunctionsInJava();

		obj.test();
		int z = obj.sum();
		System.out.println(z);

		String v = obj.pqr();
		System.out.println(v);
		int k = obj.div(30, 10);
		System.out.println(k);
	}

	// no input and no output
	// void does not return any value
	public void test() {
		System.out.println("test method");
	}

	// no input but some output
	public int sum() {
		System.out.println("sum method");
		int a = 10;
		int b = 20;
		int c = a + b;
		return c;

	}

	public String pqr() {
		System.out.println("PQR method");
		String s = "nekkanti";
		return s;
	}
	//// some input but some output

	public int div(int s, int J) {
		System.out.println("div method");
		int l = s / J;
		return l;

	}

}
