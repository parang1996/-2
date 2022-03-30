//package lec05_control;
//
//import java.util.Scanner;
//
//public class AA {
//
//	public static void main(String[] args) {
////		boolean isRunning = true;
////		Scanner sc = new Scanner(System.in);
//		
//		/*while(isRunning) {
//			System.out.print("콘솔에 출력할 내용 입력[종류 q 또는 Q]: ");
//			String inputText = sc.nextLine();
//			if(inputText.equals("q") || inputText.equals("Q")) {
//				System.out.println("프로그램이 종료되었습니다.");
//				isRunning = false;
//			} else {
//				System.out.println("inputText");
//			}
//		}
//		*/
//		// level2
//		
//		
//		
//		// do-while문
//		
//	//	System.out.println("\n===================\n");
//		
//		//이중(다중) while문
//		//구구단
////		int intVal = 2;
////		while(intVal <= 9) {
////			int rightVal = 2;
////			while(rightVal <=9) {
////				System.out.println(intVal + "X" + rightVal + " = " + (intVal*rightVal));
////				rightVal++;
////			} System.out.println();
////			intVal++;
////		}
//		
//		// 포켓몬스터
////		Scanner scan = new Scanner(System.in);
////		while(true) {
////			System.out.println("야생의 단데기를 만났습니다. 행동을 선택해 주세요" );
////			System.out.println("1. 공격 | 2. 도망 ");
////			System.out.println(">> ");
////			String inputText = scan.nextLine();
////			if(inputText.equals("1")) {
////				while(true) {
////					System.out.println("공격 방법은?");
////					System.out.println("1. 백만볼트 | 2. 전광석화 | 3. 취소");
////					System.out.print(">> ");
////					String attack = scan.nextLine();
////					if(attack.equals("1")) {
////						System.out.println("피카츄 백만볼트으으");
////					} else if(attack.equals("2")) {
////						System.out.println("피카츄 전광석화ㅏㅏㅏㅏㅏ");
////					} else if(attack.equals("3")) {
////						break; // 내부 while문은 더 이상 실행되지 않음
////								// 외부 while문은 계속 실행
////					} else {
////						System.out.println("잘못 입력하셨습니다.");
////					}
////				}
////			}else if(inputText.equals("2")) {
////				System.out.println("단데기를 상대로 도망쳤습니다.");
////				break;
////			} else {
////				System.out.println("잘못 입력하셨습니다.");
////			}
////		}
////		scan.close(); 		// 사용자로부터 값을 입력받는 Scanner 개체를 종료한다.
//		
//		//String inputText = scan.nextLine(); 		
//		// 더 이상 입력받지 못함, 입력 받을 일이 없을 때 close()해줌
//		// 사실 Scanner 는 AutoCloseble 을 구현하고 있기 때문에
//		// 자동으로 close 되고 있지만, 명시적으로 해주면 좋다
//		// Ctrl + 마우스 클릭 -> 해당 변수 선언 위치, 클래스 위치 등등을 찾아갑니다.
//		
//	}
//	
//}
