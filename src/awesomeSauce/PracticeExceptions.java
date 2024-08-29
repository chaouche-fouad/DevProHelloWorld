package awesomeSauce;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PracticeExceptions {
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float x = 7;
		int y = 0;
		while(true){
		    try{
		        System.out.println("Insert an Integer: ");
		        y =sc.nextInt();
		        break;
		    }catch(InputMismatchException e){
		        System.out.println("Invalid Input, try again.");
		        
		        sc.next();
		    }finally {
		    	System.out.println("x = " + x);
		    	System.out.println("y = " + y);
		    	System.out.println("--------------------");
		    }
		}
		float result = x / y;
		System.out.println("result = "+result);
	}

}
