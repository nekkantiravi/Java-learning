package strings;

public class CalculateSunOfNumbersInArray {
	
	public int sumOfNumbers() {
		int []a= {10,20,30,40};
		int sum=0;
		for(int array:a) {
			sum=sum+array;
			System.out.println(sum);
		}
		return sum;
	}

	public static void main(String[] args) {
		CalculateSunOfNumbersInArray obj=new CalculateSunOfNumbersInArray();
	    System.out.print(obj.sumOfNumbers());
	}

}
