package awesomeSauce;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Primes {
	
	public static void main(String [] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("out.txt"));
		PrintWriter out = new PrintWriter(bw);
		
		int i = 1;
		while (i<10000) {
			if (isPrime(i)) {
				out.println(i);
			}
			i++;
		}
		out.close();
		
		BufferedReader br = new BufferedReader(new FileReader("out.txt"));
		
		int target = 54225;
		int remaining = target;
		int nextPrime = 1;
		String factorization = "";
		while (remaining > 1) {
			do {
				nextPrime = Integer.parseInt(br.readLine());
			}
			while (remaining % nextPrime != 0);
			while (remaining % nextPrime == 0) {
				remaining /= nextPrime;
				factorization += nextPrime + " ";
			}
		}
		
		System.out.println("Prime factorization of : " + target + " is " + factorization);
	}
	
	public static boolean isPrime(int k) {
		
		if (k == 1) return false;
		
		int stop = (int) Math.sqrt(k);
		int i = 2;
		
		while (i <= stop) {
			if (k%i == 0) return false;
			i++;
		}
		
		return true;
	}
}
