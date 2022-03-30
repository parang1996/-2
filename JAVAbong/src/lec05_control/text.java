package lec05_control;

import java.util.Scanner;

public class text {

	public static void main(String[] args) {
		
		Scanner aa = new Scanner(System.in);
		System.out.println("국어 점수를 입력해주세요");
		String grade = aa.nextLine();
		System.out.println("영어 점수를 입력해주세요");
		String grade2 = aa.nextLine();
		System.out.println("수학 점수를 입력해주세요");
		String grade3 = aa.nextLine();
		
		int avgGrade1 = Integer.parseInt(grade);
		int avgGrade2 = Integer.parseInt(grade2);
		int avgGrade3 = Integer.parseInt(grade3);
		
		int avg = (avgGrade1 + avgGrade2 + avgGrade3) / 3;
		
		if(avg >=90) {
			System.out.println("A등급입니다");
		} else if (avg >= 80){
			System.out.println("B등급입니다");
		} else if (avg >= 70) {
			System.out.println("C등급입니다");
		} else {
			System.out.println("D등급입니다");
		}
		aa.close();

	}

}
