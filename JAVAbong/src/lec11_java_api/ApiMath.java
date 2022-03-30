package lec11_java_api;

import java.util.Random;

public class ApiMath {

	public static void main(String[] args) {
		final double PI = 3.141592;

		// 반올림
		double roundPI = Math.round(PI);
		System.out.println(roundPI);

		// 소수 넷째자리에서 반올림하여 3.142 만들기
		roundPI = Math.round(PI * 1000.0) / 1000.0;
		System.out.println(roundPI);

		// 올림
		double ceilPI = Math.ceil(PI);
		System.out.println(ceilPI);

		// 내림
		double floorPI = Math.floor(PI);
		System.out.println(floorPI);

		// 절대값
		int minus = -10;
		int absVal = Math.abs(minus);
		System.out.println(absVal);

		// 로직으로 절대값 구하기
		if (minus < 0) {
			System.out.println(minus * -1);
		} else {
			System.out.println(minus);
		}

		// 제곱
		// 10의 8제곱
		double money = Math.pow(10, 8);
		System.out.println(money);
		// 1.0E8 = 1곱하기 10의 8승
		int intMoney = (int) Math.pow(10, 8);
		System.out.println(intMoney);
		// 7의 4제곱
		money = Math.pow(7, 4);
		System.out.println(money);

		// 로직으로 제곱 구현
		long num = 1;
		for (int i = 0; i < 8; i++) {
			num *= 10;
		}
		System.out.println(num);

		// 7의 4제곱
		num = 1;
		for (int i = 0; i < 4; i++) {
			num *= 7;
		}
		System.out.println(num);
		
		// 제곱근(루트)
		double sqrtNum = Math.sqrt(num);
		System.out.println(sqrtNum);
		
		// 랜덤숫자(난수) 생성
		double randDouble = Math.random();	// 0 ~ 1 사이 실수 생성 (1은 미포함)
		System.out.println(randDouble);
		// 0부터 9까지 정수 생성
		int randInt = (int)(Math.random() * 10);
		System.out.println(randInt);
		// 10 부터 20까지 정수생성
		randInt = (int)(Math.random() * 11) + 10;
		System.out.println(randInt);
		
		// a부터 b까지 정수 생성
		int a = 25;
		int b = 63;
		randInt = (int)(Math.random() * (b-a+1)) + a;
		System.out.println(randInt);
		
		System.out.println("\n=============================\n");
		
		// 랜덤은 딸 Random 클래스가 존재
		Random random = new Random(); // 따로 객체를 생성해야하는 불편함이 있다.
		
		// .nextInt(n) = 0부터 n-1 까지 중 랜덤 정수 반환
		// 0~9 까지의 랜덤 정수
		System.out.println(random.nextInt(10));
		
		// 10 부터 20
		System.out.println(random.nextInt(11)+10);
		
		// 랜덤 boolean 값
		System.out.println(random.nextBoolean());
		
		// 시드 설정
		// 랜덤 난수를 생성할때 내부적으로 사용되는 값
		random.setSeed(7);
		for(int i = 0; i < 6; i++) {
			System.out.print(random.nextInt(45)+1+" ");
		}
	}
}
