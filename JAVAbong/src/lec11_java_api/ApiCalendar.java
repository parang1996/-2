package lec11_java_api;

import java.util.Calendar;

public class ApiCalendar {
	
	private int year;
	private int month;
	private int startDay;
	private int lastDay;

	public ApiCalendar(int year, int month) {
		super();
		this.year = year;
		this.month = month;
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		
		this.startDay = cal.get(Calendar.DAY_OF_WEEK);
		this.lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		
	}
	
	public void drawCal() {
		
		System.out.println(year + "년" + month + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		int currentDay = 1;
		
		for(int i = 1; i <= 42; i++) {
			if(i >= startDay) {
				System.out.printf("%2d\t", currentDay);
				currentDay++;
				if(currentDay > lastDay) {
					break;
				}
			}else {
				System.out.print("\t");
			}
			if(i % 7 == 0) {
				System.out.println();
			}
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	@Override
	public String toString() {
		return "ApiCalendar [year=" + year + ", month=" + month + "]";
	}
}
