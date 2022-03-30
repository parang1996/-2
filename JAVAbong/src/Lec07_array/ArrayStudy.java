package Lec07_array;

import java.util.Base64;
import java.util.Base64.Decoder;
import java.util.Base64.Encoder;

public class ArrayStudy {

	public static void main(String[] args) {
		//배열 (array)
		
		String student1 = "사오정";
		String student2 = "삼장";
		String student3 = "손오공";
		String student4 = "저팔계";
		
		System.out.println("서유기 등장인물 : " + student1 + student2 + student3 + student4);
		System.out.println("\n============== 문자 배열 =================\n");
		//배열의 선언 1
		String[] students = new String[4];
		// string 타입의 변수를 4개 담을 수 있는 배열 선언
		
		// 배열.length 을 하면 해당 배열의 크기를 리턴한다.
		System.out.println("배열 크기 : " + students.length);
		
		// 배열의 값 확인, 인덱스 사용
		System.out.println(students[0]);
		
		//0부터 배열의 .length 까지 순회하면 배열의 모든요소에 접근이 가능
		for(int i=0; i<students.length; i++) {
			System.out.print(students[i]+ ",");
		}
		
		System.out.println("\n============== 숫자 배열 =================\n");
		// 숫자형 타입의 경우 값을 주지 않으면 0
		// 참조형 타입의 경우 값을 주지 않으면 null
		int[] intArray = new int[6];
		for(int i=0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ",");
		}
		System.out.println("\n============== 배열의 값 넣기 =================\n");
		
		students[0] = "사오정";
		students[1] = "삼장";
		students[2] = "손오공";
		students[3] = "저팔계";
		
		System.out.println(students[2]);
		
		// 배열의 단점
		// 크기가 고정됨 (최악 of 최악)
		// students[4] = "크리링";
		// 빨간줄 에러는 컴파일 에러로, 실행을 안해봐도 
		// 이클립스가 캐치
		// 실행했을 경우 발생하는 에러는 런타임 에러
		// System.out.println(students[4]);
		
		
		// 배열 요소(element) 조회하는 함수
		printArray(students);
		int intVal = 12;
		for(int i=0; i < intArray.length; i++) {
			intArray[i] = intVal;
			intVal *= 2;
		}
		printArray(intArray);
		
		System.out.println("\n============== 배열 선언 2 =================\n");
		//배열 선언2
		String[] strArray = {"사오정","삼장","손오공","저팔계"};
		// 크기 4의 문자열 배열 선언
		printArray(strArray);
		
		System.out.println("\n============== 문자열 나누기 =================\n");
		
		String myInfo = "정찬웅, 010=7398-7332, akow283@gmail.com";
		// .split() 괄호안 문자열을 기준으로 해당 문자열을 문자열 배열로 나눈다.
		String[] infoArray = myInfo.split(","); // , 를 기준으로
		System.out.println(infoArray.length);
		System.out.println(infoArray[0]);
		System.out.println(infoArray[1]);
		System.out.println(infoArray[2]);
		printArray(infoArray);
		
		String calStr = "1+4+2";
		String[] calArray = calStr.split("\\+"); // + 기준으로
		printArray(calArray);
		
		int aa[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int b[] = aa[0];
		for(int i=0; i < b.length; i++) {
			System.out.println(b[i]);
		}
		
		System.out.println("\n============== 문자열 나누기 =================\n");
		
		int intValA = 10;
		int intValB = intValA;
		
		intValB = 5;
		System.out.println("A : " + intValA);
		System.out.println("B : " + intValB);
		
		String[] copyArray = strArray;
		printArray(copyArray);
		System.out.println(strArray);
		System.out.println(copyArray);
		System.out.println(strArray.hashCode());
		System.out.println(copyArray.hashCode());
		
		// 해쉬코드?
		// 객체의 메모리 주소값을 이용하여 해쉬를 적용한 코드
		// 해쉬란?
		// 해쉬함수(암호화 알고리즘)을 이용하여 데이터를 암호화하는 기법
		
		System.out.println("\n============== 카피 =================\n");
		copyArray[2] = "손오반";
		printArray(strArray);
		printArray(copyArray);
		
		// 암호화, 복호화
		// 암호화
		Encoder base64Encoder = Base64.getEncoder();
		String password = "1q2w3e4";
		byte[] passByte = password.getBytes();
		String encryption = new String(base64Encoder.encode(passByte));
		
		System.out.println("암호화된 비밀번호 : " + encryption);
		
		// 복호화
		Decoder base64Decoder = Base64.getDecoder();
		String decryption = new String(base64Decoder.decode(encryption));
		System.out.println("복호화된 비밀번호 : " + decryption);
		
		System.out.println("\n============== 올바른 배열복사 =================\n");
		//올바른 복사 방법
		String[] copyArray2 = strArray.clone();
		printArray(copyArray2);
		
		System.out.println(strArray.hashCode());
		System.out.println(copyArray2.hashCode());
		
		copyArray2[1] = "크리링";
		printArray(strArray);
		printArray(copyArray2);
		
		// clone을 까먹었어요. 그렇다면
		String[] sameStrArray = new String[strArray.length];
		for(int i = 0; i < strArray.length; i++) {
			sameStrArray[i] = strArray[i];
		}
		printArray(sameStrArray);
		
		System.out.println("\n============== 숫자 배열 =================\n");
		
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		
		System.out.println("\n============== 정렬 =================\n");
		// 정렬 알고리즘
		// 버블 정렬
		int temp = 0;
		for(int i=0; i < intArr.length; i++) {
			boolean swapped = false;
			for(int j=0; j < intArr.length-1-i; j++) {
				if(intArr[j]>intArr[j+1]) {
					temp = intArr[j];
					intArr[j] = intArr[j+1];
					intArr[j+1] = temp;
					swapped = true;
				}
			}
			if(swapped == false) {
				System.out.println("정렬 완료");
				break;
			}
			System.out.println(i + "회 시행");
			printArray(intArr);
		}
	}
	// 배열 요소 출력 함수
	public static void printArray(String[] strArray) {
		for(int i=0;i<strArray.length;i++) {
			if(i == strArray.length -1) {
				System.out.println(strArray[i]);
			}else {
				System.out.print(strArray[i] + ", ");				
			}
		}
	}
	public static void printArray(int[] intArray) {
		for(int i=0;i<intArray.length;i++) {
			if(i == intArray.length -1) {
				System.out.println(intArray[i]);
			}else {
				System.out.print(intArray[i] + ", ");				
			}
		}
	}
}
