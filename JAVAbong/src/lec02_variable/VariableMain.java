package lec02_variable;

public class VariableMain {

	public static void main(String[] args) {
		int money = 900;
		
		// 상수명 이름 짓기 - 단어 전부 대문자, 단어 사이는 언더바로 연결
		
		final String NEXT_IT_ADDRESS = "대전 중구 희영빌딩" ;
		
		System.out.println(money);
		System.out.println(NEXT_IT_ADDRESS);
		
		// 변수를 선언하면서 값을 부여
		// 값을 초기화한다 (Initialization -> Init)
		
		int numOne = 1;
		System.out.println(numOne);
		
		// 변수를 선언만, 값 부여 안 할수도 있음
		
		int numTwo;
		numTwo = 2; // 변수에 값 저장
		System.out.println(numTwo);
		
		// 변수의 다중 선언
		
	//	int numThree, numFour;
	//	numThree = 3;
	//	numFour = 4;
		
		// 변수의 다중 선언은 되지만, 값을 넣어주면서 선언은 할 수 없다.
		// int numThree, numFour = 5, 6; - X

		// 문자열(String)
		// String은 클래스이므로 다양한 함수를 내장하고 있다
		
		String fruits = "Apple, Banana, Carrot";
		System.out.println(fruits);
		
		// .length()
		// 해당 문자열의 길이를 리턴
		
		System.out.println(fruits.length());
		
		// .charAt(인덱스)
		// 인덱스는 문자열에서 몇 번째에 해당하는 숫자를 말함
		// 인덱스는 0부터 시작
		// 해당 문자열에서 인덱스에 해당하는 문자(char) 리턴
		
		System.out.println(fruits.charAt(0));
		
		// .indexOf(문자열)
		// 해당 문자열에서 괄호 안에 있는 문자의 인덱스 위치를 리턴
		// 해당 문자열을 포함하지 않는다면 -1 리턴
		
		System.out.println(fruits.indexOf("Banana"));
		System.out.println(fruits.indexOf("banana"));
		
		// .subString(시작 인덱스, 끝 인덱스)
		// 해당 문자열을 시작 인덱스에서 끝 인덱스까지 잘라서 리턴
		
		System.out.println(fruits.substring(7, 14)); // 7 - 13까지
		
		// .replace(수정 전 문자열, 수정 후 문자열)
		// 해당 문자열 수정
		
		System.out.println(fruits.replace("Carrot", "Coconut"));
		System.out.println(fruits.replace(" ", ""));
		
		// .trim()
		// 해당 문자열의 양끝에 존재하는 모든 공백 제거
		
		String strWorld = "   The Wolrd    ";
		System.out.println(strWorld.trim());
		
		// .toUpperCase()
		// 해당 문자열에 존재하는 알파벳 전부 대문자로 변환
		
		System.out.println(fruits.toUpperCase());
		System.out.println(fruits.toLowerCase()); // 소문자 변환
		
		// .concat(문자열)
		// 해당 문자열에 괄호 안 문자 이어붙임
		
		System.out.println(fruits.concat(", DDangkong")); // 잘 쓰이지 않음
		System.out.println(fruits + ", DDangkong"); 
		
		// String은 참조 타입이므로 null 값을 가질 수 있다
		
		String anything = null;
		System.out.println(anything);
											// null 과 "" (empty) 는 엄연히 다른 값
		String notThing = "";
		System.out.println(notThing);
		
		// 명령어대로 산출 할 뿐, 원본은 바뀌지 않음
		
		System.out.println(fruits);
		
		// 괄호안의 인덱스 전까지 해당 문자열을 자름
		
		fruits = fruits.substring(7);
		System.out.println(fruits);
		
		// byte = -128 ~ 127
		
		byte byteNum = 127;
		byteNum++;		// 1 더하기
		byteNum += 1; // 1 더하기
		System.out.println(byteNum); // 127 초과이므로 -128부터 다시 시작
		
		// 형 변환(Casting)
		
		int intVal = 17;
		double doubVal = 3.14;
		
		double doubmulVal = intVal * doubVal;		// int * double = double 자동 형변환
		int intMulVal = (int) (intVal * doubVal); // int * double = (타입) (값) 강제 형변환
		
		System.out.println(doubmulVal);				// 값이 실수로 잘 변환
		System.out.println(intMulVal);				// 소수점 사라짐
		
		float floatMulVal = intVal * 3.14f;
		System.out.println(floatMulVal);
		
		//
		
	//	long longVar = 20000L;
		float fVar = 3.14f;
									// 뒤에 L,F 붙이기 귀찮아서 int, double 많이 
	//	int intVar = 20000;
	//	double dVar = 3.14;
		
		// 강제 형변환 ( 문자열 -> 숫자 )]
		
		String star = "17";
		String sun = star + 1;
		System.out.println(sun);		// 결과 171
		
		int sunSet = Integer.parseInt(star); 	// 문자열 17 -> 정수 17
		sunSet = sunSet + 1;
		System.out.println(sunSet);
		
		// 숫자 -> 문자열
		
		String strStar = Integer.toString(sunSet); // 숫자 -> 문자
		String strStar2 = sunSet + "";				 // 같은 방법
		strStar = strStar + 1;
		strStar2 = strStar2 + 1;
		System.out.println(strStar);
		System.out.println(strStar2);
		
		// 예제
		// 문자열 2784를 2 + 7 + 8 + 4 = 결과로 나타내어라
	
		String example = "2784";
		
		String str1 = example.substring(0,1);
		String str2 = example.substring(1,2);
		String str3 = example.substring(2,3);
		String str4 = example.substring(3,4);
		
		int int1 = Integer.parseInt(str1);		
		int int2 = Integer.parseInt(str2);		
		int int3 = Integer.parseInt(str3);		
		int int4 = Integer.parseInt(str4);
		
		int result = int1 + int2 + int3 + int4;
		System.out.println("결과는 : " + result);
			
				
	}
}
