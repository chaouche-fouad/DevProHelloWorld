package awesomeSauce;

import java.util.Arrays;

public class Strings {
	public static void main (String [] args) {
		// This value of args[0] Located in program variables
		String argsOne;
		if (args.length == 0) {
			argsOne = "printThis";
		}
		else {
			argsOne = args[0];
		}
		
		System.out.println(argsOne);
		String append = new String(" and I will be happy!");
		argsOne += append;
		System.out.println("argsOne : " + argsOne + "of length " +
		    argsOne.length());
		System.out.println("##########");
		
		int toDelete = argsOne.indexOf("T");
		argsOne = argsOne.substring(0,toDelete) + argsOne.substring(toDelete +1);
		char[] argsOneToCharArray= argsOne.toCharArray();
		System.out.println(Arrays.toString(argsOneToCharArray));
		System.out.println("##########");
		
		String trimmedString="  Hello World   ".trim().replace(" ", "*");
		System.out.println(trimmedString); // Hello*World
		if (trimmedString.contains("Hello")) {
			System.out.println("contains Hello");
		}
		if (trimmedString.equalsIgnoreCase("Hello*WORLD")) {
			System.out.println("equals");
		}
		
		String greeting = "Hello world from java program";
		String[] arrayOfGreetingWords = greeting.split(" ");
		System.out.println(Arrays.toString(arrayOfGreetingWords));
		
	}

}
