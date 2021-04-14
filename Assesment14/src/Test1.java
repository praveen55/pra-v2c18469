import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate d1 = LocalDate.now();
		System.out.println("CURRENT DATE : "+d1);
		LocalDate d2 = LocalDate.of(1999 ,05,22 );
		System.out.println(d2);
		LocalDate d3 = LocalDate.parse("2020-12-10",DateTimeFormatter.ISO_DATE);
		System.out.println(d3);

	}

}
