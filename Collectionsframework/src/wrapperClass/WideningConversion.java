package wrapperClass;

public class WideningConversion {

	public static void main(String[] args) {

		// Type conversion:Widening or Automatic Type Conversion
		// When you assign value of one data type to another, the two types might not be
		// compatible with each other. If the data types are compatible, then Java will
		// perform the conversion automatically known as Automatic Type Conversion and
		// if not then they need to be casted or converted explicitly. For example,
		// assigning an int value to a long variable.
		// Widening conversion takes place when two data types are automatically
		// converted. This happens when:
		// The two data types are compatible.
		// When we assign value of a smaller data type to a bigger data
		// type.{Byte-short-int-long-float-double}

		int i = 100;
		// automatic type conversion
		long l = i;
		// automatic type conversion
		float f = i;
		// automatic type conversion
		double d = i;

		System.out.println("int value:" + i);
		System.out.println("long value:" + l);
		System.out.println("float value:" + f);
		System.out.println("double value:" + d);
	}

}
