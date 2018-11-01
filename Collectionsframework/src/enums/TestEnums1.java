package enums;

public class TestEnums1 {

	public enum Calender {
		JANUARY, FUBURARY, MARCH;
	}

	public static void main(String[] args) {

		Calender j = Calender.JANUARY;
		System.out.println(j);
		TestEnums1 t = new TestEnums1();
		int s = t.sum(10, 20);
		System.out.println(s);

	}

	public int sum(int i, int j) {
		System.out.println("Sum method");
		int k = i + j;
		return k;
	}
}
