package awesomeSauce;

public class PrimitiveTypes {
	public static void main(String[] args) {
		byte b = 127;
		System.out.println(++b); // -128
		System.out.println("###########");
		short c = 32767;
		System.out.println(++c); // -32768
		System.out.println("###########");
		int i = 2147483647;
		System.out.println(++i); // -2147483648
		System.out.println("###########");
		long l = 9_223_372_036_854_775_807L;
		System.out.println(++l); // -9223372036854775808
		System.out.println("###########");
		float f = 147.5268F;
		System.out.println(f); // 147.5268
		System.out.println("###########");
		double d = 48752222.000014552;
		System.out.println(d); // 4.875222200001455E7
		System.out.println("###########");
		boolean tr = true;
		boolean fs = false;
		System.out.println(tr + " & " + fs); // true & false
		System.out.println("###########");
		char ch = '@';
		System.out.println(ch); // @
		int a = ch;
		System.out.println(a); // 64
		System.out.println(Character.getNumericValue(ch)); // -1
		System.out.println(Character.getNumericValue('7')); // 7
		ch = 64;
		System.out.println(ch); // @
		ch+=1;
		System.out.println(ch); // A
		ch+=32;
		System.out.println(ch); // a
	}

}
