package lamexp;

import java.util.function.BiFunction;

interface addable{
		public static float add(float a, float b) {
		return a+b;
		}
}
public class example {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("Float to Float Bifunction");
			BiFunction<Float, Float,Float > add1 = addable :: add;
			float n = add1.apply(100f,500f);
			System.out.println(n);
	}
}
