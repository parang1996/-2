package lec05_control;

import java.util.Scanner;

public class LoopFinalTesT {

	public static void main(String[] args) {
		// 복습시간
		// 팩토리얼
		// 수학기호로 4! = 4 * 3 * 2 * 1

		// for문을 이용해서 10i 의 값을 출력해주세요
		// 15i

		/*
		 * int int1 = 1; for(int i=10; i > 0; i--) { int1 *= i; }
		 * System.out.println("10! = " + int1);
		 * 
		 * long int2 =1; for(int i=15; i > 0; i--) { int2 *= i; }
		 * System.out.println("15! = " + int2);
		 * 
		 * System.out.println("\n========== 룰렛 이벤트 ===========\n");
		 * 
		 * // 룰렛을 아주 힘차게 돌렸더니 // 5834도가 돌아갔대요 // 한바퀴는 360도에요 // 그렇다면 룰렛이 멈추고난 각도에 따른 경품이
		 * 뭔지 출력, 몇바퀴 돌았는지 출력 // 0도 <= 60 도 : 사탕 // 60 <= 120 도 : 초콜릿 // 120 <= 180 도 :
		 * 쿠키 // 180 <= 240 도 : 콜라 // 240 <= 300 도 : 아이스크림 // 300 <= 360(0) 도 : 커피
		 * 
		 * int circle = 5834/360; int giftNum = 5834%360;
		 * 
		 * if(0 < giftNum && giftNum <= 60) { System.out.println("경품 : 사탕 "); } else if
		 * (61 <= giftNum && giftNum <= 120) { System.out.println("경품 : 초콜릿"); } else if
		 * (121 <= giftNum && giftNum <= 180) { System.out.println("경품 : 쿠키"); } else if
		 * (181 <= giftNum && giftNum <= 240) { System.out.println("경품 : 콜라"); } else if
		 * (241 <= giftNum && giftNum <= 300) { System.out.println("경품 : 아이스크림"); } else
		 * if (301 <= giftNum && giftNum <= 360 ) { System.out.println("경품 : 커"); }
		 * System.out.println(circle + "바퀴");
		 * 
		 * System.out.println("\n========== 로꾸꺼 ===========\n");
		 * 
		 * // 사용자가 입력한 문자열의 순서를 뒤집어서 출력
		 * 
		 * Scanner aa = new Scanner(System.in); System.out.print("거꾸로 뒤집을 문자열 : ");
		 * String reverse = aa.nextLine(); String reverse2 = "";
		 * 
		 * for(int i=reverse.length(); i > 0; i--) { reverse2 += reverse.substring(i-1,
		 * i); // 45 34 23 12 01 } System.out.print(reverse2);
		 * 
		 * aa.close(); // for(int i=reverse.length()-1; i >= 0; i--) { //
		 * System.out.print(reverse.charAt(i)); // }
		 * 
		 * System.out.println("\n========== 로꾸꺼 ===========\n");
		 */
		// 2월 달력을 출력해봅시다
		// 화요일 1일 스타트
		// startDay 는 요일을 기준으로 일요일은 0, 월요일은 1, 화 2, 수 3, 목 4, 금 5, 토 6

		int startDay = 2;
		int lastDay = 28;
		int currentDay = 1;
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i < 42; i++) {
			if (i >= startDay) {
				System.out.print(currentDay + "\t");
				currentDay++;
				if (currentDay > lastDay) {
					break;
				}
			} else {
				System.out.print("\t");
			}
			if (i % 7 == 6) {
				System.out.println();
			}
		}
		System.out.println("\n========== 6월 달력 ===========\n");
		startDay = 3;
		lastDay = 30;
		currentDay = 1;
		for (int i = 0; i < 42; i++) {
			if (i >= startDay) {
				if(currentDay < 10) {
					System.out.print(" ");
				}
				System.out.print(currentDay + "\t");
				currentDay++;
				if (currentDay > lastDay) {
					break;
				}
			} else {
				System.out.print("\t");
			}
			if (i % 7 == 6) {
				System.out.println();
			}
		}

	}
}
