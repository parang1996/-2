package Lec06_method;

import java.util.Scanner;

public class MethodQuestion {

	public static void main(String[] args) {
		// 명함 만들기
		// 사용자가 이름, 연락처, 이메일을 입력했을때 콘솔에
		// ==============================
		// 이름 : [사용자가 입력한 이름]
		// 연락처 : [사용자가 입력한 연락처]
		// 이메일 : [사용자가 입력한 이메일]
		// ==============================
		// 와 같은 형태로 출력해주는 함수를 만들어보세요.
		makeCard("홍길동", 12345678,"abc@naver.com");
		
		System.out.println("\n==================\n");
		
		// 성적표 만들기
		// 두근두근 성적표가 나왔다
		// 국어, 영어, 수학 점수를 입력했을 경우,
		// 국어, 영어, 수학, 총점, 평균, 등급을 출력
		// 평균은 소수 둘째자리에서 반올림하여 출력
		// 등급은 90점 이상 = A , 80점 이상 = B, 70점 이상 = C, 60점 이상 D, 나머지 = F
		
		grade(99, 52, 19);
		
		System.out.println("\n==================\n");
		
		int intVal = 23;
		String binarySting = Integer.toBinaryString(intVal);
		System.out.println(binarySting);
		
		String myBinaryStr = makeBinary(intVal);
		System.out.println(myBinaryStr);
		
		System.out.println("\n==================\n");
		
		// for문을 배울 때, 트리를 만들어봤는데 
		// 항상 5층짜리 트리
		// 사용자가 층 n 입력 받아
		// n층 짜리 트리를 출력할 수 있는 메소드를 만들어서 실행
		
		tree(10);
		
	}
	public static void tree(int n) {	//void 리턴값이 없다, void 자리에 int, String은 리턴할 타입
		String star = "*";
		String blank = "";
		
		for(int i = 0; i < n; i++) {
			if(i > 0) {
				star += "**";
			}
			blank = "";
			for(int j = 1; j < n-i; j++) {
				blank += " ";
			}
			
			System.out.println(i+1 + ": " + blank + star);
		}
	}
 	public static String makeBinary(int num) {
		// 30이 들어왔다
		// 2로 나눠서 나머지는 0 / 몫은 15
		// 15를 2로 나눠 나머지는 1 / 몫은 7
		// 7를 2로 나눠서 나머지는 1 / 몫은 3
		// 3을 2로 나눠서 나머지는 1 / 몫은 1
		
		String result = "";
		while(true) {
			result += (num % 2);
			if(num ==1) {
				break;
			}
			num /= 2;
		}
		return reverseString(result);
	}
	public static String reverseString(String str) {
		String reverse = "";
		for (int i = str.length(); i > 0; i--) {
		reverse += str.substring(i - 1, i);
		}
		return reverse; //리턴 시 메소드 종료
	}
	public static void grade(int korean, int english, int math) {
		double avg = (korean + english + math) / 3.0;
		int sum = (korean + english + math);
		System.out.println("국어 : " + korean);
		System.out.println("영어 : " + english);
		System.out.println("수학 : " + math);
		System.out.println("총점 : " + sum);
		System.out.println("평균 : " + Math.round(avg*10)/10.0);
		if(avg >= 90) {
			System.out.println("총점 : A");
		} else if(avg >= 80) {
			System.out.println("총점 : B");
		} else if(avg >= 70) {
			System.out.println("총점 : C");
		} else if(avg >= 60) {
			System.out.println("총점 : D");
		} else {
			System.out.println("총점 : F");
		}
	}
	/**
	 * 입력한 소수를 소수 n번째로 리턴해주는 함수
	 * @param douNum 반올림 하고 싶은 실수
	 * @param n 자릿수
	 * @return
	 */
	public static double round(double douNum, int n) {
		// 소수 두번째 자리에서 반올림해서
		// 소수 첫번째 자리를 만들고 싶다. (n = 1)
		// 3.141592 에서 10을 곱한 뒤, Math.round를 적용하고
		// 다시 10으로 나누면 됨
		
		// 소수 세번째 자리에서 반올림해서
		// 소수 두번째 자리를 만들고 싶다. (n = 2)
		// 3.141592 에서 100을 곱한 뒤, Math.round를 적용하고
		// 다시 100으로 나누면 됨
		
		// douNum = 3.141592, n = 2를 넣었다면
		int one = 1;
		for(int i = 0; i < n; i++) {
			one *= 10;
		}
		// mul = 314.1592
		double mul = douNum * one;
		// longNum = 314
		long longNum = Math.round(mul);
		// douVal = 3.14
		double douVal = (double)longNum / one;
		
		return douVal;
	}
	
	public static void makeCard(String userName, int userNum, String userMail ) {

		System.out.println("==================");
		System.out.println("이름 : " + userName);
		System.out.println("연락처 : " + userNum);
		System.out.println("이메일 : " + userMail);
		System.out.println("==================");
	}
}
