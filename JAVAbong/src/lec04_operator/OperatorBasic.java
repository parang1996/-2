package lec04_operator;

public class OperatorBasic {

	public static void main(String[] args) {
		
		int intVar = 10;
		intVar++; 								// 1증가
		System.out.println(intVar);
		intVar--;								// 1감소
		System.out.println(intVar);
		
		//
		
		char hangul = 44032;
		System.out.println(hangul);
		
		hangul++;
		System.out.println(hangul);
		System.out.println(++hangul);
		
		// 대입 연산자
		
		int intVal = 10;
		
		intVal += 1;					
		System.out.println(intVal);
		
		intVal += 34;
		System.out.println(intVal);
		
		intVal -= 25;
		System.out.println(intVal);
		
		intVal *= 2;
		System.out.println(intVal);
		
		intVal /= 4;
		System.out.println(intVal);
		
		intVal %= 3;						// 나머지 
		System.out.println(intVal);
		
		// 산술 연산자
		
		int numA = 10;
		int numB = 3;
		numA = numA + 3;
		System.out.println(numA);
		
		int numC = numA + numB;
		System.out.println(numC);
		
		System.out.println("빼기: "+(numA-numB));
		System.out.println("곱하기: "+(numA*numB));
		System.out.println("나누기: "+(numA/numB));
		System.out.println("나머지: "+(numA%numB));
		
		numC = 10 + (3 * 10);
		System.out.println(numC);
		
		// 정수를 나누었을 때, 소수점 생략 안하는법
		
		double div = 10/2;
		System.out.println(div);
		
		div = 10 / 3.0; 				// 정수 나누기 실수
		System.out.println(div);
		
		float divFloat = 10 / 3.0f;
		System.out.println(divFloat);
		
		div = (double) 10 / 3;		// 실수 나누기 정수
		System.out.println(div);
		div = 10 / (double) 3;		// 정수 나누기 실수
		System.out.println(div);
		div = (double) (10/3);		// 정수 나누기 정수 이후 실수 변환
		System.out.println(div);
		
		double dVal = (double) numA / numB;
		System.out.println(dVal);
		
		float fVal = numA / (float) numB;
		System.out.println(fVal);
		
		
		// % 나머지 연산자 자주 쓰는 경우
		
		intVar = 6;
		
		int remain = intVar % 2;
		System.out.println(remain); // 게이판 페이징 구현 시, 짝수 홀수, 
		
		int totalCountGul = 336;		// ex)게시판 글 336개
		int showCountInOnePage = 15; // 한 페이지에 15개 게시글
		
		int countPage = totalCountGul / showCountInOnePage;		// 총 페이지 수
		int countLastPageGul = totalCountGul % showCountInOnePage; 	// 마지막 페이지 수
		
		System.out.printf("현재 게시판의 총 %d개의 게시글이 있고 한 페이지에 보여줄 글의 수는 %d개 일 때, 총 페이지 수는 %d개이며 "
							+ "마지막 페이지에는 %d개의 글이 보여집니다.\n"
							,totalCountGul, showCountInOnePage, countPage, countLastPageGul);
		
		// 문자열 더하기
		
		String subway = "반석";
		subway = subway + ", 지족"; 			// string 타입에 대해 + 는 이어붙이기
		System.out.println(subway);
		subway = "종점, " + subway;
		System.out.println(subway);
		
		subway += ", 노은";
		System.out.println(subway);
		
		// 비교 연산자 
		// * String은 == 이 아니라 .equals 사용
		
		numA = 10; numB = 3;	numC = 10;
		
		boolean boolVal = numA > numB;
		System.out.println(boolVal);
		
		boolVal = numA < numB;
		System.out.println(boolVal);
		
		boolVal = numA >= numB;
		System.out.println(boolVal);
		
		boolVal = numA >= numC;
		System.out.println(boolVal);
		
		// 문자열 비교 .equals(문자열)
		
		String ship = "배";
		String pear = "배";
		String stomach = new String("배");
		
		System.out.println(ship.equals(stomach));
		System.out.println(ship.equals("배 ".trim())); 			// 공백 제거 후 비교
		
		
		// null 과 empty
		
		String strA = null;
		String strB;
		String strC = "";
		
		// .isEmpty() 비어있는지 true false 로 리턴
		
		System.out.println(strC.equals(""));
		System.out.println(strC.isEmpty());
		
		// 조건 연산자 (= 삼항 연산자)
		
		strC = "";
		String strCIsEmpty = (strC.isEmpty()) ? "비었어요" : "뭐가 있어요";
		System.out.println(strCIsEmpty);
		
		int intISEmpty = (strC.isEmpty()) ? 1 : 0;
		System.out.println(intISEmpty);		
				
	}

}
