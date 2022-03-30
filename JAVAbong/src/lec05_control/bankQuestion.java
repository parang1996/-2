package lec05_control;

import java.util.Scanner;

public class bankQuestion {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int cash = 0;
		while (true) {
			System.out.println("-------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-------------------------------");
			System.out.print("선택 > ");
			int select = sc.nextInt();
			if (select == 1) {
				System.out.print("예금액 >");
				int plus = sc.nextInt();
				cash += plus;
			} else if (select == 2) {
				System.out.print("출금액 >");
				int minus = sc.nextInt();
				cash -= minus;
			} else if (select == 3) {
				System.out.println("잔고 > " + cash);
			} else if (select == 4) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		sc.close();
	}
}
