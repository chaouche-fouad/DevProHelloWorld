package awesomeSauce;

public class FlowIfElse {
	public static void main(String args[]) {
		double lenghtX = 1.42;
		double lenghtY = 3.14;
		double area;
		boolean isTriangle = true;
		if (isTriangle) {
			area = lenghtX * lenghtY / 2.0;
		}
		else {
			area = lenghtX * lenghtY;
		}
		System.out.printf("Your shape has area of %f Unites",area);
	}

}
