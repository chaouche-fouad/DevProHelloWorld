package awesomeSauce;

import java.util.Random;

public class MathLibrary {
	public static void main(String [] args) {
		
		double exp = Math.E;
		System.out.println(exp); // 2.718281828459045
		System.out.println(Math.floor(exp)); // 2.0
		System.out.println(Math.round(exp)); // 3
		System.out.println(Math.ceil(exp)); // 3.0
		exp = -exp;
		System.out.println(exp); // -2.718281828459045
		System.out.println(Math.abs(exp)); // 2.718281828459045
		exp = -exp;
		System.out.println(Math.round(exp*100) / 100.0); // 2.72
		System.out.println("###########");
		
		System.out.println(Math.tan(Math.PI/4)); // 0.9999999999999999
		System.out.println(Math.tan(Math.toRadians(45.0))); // 0.9999999999999999
		System.out.println("###########");
		
		double x = Math.pow(3.5, 2); 
		System.out.println(x); // 12.25
		System.out.println(Math.sqrt(x)); // 3.5
		System.out.println(Math.log(x)); // 2.505525936990736
		System.out.println(Math.log10(x)); // 1.0881360887005513
		System.out.println("###########");
		
		double randomNumber= Math.random();
		System.out.println(randomNumber); // 0.30795473258377337
		
		Random rng = new Random();
		int randomInteger = rng.nextInt(4); 
		System.out.println(randomInteger); // 0,1,2,3
	}

}
