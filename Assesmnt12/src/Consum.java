import java.util.function.Consumer;

public class Consum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Consumer<String> obj1 =(b) -> System.out.println(b);
		obj1.accept("Praveenkumar");
		Consumer<Integer> obj =(a) -> System.out.println(a);
		obj.accept(6);
	}
}
