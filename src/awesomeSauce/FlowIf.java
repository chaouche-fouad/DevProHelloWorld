package awesomeSauce;

public class FlowIf {
	public static void main(String[] args) {
		int testNumber = -3;

		if (testNumber <= 0) {
			System.out.println("Less than or equal to zero");
			
		}
		if(testNumber > 6) {
			System.out.println("Greater than six");
		}
		System.out.println("This will print no matter what.");
	}

}
