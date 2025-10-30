package day2;

import java.time.LocalDate;
import java.util.Calendar;

public class DateUtil {

	public static void main(String[] args) {
		
		Calendar calendar = Calendar.getInstance();
		
		System.out.println( calendar.get(calendar.DAY_OF_YEAR));
		
		LocalDate date = LocalDate.now();
		System.out.println(date);
		
		LocalDate birth = LocalDate.of(1989, 03, 28);
		
		System.out.println(birth);

	}

}
