package classwork;


public class CalendarDate {
	String date;
	public void currentDate() {
		date = "January 1";
		
	}
	public void date(month, day) {
		if (month < 1 || month > 12) {
			throw new IllegalArgumentException("Month not valid");
		}
		else if ( day < 1 || day > 31) {
			throw new IllegalArgumentException("The day is not valid");
		}
		
	}
	public int compareTo ( CalendarDate  date ) {
		if (CalendarDate == date) {
			return 0;
		}
		else if (CalendarDate < date) {
			return -1;
		}
		else if (CalendarDate > date) {
			return 1;
		}
	}
	

}