package lec03_system_inout;

import java.util.Scanner;

public class SystemMain {

	public static void main(String[] args) {
		
		// 콘솔에 텍스트 출력하기
		
		System.out.println("줄바꿈");
		System.out.print("줄 안바꿈");
		System.out.printf("포맷");
		
		// 제어문자
		// 문자열 내에 역슬래시 \ 이용하여 특정기능 사용
		
		// \t 탭
		
		System.out.println("*\t*\t*");
		System.out.println("**\t**\t**");
		System.out.println("***\t*\t***");
		
		// \n 줄바꿈
		
		System.out.println("줄바꿈\n");
		
		// \(기능을 가지는 문자)
		
		System.out.println("제어문자를 사용하려면 \\를 써야합니다.");
		System.out.println("소크라테스가 말하길.. \"너 자신을 알라\"");
		
		// 특수문자
		
		System.out.println("☆");
		
		// printf 는 포맷 문자열과 함께 사용
		// %d - 정수
		
		System.out.printf("%d명이 수업을 듣고 있습니다.\n", 21);
		System.out.printf("%d명이 수업을 %d시간째 듣고 있습니다.\n", 21, 100);
		System.out.printf("%d명이 수업을 %d시간째 %s 듣고 있습니다.\n", 21, 100, "열심히");
		
		System.out.printf("%02d장_표준입출력\n", 3);
		System.out.printf("%02d장_표준입출력\n", 31);
		System.out.printf("%03d장_표준입출력\n", 3);
		
		System.out.printf("%.03f\n", 3.14);
		System.out.printf("%.04f\n", 3.14);
		
		System.out.printf("%.1f\n", 3.14);   // 반올림해서 소수 첫 번째 자리까지 표현
		
		// 표준 입력
		
		System.out.println("이름을 입력해주세요: ");
		Scanner a = new Scanner(System.in);
		String inputText = a.nextLine();
		
		System.err.println(inputText + "님 환영합니다.");
	}

}
