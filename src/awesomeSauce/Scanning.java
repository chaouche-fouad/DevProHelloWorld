package awesomeSauce;

import java.io.File;
import java.util.Scanner;

public class Scanning {
	;

	public static void main(String[] args) throws Exception{
		double bias;
		boolean decimalAdditinMode = false;
		File config = new File("config.cfg");
		Scanner file = new Scanner(config);
		Scanner sc = new Scanner(System.in);
		
		String line = file.nextLine();
		line = line.replaceAll(" ", "");
		
		if (!line.substring(0, 20).equalsIgnoreCase("decimalAdditionMode=")) {
			file.close();
			throw new Exception("config doesn't match");
		}
		if (line.substring(20).replaceAll(" ", "").equalsIgnoreCase("true")) {
			decimalAdditinMode = true;
		}
		
		file.skip("bias=");
		bias = file.nextDouble();
		
		
		if(!decimalAdditinMode) {
			int a,b;
			a = sc.nextInt();
			b = sc.nextInt();
			System.out.println(a+b+bias);
		}else {
			double a,b;
			a = sc.nextDouble();
			b = sc.nextDouble();
			System.out.println(a+b+bias);
		}
		
		file.close();
		sc.close();
	}

}
