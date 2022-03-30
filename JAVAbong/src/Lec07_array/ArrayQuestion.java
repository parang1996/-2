package Lec07_array;

public class ArrayQuestion {

	public static void main(String[] args) {
		int[] intArr = {23, 456, 213, 32, 464, 1, 2, 4};
		
		// int intArr의 최댓값을 출력해주세요
		// 당연히 for문 이용
		int max = intArr[0];
		for(int i=0; i <intArr.length; i++) {
				if(intArr[i] > max) {
					max = intArr[i];
			}
		}	
		System.out.println(max);
		
		// 자리 바꾸기
		int temp = intArr[0];
		intArr[0] = intArr[1];
		intArr[1] = temp;
		
		System.out.println("\n============== 정렬문제 =================\n");
		
		// 배열 내 요소 자리 바꾸는 함수
		
		//선택 정렬
		// 1. 해당 배열에서 최댓값을 찾아서 해당 위치의 값과
		// 2. 배열의 마지막 값을 스왑
		// 3. 배열의 마지막을 제외한 나머지 값들 중
		//	  최대값을 찾아 해당 위치의 값과 배열의 끝에서 두번째 값을 스왑
		// 4, 반복
		//tempArray를 오름차순으로 정렬해주세요.
		
		int[] tempArray = {23, 456, 213, 32, 464, 1, 2, 4};
		max = tempArray[0];
		for(int i=0; i<tempArray.length; i++) {
			if(tempArray[i] > max) {
				max = tempArray[i];
				tempArray[i] = tempArray[i-1];
			}
		}
		
		
		
		
	}
	/**
	 * 해당 intArray의 인덱스 A와 인덱스 B값을 교환한다
	 * @param intArray 값을 교환 할 숫자배열
	 * @param idxA	값을 교환 할 인덱스 첫번째
	 * @param idxB	값을 교환 할 인덱스 두번째
	 */
	public static void swap(int[] intArray, int idxA, int idxB) {
		int temp = intArray[idxA];
		intArray[idxA] = intArray[idxB];
		intArray[idxB] = temp;
		
	}
}