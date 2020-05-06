package app;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {
	@Test
	void testNextDate1() {
		String day   = "01";
		String month = "01";
		String year  = "2018";

		LocalDate expected = LocalDate.parse("2018-01-02");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String actual = NextDayCalculator.nextDate(day, month, year);

		String strDate1 = expected.format(formatter);
		assertEquals(strDate1, actual);
	}

	@Test
	void testNextDate2() {
		String day   = "31";
		String month = "01";
		String year  = "2018";

		LocalDate expected = LocalDate.parse("2018-02-01");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String actual = NextDayCalculator.nextDate(day, month, year);

		String strDate1 = expected.format(formatter);
		assertEquals(strDate1, actual);
	}

	@Test
	void testNextDate3() {
		String day   = "30";
		String month = "04";
		String year  = "2018";

		LocalDate expected = LocalDate.parse("2018-05-01");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String actual = NextDayCalculator.nextDate(day, month, year);

		String strDate1 = expected.format(formatter);
		assertEquals(strDate1, actual);
	}

	@Test
	void testNextDate4() {
		String day   = "28";
		String month = "02";
		String year  = "2018";

		LocalDate expected = LocalDate.parse("2018-03-01");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String actual = NextDayCalculator.nextDate(day, month, year);

		String strDate1 = expected.format(formatter);
		assertEquals(strDate1, actual);
	}

	@Test
	void testNextDate5() {
		String day   = "29";
		String month = "02";
		String year  = "2020";

		LocalDate expected = LocalDate.parse("2020-03-01");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String actual = NextDayCalculator.nextDate(day, month, year);

		String strDate1 = expected.format(formatter);
		assertEquals(strDate1, actual);
	}

	@Test
	void testNextDate6() {
		String day   = "31";
		String month = "12";
		String year  = "2018";

		LocalDate expected = LocalDate.parse("2019-01-01");

		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		String actual = NextDayCalculator.nextDate(day, month, year);

		String strDate1 = expected.format(formatter);
		assertEquals(strDate1, actual);
	}
}
