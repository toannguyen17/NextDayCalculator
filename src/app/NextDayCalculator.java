package app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class NextDayCalculator {
	public static String nextDate(String day, String month, String year){
		LocalDate ld = LocalDate.parse(year+"-"+month+"-"+day);
		ld = ld.plusDays(1);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return ld.format(formatter);
	}
}
