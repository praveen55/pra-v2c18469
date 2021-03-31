package javacollectios;

public class booleanstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Boolean a1 = false;
		Boolean a2 = true;
		String aa1 = "hello";
		
		String b1 = Boolean.toString(a2);
		String b2 = Boolean.toString(a1);
		
		String bb1 = String.valueOf(a2);
		String bb2 = String.valueOf(a1);
		
		Boolean m = Boolean.valueOf(aa1);
		
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(bb1);
		System.out.println(bb2);
		System.out.println(m);
		
		
		

	}

}
