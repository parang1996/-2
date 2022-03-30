package lec05_control;

import java.util.Scanner;

public class Elevator {

	public static void main(String[] args) {

		// 클래스 이름 수정 필요함

		Scanner ac = new Scanner(System.in);

		int eleA = 10;

		int eleB = 4;

		String eleAA = "A";

		String eleBB = "B";

		while (true) {

			System.out.println("============== 희영빌딩 엘리베이터 ==============");
			System.out.println("승강기A의 현재 위치: " + eleA + "층");
			System.out.println("승강기B의 현재 위치: " + eleB + "층");
			System.out.println("몇층에 계시나요? [종료하시려면 q 또는 exit 입력]: ");
			String floor = ac.nextLine();

			if (floor.toLowerCase().equals("q") || floor.toLowerCase().equals("exit")) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;	 // 리턴함수가 있으면 else 안 쓰고 if 또 써도된다. 정규표현식 regex (ctrl + h) 핵꿀팁
			} else {
				try {
					if (Math.abs(eleA - Integer.parseInt(floor)) < Math.abs(eleB - Integer.parseInt(floor))) {
						System.out.println(floor + "층에서 엘리베이터를 호출합니다");
						System.out.println("승강기 " + eleAA + "가 " + floor + "층으로 이동하였습니다.");
						eleA = Integer.parseInt(floor);
					} else if (Math.abs(eleA - Integer.parseInt(floor)) > Math.abs(eleB - Integer.parseInt(floor))) {
						System.out.println(floor + "층에서 엘리베이터를 호출합니다");
						System.out.println("승강기 " + eleBB + "가 " + floor + "층으로 이동하였습니다.");
						eleB = Integer.parseInt(floor);
					} else if (Math.abs(eleA - Integer.parseInt(floor)) == Math.abs(eleB - Integer.parseInt(floor))) {
						if (eleA > eleB) {
							System.out.println(floor + "층에서 엘리베이터를 호출합니다");
							System.out.println("승강기 " + eleAA + "가 " + floor + "층으로 이동하였습니다.");
							eleA = Integer.parseInt(floor);
						} else {
							System.out.println(floor + "층에서 엘리베이터를 호출합니다");
							System.out.println("승강기 " + eleBB + "가 " + floor + "층으로 이동하였습니다.");
							eleB = Integer.parseInt(floor);
						}
					}
				} catch (NumberFormatException nfe) {
					System.out.println("잘못 입력하셨습니다.");
				}
			}
			System.out.println();
		}
	}
}
