package awesomeSauce;

public class FlowSwitch {
	public static void main(String args[]) {
		int monthOfYear = 5;
		switch (monthOfYear) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		default:
			System.out.println("None of the months in program ...");
			break;
		}
	}

}
