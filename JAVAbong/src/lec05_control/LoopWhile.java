package lec05_control;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
	
		System.out.println("\n=============================");
		
		// level1
		boolean isRunning = true;
		Scanner sc = new Scanner(System.in);
		
		while(isRunning) {
			System.out.print("콘솔에 출력할 내용 입력[종류 q 또는 Q]: ");
			String inputText = sc.nextLine();
			if(inputText.equals("q") || inputText.equals("Q")) {
				System.out.println("프로그램이 종료되었습니다.");
				isRunning = false;
			} else {
				System.out.println("inputText");
			}
		} sc.close();
	
		
	}

}
