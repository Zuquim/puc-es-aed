import static org.junit.Assert.*;
import org.junit.Test;

public class DateTest {

	@Test
	public void testTodayDate() {
		Date expected = new Date(2017, 9, 4);
		Date actual = new Date();
		assertEquals(expected.getYear(), actual.getYear());
		assertEquals(expected.getMonth(), actual.getMonth());
		assertEquals(expected.getDay(), actual.getDay());
	}

	@Test
	public void testIsLeapYear() {
		boolean expected;
		boolean actual;
		Date date = new Date();
		for(int i = 1600; i < 2404; i++) {
			actual = date.isLeapYear(i);
			if((i % 400 == 0) || ((i % 4 == 0) && (i % 100 != 0)))
				expected = true;
			else
				expected = false;
			assertEquals(expected, actual);
		}
	}

	@Test
	public void testDaysInMonth() {
		int expected;
		int actual;
		Date date = new Date();
		for(int i = 0; i <= 13; i++) {
			actual = date.daysInMonth(i);
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 ||
					i == 12)
				expected = 31;
			else if (i == 4 || i == 6 || i == 9 || i == 11)
				expected = 30;
			else if (i != 2)
				expected = 0;
			else if (date.isLeapYear(date.getYear()))
				expected = 29;
			else {
				expected = 28;
				i = 0;
				date = new Date(2000, 2, 1);
			}
			assertEquals(expected, actual);
		}
	}
	
	@Test
	public void testDayOfWeek() {
		String expected;
		String actual;
		for(int i = 10; i <= 17; i++) {
			Date date = new Date(2017, 9, i);
			actual = date.dayOfWeek();
			if(date.getDay() == 10)
				expected = "SUNDAY";
			else if(date.getDay() == 11)
				expected = "MONDAY";
			else if(date.getDay() == 12)
				expected = "TUESDAY";
			else if(date.getDay() == 13)
				expected = "WEDNESDAY";
			else if(date.getDay() == 14)
				expected = "THURSDAY";
			else if(date.getDay() == 15)
				expected = "FRIDAY";
			else if(date.getDay() == 16)
				expected = "SATURDAY";
			else
				expected = null;
//			assertEquals(expected, actual);
			System.out.println("\nExpected: " + expected + "\nActual: " + actual);
		}
	}
	
	@Test
	public void testWriteOut() {
		Date date = new Date(2017, 1, 1);
		System.out.println("Testing writeOut method {");
		while(date.getYear() < 2018) {
			date.addDays(1);
			String write = date.writeOut();
			System.out.println(write);
		}
		System.out.println(" }\n");
	}
	
	@Test
	public void testAddDays() {
		Date date = new Date(2017, 11, 28);
		System.out.println("Testing addDays method {");
		while(date.getYear() < 2018) {
			date.addDays(1);
			System.out.println(date.getDay() + "/" + date.getMonth() + "/" +
					date.getYear());
		}
		System.out.println(" }\n");
	}

}
