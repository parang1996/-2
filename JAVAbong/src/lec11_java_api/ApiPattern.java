package lec11_java_api;

import java.util.regex.Pattern;

public class ApiPattern {

	public static void main(String[] args) {
		// 정규표현식 (Regular Expression)
		// 특정한 규칙을 가진 문자열의 집합을 표현하기 위해 쓰는 형식
		// 전화번호, 주민번호, 이메일, 등과 같이 정해진 형식에 대해
		// 정규표현식 + Pattern을 이용하여 검증할 수 있다.
		
		// 숫자만 존재하는지 검증
		String regex = "[0-9]*";
		String example = "123";
		boolean result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 숫자 검증 두번째
		regex = "\\d*";
		example = "1236543";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		System.out.println("\n===========================\n");
		
		// 알파벳만 존재하는지 검증
		regex = "[a-zA-Z]*";
		example = "alqwmaDkdSKN a";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 띄어쓰기 포함
		regex = "[a-zA-Z ]*";
		regex = "[a-zA-Z\\s]*";		// 공백을 나타내는 \\s 넣는게 정...석...
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		System.out.println("\n===========================\n");
		
		// 한글 검증
		regex = "[가-힣]*";
		example = "가나다라맘바바바바";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 비밀번호 패턴
		// 영어와 숫자로만 구성
		regex = "[0-9a-zA-Z]*";
		example = "akasdasd123ow123";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 영어와 숫자 특수문자
		regex = "[0-9a-zA-Z!@#$%^&*=+-_()]*";
		example = "nextit123";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 숫자, 영어 소문자, 대문자, 특수문자가 각각 1개이상 
		// 비밀번호 자리가 8~20자리 인지
		regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*\\W).{8,20}$";
		example = "!Anextit123";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 6자리 숫자 비밀번호 중 3자리 이상 반복 금지
		regex = "^.*(\\d)\\1\\1.*$";
		example = "452111";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 이메일형식 확인
		regex = "^[a-zA-Z0-9]+@[a-zA-Z//d]+\\.[a-z]+$";
		example ="aaa@aaa.com";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
		
		// 연락처 형식 확인
		regex = "^[0-9]{2,3}-[0-9]{3,4}-[0-9]{4}$";
		example = "010-1234-1234";
		result = Pattern.matches(regex, example);
		System.out.println(example + ", " + regex + " 결과 = " + result);
	}
}
