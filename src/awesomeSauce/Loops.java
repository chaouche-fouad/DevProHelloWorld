package awesomeSauce;

import java.util.ArrayList;

public class Loops {
	public static void main(String [] args) {
		int  i = 0;
		while(i<10) {
			System.out.println(i);
			i++;
		}
		
		System.out.println("##########");
		
		int[] arr = {1,2,3};
		i=0;
		while (i < arr.length) {
			System.out.println(arr[i]);
			i++;
		}
		System.out.println("##########");
		i=2;
		do {
			System.out.println(arr[i]);
			i--;
		}
		while(i >= 0);
		System.out.println("##########");
		
		char[] arr2 = {'C','a','t'};
		for (int j = 0;j<arr.length;j++) {
			System.out.print(arr2[j]);
		}
		System.out.println("\n##########");
		for (char j : arr2) {
			System.out.print(j);
		}
		
		System.out.println("\n##########");
		ArrayList<Character> arr3 = new ArrayList<Character>();
		arr3.add('C');
		arr3.add('a');
		arr3.add('t');
		for(char character : arr3) {
			System.out.print(character + "\t");
		}
	}

}
