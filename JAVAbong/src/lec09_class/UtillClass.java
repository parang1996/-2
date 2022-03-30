package lec09_class;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

/**
 * 유용한 함수들을 제공하는 클래스
 * @author pc21
 *
 */

public class UtillClass {
	
	public 	static String owner = "만든이: 김범석";
	/**
	 * 입력한 소수를 소수 n번째로 리턴해주는 함수
	 * @param douNum 반올림 하고 싶은 실수
	 * @param n 자릿수
	 * @return
	 */
	public static double round(double douNum, int n) {
		// 소수 두번째 자리에서 반올림해서
		// 소수 첫번째 자리를 만들고 싶다. (n = 1)
		// 3.141592 에서 10을 곱한 뒤, Math.round를 적용하고
		// 다시 10으로 나누면 됨
		
		// 소수 세번째 자리에서 반올림해서
		// 소수 두번째 자리를 만들고 싶다. (n = 2)
		// 3.141592 에서 100을 곱한 뒤, Math.round를 적용하고
		// 다시 100으로 나누면 됨
		
		// douNum = 3.141592, n = 2를 넣었다면
		int one = 1;
		for(int i = 0; i < n; i++) {
			one *= 10;
		}
		// mul = 314.1592
		double mul = douNum * one;
		// longNum = 314
		long longNum = Math.round(mul);
		// douVal = 3.14
		double douVal = (double)longNum / one;
		
		return douVal;
	}
	/**
	 * 연봉 액수(int, 단위 : 만)가 들어오면 이쁜
	 * 문자열로 바꿔서 리턴해주는 함수
	 * @param salary
	 * @return
	 */
	public static String formatSalary(int salary) {
		if(salary < 10000) { // 연봉 1억미만
			String str = salary + "";
			return str.substring(0,1) + "," + str.substring(1) + "만원";
		}else {
			int ouk = salary/10000;
			int remain = salary%10000;
			if(remain < 1000) {
				return ouk + "억" + remain + "만원";
			}
			String temp = remain + "";
			return ouk + "억" + temp.substring(0,1) + "," + temp.substring(1) + "만원";
		}
	}
	
	/**
	 * 50% 확률로 true/false를 리턴해주는 함수
	 */
	public static boolean banban() {	// static - 여기 utilClass 를 객체로 만들지 않아도 메소드 사용가능
		// randInt 0 또는 1이 나옴
		int randInt = (int)(Math.random() * 2);
		
//		if(randInt == 0) {
//			return true;
//		}
		return(randInt == 1);
	}
	
	/**
	 * 유니크한 아이디 만들어주는 메소드
	 * @return
	 */
	public static String makeUniqueId() {
		Date date = new Date();
		SimpleDateFormat strDate = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		String StrDate = strDate.format(date);
		
		Random rand = new Random();
		for(int i=0; i < 6; i++) {
			StrDate += Integer.toString(rand.nextInt(10));			
		}
		return StrDate;
	}
}

