package lec11_java_api;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.TimeZone;

import lec09_class.UtillClass;

public class ApiQuestion {
	public static void main(String[] args) throws ParseException {
		// 다양한 날짜 포맷 적용
		// 시계방에 놀러갔더니 다양한 디지털 시계들이 있어요
		// 1. 2022/03/17 14:17:20
		// 2. 2022-03-17 오후 02:17:20
		// 3. 2022.03.17 PM 02:17:20
		// 4. 목 오후 02:17:20
		// 5. 목요일 14:17:20
		// 6. Thu PM 02:17:20
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		String today = sdf.format(date);
		System.out.println("1. " + today);
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		today = sdf1.format(date);
		System.out.println("2. " + today);
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy.MM.dd a hh:mm:ss", Locale.US);
		today = sdf2.format(date);
		System.out.println("3. " + today);
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("E a hh:mm:ss");
		today = sdf3.format(date);
		System.out.println("4. " + today);
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("EE HH:mm:ss");
		today = sdf4.format(date);
		System.out.println("5. " + today);
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("EE a hh:mm:ss", Locale.US);
		today = sdf5.format(date);
		System.out.println("6. " + today);
		
		TimeZone time;
		time = TimeZone.getTimeZone("America/Los_Angeles");
		sdf.setTimeZone(time);
		System.out.format("%s%n%s%n%n", time.getDisplayName(), sdf.format(date));
		
		// 디데이계산기
		// 파라미터로 날짜를 입력받으면 (String, yyyy.MM.dd 포맷)
		// 오늘 날짜와 해당 날짜의 차이를 비교하여 차이 리턴
		
		// 2022.04.01 개원기념일 몇일 남았는지
		// 2022.02.14 몇일 지났는지
		diff1("2022.04.01");
		diff1("2022.02.14");
		
		// 달력을 만들어주는 클래스를 만들어 주세요.
		ApiCalendar apiCal = new ApiCalendar(2021,2);
		apiCal.drawCal();
		
		System.out.println("\n=====================\n");
		
		// 유니크 ID 생성
		// Guest19238129041290312809312 님 환영
		// 6자리의 랜덤 숫자를 이용해서 만든다?
		
		// yyyyMMddHHmmssSSS + 랜덤수
		
		System.out.println("Guest" + UtillClass.makeUniqueId() + "님 환영합니다");
		
	}
	
	public static void diff1(String date2) throws ParseException {
		Calendar today = Calendar.getInstance();
		today.setTime(new Date());
		Date date = new SimpleDateFormat("yyyy.MM.dd").parse(date2);
		Calendar cmpDate = Calendar.getInstance();
		cmpDate.setTime(date);
		long diffSec = (today.getTimeInMillis() - cmpDate.getTimeInMillis()) / 1000;
		long diffDays = diffSec / (24*60*60);
		
		if(diffDays < 0) {
			System.out.println(diffDays + "일 남았습니다.");
		}else if(diffDays > 0){
			System.out.println(diffDays + "일 지났습니다.");
		}
	}
	
	static long calDday(String dday) throws ParseException {
		// 오늘 날짜 구하기
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd");
		Date today = new Date();				// 2022.03.17 16:33:41
		// 시간을 00:00:00 만들어 주어야 날짜(일) 계산용이
		String strToday = sdf.format(today);
		// strToday = 2022.03.17 문자열
		Date sdfToday = sdf.parse(strToday);
		// sdfToday = 2022.03.17 00:00:00 세팅된 Date 객체
		Date inputDay = sdf.parse(dday);
		long diffMillSec = inputDay.getTime() - sdfToday.getTime();
		long diffDay = diffMillSec / (1000 * 60 * 60 * 365);
		
		return diffDay;
	}
}
