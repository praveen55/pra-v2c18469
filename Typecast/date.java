import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class date {

		public static void main(String[] args) {
			
			LocalDateTime p =LocalDateTime.now();
			System.out.println("Current Date and Time :"+p);
			
			String date = "04:10:05 11/12/1998";
			Date s = null;
			
			try {
				s= new SimpleDateFormat("hh:mm:ss dd/MM/yyyy").parse(date);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(s);
		}
}