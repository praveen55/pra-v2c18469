package lamexp;

import java.util.function.Function;

public class Lamdaexp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Function <Integer,Integer> f= i -> i/i;
		System.out.println(f.apply(2));
		}
	}
