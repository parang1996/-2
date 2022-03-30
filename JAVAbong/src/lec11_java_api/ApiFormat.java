package lec11_java_api;

import java.text.DecimalFormat;
import java.text.MessageFormat;

public class ApiFormat {

	public static void main(String[] args) {
		// 숫자형식 DecimalFormat
		
		// 자리수에 맞춰 숫자 앞에 0 붙이기
		// 1이면 001, 11이면 011, 132 - 132 형태
		DecimalFormat deciFormat = new DecimalFormat("000");
		String strNum = deciFormat.format(1);
		System.out.println(strNum);
		System.out.println(deciFormat.format(11));
		
		System.out.println("\n===================================\n");
		
		// 자리수에 맞춰서 소수 뒤에 0 붙이기
		// 0.1 이면 0.100 0.11이면 0.110 0.132 - 0.132
		deciFormat = new DecimalFormat("#.000");
		System.out.println(deciFormat.format(9.1));
		System.out.println(deciFormat.format(0.11));
		System.out.println(deciFormat.format(0.132));
	
		System.out.println("\n===================================\n");
		
		// 소수 넷째 자리에서 반올림
		// 3.141592 -> 3.142 
		deciFormat = new DecimalFormat("#.###");
		System.out.println(deciFormat.format(3.141592));
		
		// 정수 문자열을 정수로 바꾸기 Integer.parseInt();
		// 실수 문자열을 실수로 바꾸기 Double.parseDouble();
		double duobVal = Double.parseDouble("3.1415");
		System.out.println(duobVal);
		
		System.out.println("\n===================================\n");
		
		// 천 단위마다 , 붙이기
		deciFormat = new DecimalFormat("#,###");
		System.out.println(deciFormat.format(1234321414));
		
		// 문자 형식 MessageFormat
		String formatStr = "ID: {0}\n이름: {1}\n연락처: {2}";
		String result = MessageFormat.format(formatStr, "aaa", "에이에이", "1234");
		System.out.println(result);
		
		// 두 번째 방식
		formatStr = "ID: {0}\n이름: {1}\n연락처: {2}";
		Object[] arguments = {"asd", "김김김", "1234"};
		result = MessageFormat.format(formatStr, arguments);
		System.out.println(result);
		}
	}

