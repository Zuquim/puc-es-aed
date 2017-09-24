import java.time.LocalDate;
import java.util.Calendar;

public class Date {

	private int year;
	private int month;
	private int day;

	public Date() { // today
		this.year = LocalDate.now().getYear();
		this.month = LocalDate.now().getMonthValue();
		this.day = LocalDate.now().getDayOfMonth();
	}

	public Date(int year, int month, int day) {
		this.year = year;
        if(month > 0 && month <= 12) {
    		this.month = month;
            if(day > 0 && day <= daysInMonth(month))
            	this.day = day;
            else
                System.out.println("\n\tInvalid day number inserted." +
                        "\n\tIt must be an integer from 1 to " +
                        daysInMonth(month) + "!\n");
        } else
            System.out.println("\n\tInvalid month number inserted." +
                    "\n\tIt must be an integer from 1 to 12!\n");
	}

	public int getYear() {
		return this.year;
	}

	public int getMonth() {
		return this.month;
	}

	public int getDay() {
		return this.day;
	}

	public boolean isLeapYear(int year) {
		if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))
			return true;
		else
			return false;
	}

	public int daysInMonth(int month) {
		int days;
		if (month == 1 || month == 3 || month == 5 || month == 7 ||
				month == 8 || month == 10 || month == 12)
			days = 31;
		else if (month == 4 || month == 6 || month == 9 || month == 11)
			days = 30;
		else if (month != 2)
			days = 0;
		else if (this.isLeapYear(year))
			days = 29;
		else
			days = 28;
		return days;
	}

	public String writeOut() {
		String monthName, ord, written;
		if(this.getMonth() == 1)
			monthName = "January";
		else if(this.getMonth() == 2)
			monthName = "February";
		else if(this.getMonth() == 3)
			monthName = "March";
		else if(this.getMonth() == 4)
			monthName = "April";
		else if(this.getMonth() == 5)
			monthName = "May";
		else if(this.getMonth() == 6)
			monthName = "June";
		else if(this.getMonth() == 7)
			monthName = "July";
		else if(this.getMonth() == 8)
			monthName = "August";
		else if(this.getMonth() == 9)
			monthName = "September";
		else if(this.getMonth() == 10)
			monthName = "October";
		else if(this.getMonth() == 11)
			monthName = "November";
		else if(this.getMonth() == 12)
			monthName = "December";
		else
			monthName = null;
		if(this.getDay() == 1 || this.getDay() == 21 || this.getDay() == 31)
			ord = "st";
		else if(this.getDay() == 2 || this.getDay() == 22)
			ord = "nd";
		else if(this.getDay() == 3 || this.getDay() == 23)
			ord = "rd";
		else
			ord = "th";
		written = monthName + " the " + this.getDay() + ord + " of " + this.getYear();
		return written;
	}
	
	public String dayOfWeek() {
		String dayString;
		Calendar day = Calendar.getInstance();
		day.set(this.year, this.month-1, this.day);
		int today = day.get(Calendar.DAY_OF_WEEK);
//		System.out.println("result: " + today);
//		System.out.println("date: " + this.day + "/" + this.month + "/" + this.year);
		if(today == 1)
			dayString = "SUNDAY";
		else if(today == 2)
			dayString = "MONDAY";
		else if(today == 3)
			dayString = "TUESDAY";
		else if(today == 4)
			dayString = "WEDNESDAY";
		else if(today == 5)
			dayString = "THURSDAY";
		else if(today == 6)
			dayString = "FRIDAY";
		else if(today == 7)
			dayString = "SATURDAY";
		else
			dayString = null;
		return dayString;
	}

	public void nextDay() {
		if(this.day + 1 <= this.daysInMonth(this.month))
			this.day++;
		else if(this.month + 1 <= 12) {
			this.month++;
			this.day = 1;
		} else {
			this.year++;
			this.month = 1;
			this.day = 1;
		}
	}
	
	public void addDays(int days) {
		if(days > 0)
			addDays(days - 1);
		else
			return;
		nextDay();
	}

}
