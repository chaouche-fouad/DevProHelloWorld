package awesomeSauce;

import java.util.ArrayList;

public class Exceptions {
	public static void main(String[] args){
		int x = 3;
		int[] y = new int[1];
		ArrayList<String> z = null;
		
		try {
			x /= 0;	
		}catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("You tried to divide by zero, Not allowed ");
			System.out.println(e);
		}finally {
			System.out.println("ArithmeticException was capched");
		}
		System.out.println("------------------------");
		try {
			y[2] = 3;
		} catch (ArrayIndexOutOfBoundsException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println(e);
		}finally {
			System.out.println("ArrayIndexOutOfBoundsException was catched");
		}
		System.out.println("------------------------");
		try {
			z.get(3);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}finally {
			System.out.println("NullPointerException was catched");
		}
		System.out.println("------------------------");
		
		System.out.println("All Exception was catched");
		
	}
}
