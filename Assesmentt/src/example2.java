package lamexp;

import java.util.function.BiFunction;

interface addable2{
		public static int add123(int a, float b) {
		return (int) (a+b);
		}
}
public class example2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Integer to Float Bifunction");
			BiFunction<Integer,Float,Integer > add1234 = addable2 :: add123;
			float y = add1234.apply(12,21f);
			System.out.println(y);
	}
}
