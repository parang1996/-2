package lec04_operator;

import java.util.Scanner;

public class OperatorQuestion {

	public static void main(String[] args) {
		
		// 삼항연산자로 주민번호 첫 자리에 따른 성별을 받는 gender 변수에 담아 콘솔에 출력하시오.
		// 홀수면 남성 짝수면 여성
		
		String hisIdBack = "1231476";
		String herIdBack = "4254654";
		
		String str1 = hisIdBack.substring(0,1);	
		int int1 = Integer.parseInt(str1);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("주민번호를 입력하세요.");
		int zzz = sc.nextInt();
		String gender = (zzz%2==int1) ? "남자" : "여자";
		System.out.println(gender);
		
		
		// 선생님 답 
		
		
		//String hisIdBack = "1231476";
		//String herIdBack = "4254654";
		
		int hisFirst = Integer.parseInt(hisIdBack.substring(0,1));
		int herFirst = Integer.parseInt(herIdBack.substring(0,1));
		
		String hisGender = (hisFirst % 2 ==1) ? "남자" : "여자";
		System.out.println(hisGender);
		
		String herGender = (herFirst % 2 ==1) ? "남자" : "여자";
		System.out.println(herGender);
		
		// 이중 삼항 연산자
		// 스코어가 90점보다 크면 grade는 A
		// 80점보다 크면 grade는 B, 나머지는 C
		
		int score = 85;
		String grade = (score > 90) ? "A" : ((score > 80) ? "B":"C");
		System.out.println(score + "점은 " + grade + "등급입니다.");
		
		// 논리 연산자
		// && 좌우 조건 둘 다 참이면 ture
		
		String a = "";
		String b = "눈사람";
		String c = "배";
		
		Boolean boolAB = a.isEmpty() && b.isEmpty();
		System.out.println(a.isEmpty());
		System.out.println(b.isEmpty());
		System.out.println(boolAB);
		
		// || 좌우 조건 중 하나라도 참이면 true
		
		boolAB = a.isEmpty() || b.isEmpty();
		System.out.println(boolAB);
		
		// 여러개
		// || && 중첩시 순서대로 되기 때문에 주의해서 괄호 쳐줌
		
		boolAB = a.isEmpty() && (b.length() > 0 ) && c.equals("배");
		System.out.println(boolAB);
		
		boolAB = a.isEmpty() || ((b.length() > 0 ) && c.equals("배"));
		System.out.println(boolAB);
		
		// 논리 연산자를 쓰면 if문을 많이 안 만들어도 됨
		
		// ! 는 boolean 타입값의 반대를 리턴
		
		boolAB = !a.isEmpty();
		System.out.println(boolAB);		
		
		// 비트 연산자 ( 잘 안 쓴 다 )
		
		int numTen = 10;		// 2진법으로 변환 후 두수의 단위별로 정해진 식 계산
		int numNine = 9;		
		
		System.out.println("& = " + (numTen & numNine));
		
		
	}
}
