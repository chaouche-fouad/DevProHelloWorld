package pkg;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
	
	public static void main(String[] args) {
		Random rng = new Random();
		int correctAnswer = rng.nextInt(0,101);
		
		Scanner sc = new Scanner(System.in);
		int rounds = 0;
		int lastGuessed = -1;
		System.out.print("Enter a number [0 , 100] : ");
		while (notGuessed(lastGuessed,correctAnswer)) {
			do {
				lastGuessed = sc.nextInt();
			}while(isInvalidInput(lastGuessed));
			rounds++;
			System.out.print(reportComparison(lastGuessed,correctAnswer,rounds));
			
		}
		
		
	}
	
	
	static String reportComparison(int lastGuessed, int correctAnswer,int times) {
		// TODO Auto-generated method stub
		if (lastGuessed > correctAnswer) {
			return "Too high : ";
		}
		else if (lastGuessed < correctAnswer) {
			return "Too low : ";
		}
		
		return "Correct in " + times + " times";
	}


	// TODO Make tests pass
	public static boolean isInvalidInput(double d) {
		// TODO Auto-generated method stub
		if ((int)d != d || d > 100 || d < 0) return true;
		return false;
	}

	public static boolean notGuessed(int i, int j) {
		// TODO Auto-generated method stub
		if (i == j) return false;
		return true;
	}

}
