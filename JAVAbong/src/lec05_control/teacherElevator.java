package lec05_control;

import java.util.Scanner;
import java.util.regex.Pattern;

public class teacherElevator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int elevatorA = 10;
		int elevatorB = 4;
		// 움직인 엘리베이터가 A면 1, B면 2
		final int ACTIVE_ELEVATOR_A = 1;
		final int ACTIVE_ELEVATOR_B = 2;
		
		int activeElevator = 0;
		while (true) {

			System.out.println("============== 희영빌딩 엘리베이터 ==============");
			System.out.println("승강기A의 현재 위치: " + elevatorA + "층");
			System.out.println("승강기B의 현재 위치: " + elevatorB + "층");
			System.out.println("몇층에 계시나요? [종료하시려면 q 또는 exit 입력]: ");
			String inputText = sc.nextLine();

			if (inputText.toLowerCase().equals("q") || inputText.toLowerCase().equals("exit")) {
				System.out.println("프로그램을 종료하겠습니다.");
				break;	 // 리턴함수가 있으면 else 안 쓰고 if 또 써도된다. 정규표현식 regex , 코드찾기 (ctrl + h) 핵꿀팁
			}
			// regex 정규표현식
			String regex = "^[a-z]+$";		// 문자열의 시작(^)과 끝($) 사이에 숫자가 1개 이상
			boolean isNum = Pattern.matches(regex, inputText);	// inputText 가 숫자이면 true
			if(!isNum) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
			}
			// 사용자가 입력한 층수를 int로 변환
			int custFloor = Integer.parseInt(inputText);
			System.out.println(custFloor + "층에서 엘리베이터를 호출합니다");
			// 사용자의 위치와 각 엘리베이터 층수차이 계산
			int diffFloorA = (custFloor > elevatorA) ? (custFloor - elevatorA) : (elevatorA - custFloor);
			int diffFloorB = Math.abs(custFloor - elevatorB);
			//위치 차이에 따른 엘리베이터 이동
			if(diffFloorA > diffFloorB) {
				System.out.println("승강기 B가" + custFloor + "층으로 이동하였습니다");
				elevatorB = custFloor;
				activeElevator = ACTIVE_ELEVATOR_B;
			}else if(diffFloorA < diffFloorB){
				System.out.println("승강기 A가" + custFloor + "층으로 이동하였습니다");
				elevatorA = custFloor;
				activeElevator = ACTIVE_ELEVATOR_A;
			}else {
				if(diffFloorA > diffFloorB) {
					System.out.println("승강기 A가" + custFloor + "층으로 이동하였습니다");
					elevatorA = custFloor;
					activeElevator = ACTIVE_ELEVATOR_A;
				}else {
					System.out.println("승강기 B가" + custFloor + "층으로 이동하였습니다");
					elevatorB = custFloor;
					activeElevator = ACTIVE_ELEVATOR_B;
				}
			} while(true) {
			System.out.print("어느 층으로 이동하시겠음? : ");
			inputText = sc.nextLine();
			isNum = Pattern.matches(regex, inputText);	// inputText 가 숫자이면 true
			if(!isNum) {
				System.out.println("잘못 입력하셨습니다.");
				continue;
				
			}
		
			int goToFloor = Integer.parseInt(inputText);
			if(activeElevator == ACTIVE_ELEVATOR_A) {
				System.out.println("승강기 A가" + goToFloor + "층으로 이동하였습니다");
				elevatorA = goToFloor;
			}else if(activeElevator == ACTIVE_ELEVATOR_B) {
				System.out.println("승강기 B가" + goToFloor + "층으로 이동하였습니다");
				elevatorB = goToFloor;
			}
			break;
		}
	}
}
}
