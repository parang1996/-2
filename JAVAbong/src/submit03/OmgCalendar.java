package submit03;

import java.util.Calendar;

public class OmgCalendar {
	 int year;
	 int month;
	 int lastDay;
	 int startDay;
	 
	public OmgCalendar(int year, int month) {
		super();
		
		Calendar cal = Calendar.getInstance();
		cal.set(year, month-1, 1);
		
		this.year = year;
		this.month = month;
		this.lastDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
		this.startDay = cal.get(Calendar.DAY_OF_WEEK);
	}
	
	public void drawWeekDay() {
		System.out.println(year + "년 " + month + "월 달력");
		System.out.println("월\t화\t수\t목\t금");
		
		int currentDay = 1;
		for(int i = 1; i <= 42; i++) {
			if(1 == startDay) {
				currentDay++;	
			}
			if(i >= startDay-1) {
				if(currentDay > lastDay) {
					break;
				}
				System.out.printf("%2d\t", currentDay);
				currentDay++;
				
			}else {
				System.out.print("\t");
			}
			if(i % 5 == 0) {
				currentDay+=2;
				System.out.println();
			}			
		}
	}

	@Override
	public String toString() {
		return "OmgCalendar [year=" + year + ", month=" + month + ", lastDay=" + lastDay + ", startDay=" + startDay
				+ "]";
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

	public int getLastDay() {
		return lastDay;
	}

	public void setLastDay(int lastDay) {
		this.lastDay = lastDay;
	}

	public int getStartDay() {
		return startDay;
	}

	public void setStartDay(int startDay) {
		this.startDay = startDay;
	}
	 
	
	 
}
