package awesomeSauce;

public class StaticMethods {
	public static void main(String[] args) {
		System.out.println(power(3,2)); // 9.0
		System.out.println(power(3,5)); // 243.0
		System.out.println(factorial(4)); // 24
		printError("Error text"); // Error text
		
	}

	private static void printError(String s) {
		// TODO Auto-generated method stub
		System.out.println(s);
		return;
	}

	private static double power(double base, int power) {
		// TODO Auto-generated method stub
		double ret = 1.0;
		while(power > 0) {
			ret *= base;
			power--;
		}
		return ret;
	}
	
	private static int factorial(int i) {
		if (i == 1) 
			return 1;
		return factorial(i-1)*i;
	}

		
}
