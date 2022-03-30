package lec12_exception;

import java.text.ParseException;

public class ExceptionMain {

	public static void main(String[] args) {
		
		int[] intArray = {1,2,3};
		
		// 에러(예외)가 발생하면 프로그램이 즉시 종료되기 때문에
		// 웹페이지라면 응답이 없어지며, 앱의 경우 종료된다.
		try {
			System.out.println("우어어ㅓ어어어ㅓㅓㅓㅓㅓㅓㅓㅓㅓ");
			System.out.println(intArray[3]);
			System.out.println("출력이 안됨");
		} catch (Exception e) {
			e.printStackTrace();
			// 에러가 콘솔창에 출력되는 시점과 syso가 콘솔창에 출력되는 시점은 다르다.
			System.err.println("난 딸기야");
			System.out.println("애라 애라");
			// 웹 사이트 경우 에러 사이트로 이동시켜준다.
		}
		System.out.println("배열의 길이: " + intArray.length);
		
		try {
			System.out.println(intArray[3]);
		} catch (ArrayIndexOutOfBoundsException e) {
			// 구체적인 예외를 지정할 수도 있다.
			System.out.println("인덱스 3은 없습니다");
		} catch (Exception e) {
			System.out.println("나도 모르는 에러");
		}
		
		System.out.println("\n=======================================\n");
		
		int intA = 3;
		int intB = 0;
		
		
		try {
			System.out.println(intArray[2]);
			System.out.println(intA/intB);			
		} catch (ArithmeticException a) {
//			a.printStackTrace();
			System.out.println("0으로 나누지마");
		} catch (ArrayIndexOutOfBoundsException e) {
			// 각 예외에 대한 다른 처리를 할 수 있다.
			System.out.println("나도 몰라");
		} catch (Exception e) {
			System.out.println("몰라ㅏㅏㅏㅏㅏㅏㅏㅏ");
		}
		
		// 충분히 예상되는 에러의 경우에는 따로 Exception 클래스를 만들어서 처리한다.
		// -> BizException
		
		try {
			System.out.println(ExceptionMethod.divide(5, 0));
		} catch (BizException e) {
			System.out.println("에러 발생");
			// 서버로 에러 코드와 에러 메세지를 보냅니다.
//			e.printStackTrace();
			// 에러 메시지 읽기
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println("나도 몰라");
		}
		
		System.out.println("\n=========================================================\n");
		
		try {
			ExceptionMethod.showName("123");
		} catch (BizException b) {
			System.out.println("에러코드: " + b.getErrCode());
			System.out.println("에러메시지: " + b.getMessage());
		} catch (Exception e){
			System.out.println("나도 몰라");
		}
		
		System.out.println("\n==================================================\n");
		
		try {
			ExceptionMethod.dateMillSc("20220322");
		} catch (ParseException p) {
			System.out.println("날짜 포맷을 yyyy.MM.dd로 맞춰주세요.");
		} catch (Exception e) {
			System.out.println("나도 몰라");
		} finally {
			// 일반적인 명령문의 경우 굳이 finally 쓸 이유가 없다.
			// 주로 try문에서 사용된 객체를 close할 때 이용
			System.out.println("에러가 발생하던 말던 실행");
		}
	}
}