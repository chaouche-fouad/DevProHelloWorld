package awesomeSauce;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraysAndArrayLists {
	public static void main(String[] args) {
		
		// Arrays 
		char arr[] = new char[3];
		arr[0] ='C';
		arr[1] ='a';
		arr[2] ='t';
		System.out.print(arr[0]);
		System.out.print(arr[1]);
		System.out.println(arr[2]);	
		
		int[] arrInts = {1,2,3,4,5};
		System.out.println(Arrays.toString(arrInts)); // [1, 2, 3, 4, 5]
		
		char [][] arrChars = {{'C','a','t'},{'D','o','g'}}; // [1, 2, 3, 4, 5]
		System.out.println(Arrays.toString(arrChars)); 
		// [[C@79fc0f2f, [C@50040f0c]
		System.out.println(Arrays.toString(arrChars[0])); // [C, a, t]
		System.out.println(Arrays.toString(arrChars[1])); // [D, o, g]
		System.out.print(arrChars[0][0]);
		System.out.print(arrChars[0][1]);
		System.out.println(arrChars[0][2]);
		System.out.print(arrChars[1][0]);
		System.out.print(arrChars[1][1]);
		System.out.println(arrChars[1][2]);
		System.out.println("##############");
		
		// ArrayList : (is Class)
		
		ArrayList<Integer> arrList = new ArrayList<>();
		arrList.add(1);
		arrList.add(2);
		arrList.add(3);
		
		System.out.println(arrList.toString()); // [1, 2, 3]
		arrList.add(0,0);
		System.out.println(arrList); // [0, 1, 2, 3]
		arrList.add(3,0);
		System.out.println(arrList); // [0, 1, 2, 0, 3]
		
		System.out.println(arrList.get(4)); // 3
		
		ArrayList<Integer> newArrList = arrList;
		arrList.remove(4);
		System.out.println(arrList.toString()); // [0, 1, 2, 0]
		System.out.println(newArrList.toString()); // [0, 1, 2, 0]
		System.out.println("##############");
		
		// List : is (Interface)
		
		List<Integer> arrList2 = new ArrayList<>();
		arrList2.add(1);
		arrList2.add(2);
		arrList2.add(3);
		System.out.println(arrList2.toString()); // [1, 2, 3]
		arrList2.add(0,0);
		System.out.println(arrList2); // [0, 1, 2, 3]
		arrList2.add(3,0);
		System.out.println(arrList2); // [0, 1, 2, 0, 3]
		System.out.println(arrList2.get(4)); // 3
		
	}

}
