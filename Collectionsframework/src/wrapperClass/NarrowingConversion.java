package wrapperClass;

public class NarrowingConversion {

	public static void main(String[] args) {
		// char ch = 'c';
		// int num = 88;
		// ch = num; //Compile time error: Possible lossy conversion from int to char

		// if we want to assign a value of larger data type to a smaller data type we
		// perform explicit type casting or narrowing.{double-float-long-int-short-byte}

		double d = 100.24;

		// explicit type casting
		int i = (int) d;
		// explicit type casting
		long l = (long) d;
		// explicit type casting
		float f = (float) d;

		System.out.println("int value:" + i);
		System.out.println("long value:" + l);
		System.out.println("float value:" + f);
	}

}
