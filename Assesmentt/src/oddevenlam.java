package lamexp;

import java.util.Arrays;
import java.util.List;

public class oddevenlam {

	public static void main(String[] args) {
		System.out.println("EVEN NUMBERS");
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		numbers.stream().filter(n -> n%2 == 0).forEach(System.out::println);
		
		System.out.println("ODD NUMBERS");
		List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		numbers1.stream().filter(n -> n%2 != 0).forEach(System.out::println);
	}
}