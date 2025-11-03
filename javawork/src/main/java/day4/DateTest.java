package day4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;

public class DateTest {
	public static void main(String[] args) {
		LocalDate date = LocalDate.now();

		LocalDate birth = // LocalDate.of(1989, 3, 28);
				LocalDate.parse("1989-03-28");
		Period period = Period.between(birth, date);
		System.out.println("내가 살아온 날은 : " + period.getYears());
		System.out.println(period.getMonths());
		System.out.println(period.getDays());

		// 시간
		LocalTime stime = LocalTime.of(9, 10);
		LocalTime etime = LocalTime.of(16, 30);
		Duration duration = Duration.between(stime, etime);
		System.out.println(duration.toHours());
		System.out.println(duration.toMinutes()%60);
	}
}
