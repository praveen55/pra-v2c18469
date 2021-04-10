import java.util.function.Supplier;

public class Supplierid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Supplier<Integer> ID1 = () ->{
			Integer id =1;
			for(int i=0; i<5;i++) {
				id=id +(int) (Math.random()*1000);
			}
			return id;
		};
		System.out.println("ID NUMBER 1 :"+ID1.get());
		System.out.println("ID NUMBER 2 :"+ID1.get());
		System.out.println("ID NUMBER 3 :"+ID1.get());
		System.out.println("ID NUMBER 4 :"+ID1.get());
		System.out.println("ID NUMBER 5 :"+ID1.get());
		System.out.println("ID NUMBER 6 :"+ID1.get());
	}

}
