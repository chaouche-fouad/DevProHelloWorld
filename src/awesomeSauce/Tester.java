package awesomeSauce;

public class Tester {
	public static void main (String[] args) {
		double circleRadius = 3;
		final double pi = 3.1415;
		double area = circleRadius * circleRadius *pi;
		System.out.println("My circle has an area of " + area + " Units");
		circleRadius += 2;
		area = circleRadius * circleRadius *pi;
		System.out.println("My circle has an area of " + area + " Units");
	}

}
