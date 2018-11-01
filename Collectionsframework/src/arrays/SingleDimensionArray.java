package arrays;

public class SingleDimensionArray {

	public static void main(String[] args) {

		// Array:to store similar data type values in a array variable
		//One  dimensional array
		
		//Advantages: In a single variable we can store multiple values
		//Dis-advantages:
		//1.Size is fixed-static array-To over come this problem we will use collections in java--arraylist--hashtable=>Dynamic arrays
		//2.Stores only similar data types---to over come of this problem we use object array.
		
		// #1:Int aaray
		// lowest bound/index=0
		// upper bound/index=n-1(n is the size of the array)

		int i[] = new int[4];

		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;

		System.out.println(i[2]);
		// System.out.println(i[4]); //ArrayIndexOutOfBoundsException

		System.out.println(i.length);// Size/length of the array

		// print all the values of array
		for (int j = 0; j < i.length; j++) {
			System.out.println(i[j]);
		
		}
		//2. double array

		double d[] = new double[3];

		d[0] = 12.122;
		d[1] = 44.44;
		d[2] = 55.55;

		System.out.println(d[2]);

		// 3.char array

		char c[] = new char[3];
		c[0] = 'r';
		c[2] = '2';
		System.out.println(c[0]);
		
		//4. boolean array

		boolean b[] = new boolean[2];
		b[0] = true;
		b[1] = false;
		
		//5.string array

		String s[] = new String[3];
		s[0] = "selenium";
		s[1] = "automation";
		s[2] = "arrays";
		System.out.println(s.length);
		System.out.println(s[2]);
		for (int j = 0; j < s.length; j++) {
			System.out.println("String array :" +s[j]);
		}
		//6. Object array(Object is a class--is used to store different data type values)
		
		Object ob[]=new Object[4];
		
		ob[0]='m';
		ob[1]=22.22;
		ob[2]="tom";
		ob[3]=true;
		System.out.println(ob[3]);
		
		for(int k=0; k<ob.length;k++) {
			System.out.println(ob[k]);
		}
		

	}

	}
