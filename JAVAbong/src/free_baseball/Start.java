package free_baseball;

import java.util.Scanner;

public class Start {
	public static void gameStart() {

		System.out.println("============= 야구 게임 =============");
		System.out.println("상대방의 숫자를 맞추면 이기는 게임입니다.");
		System.out.println("====================================\n");

		Scanner sc = new Scanner(System.in);
		System.out.println("참가자 1 이름을 입력해주세요");
		System.out.print(">>> ");
		BaseballUser user1 = new BaseballUser(sc.nextLine());
		System.out.println("참가자 2 이름을 입력해주세요");
		System.out.print(">>> ");
		BaseballUser user2 = new BaseballUser(sc.nextLine());

		System.out.println("\n" + user1.name + "님과 " + user2.name + "님의 4자리 랜덤숫자를 생성합니다");
		user1.arr = RandomNumber.randomArrayNum();
		user2.arr = RandomNumber.randomArrayNum();
		System.out.println("! GAME START !\n");
		System.out.println(user1.arr + "<< 게임할 땐 코드 없애면 됨");
		System.out.println(user2.arr + "<< 게임할 땐 코드 없애면 됨");

		int tryNum = 0;

		while (true) {
			tryNum++;
			System.out.println(user1.name + "님 " + user2.name + "님의 숫자를 맞혀보세요");
			System.out.print(">>> ");
			int a = sc.nextInt();
			int[] aa = new int[3];
			int strike = 0;
			int ball = 0;
			aa[0] = a / 100;
			aa[1] = (a % 100) / 10;
			aa[2] = a % 10;
			if(a < 100 || a > 999) {
				System.out.println("세 자리 정수를 입력해주세요.\n");
				continue;
			}else if(aa[0] == aa[1] || aa[1] == aa[2] || aa[0] == aa[2]) {
				System.out.println("숫자가 중복되었습니다. 다시 입력해주세요.\n");
				continue;
			}
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (aa[i] == user2.arr.get(j)) {
						if (i == j) {
							strike++;
						} else if (i != j) {
							ball++;
						}
					}
				}
			}
			System.out.println("====== " + strike + "S, " + ball + "B" + " ====== (" + tryNum + "차)\n");
			if (strike == 0 && ball == 0) {
				System.out.println("======= OUT! =======\n");
			}
			if (strike == 3) {
				System.out.println("게임종료 ! " + user1.name + "님의 승리입니다 ^,^");
				break;
			}
			System.out.println(user2.name + "님 " + user1.name + "님의 숫자를 맞혀보세요");
			System.out.print(">>> ");
			a = sc.nextInt();
			aa = new int[3];
			strike = 0;
			ball = 0;
			aa[0] = a / 100;
			aa[1] = (a % 100) / 10;
			aa[2] = a % 10;
			for (int i = 0; i < 3; i++) {
				for (int j = 0; j < 3; j++) {
					if (aa[i] == user1.arr.get(j)) {
						if (i == j) {
							strike++;
						} else if (i != j) {
							ball++;
						}
					}
				}
			}
			System.out.println("====== " + strike + "S, " + ball + "B" + " ====== (" + tryNum + "차)\n");
			if (strike == 0 && ball == 0) {
				System.out.println("======= OUT! =======\n");
			}
			if (strike == 3) {
				System.out.println("게임종료 ! " + user1.name + "님의 승리입니다 ^,^");
				break;
			}
		}
	}
}
