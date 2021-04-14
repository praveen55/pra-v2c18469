import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate dt = LocalDate.parse("1998-05-22", DateTimeFormatter.ISO_DATE);
		System.out.println(dt);
		LocalDateTime dt1 = LocalDateTime.of(1998, 04, 11, 8, 22);
		System.out.println(dt1);
		System.out.println(dt1.format(DateTimeFormatter.ISO_DATE_TIME));
		System.out.println("Adding Days..."+dt1.plusDays(5));
		System.out.println("Adding Months...: "+dt1.plusMonths(10));
		System.out.println("Adding Years..."+dt1.plusYears(20));

	}

}
