package lamexp;

import java.util.function.BiFunction;

interface addable1{
		public static String add12(String a, String b) {
		return a+b;
		}
}
		
public class example1{
			public static void main(String[] args) {
				// TODO Auto-generated method stub
				System.out.println("String to String");
				BiFunction<String,String,String > add123 = addable1 :: add12;
				String z = add123.apply("Praveen","Kumar");
				System.out.println(z);
			}
}
