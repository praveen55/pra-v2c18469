
public class Typecast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Widening Type Casting
		short a = 50;
		int b = a;
		long c = b;
		float d = c;
		double e = d;
		System.out.println(e);
		//Narrowing Type Casting
		double f = 100.55;
		float g = (float) f;
		byte h = (byte) g;
		System.out.println(f);
		System.out.println(h);
		
		String s = "500";
		int i = Integer.parseInt(s);
		System.out.println("INTEGER VALUE");
		System.out.println(i+100);
		
		int x = 100;
		String y = Integer.toString(x);
		System.out.println("String value");
		System.out.println(y+100);
		
		long l = 200;
		String p = String.valueOf(l);
		System.out.println(p);
		
		float q = 852;
		String j = String.valueOf(q);
		System.out.println(j);
		
		String w = "741";
		long n = Long.parseLong(w);
		System.out.println(n);
	}
}
