package Lec07_array;

public class MyAnswer {

	public static void main(String[] args) {
		int[] intArr = { 23, 256, 300, 32, 464, 1, 500, 4 };
		
		for (int i = 0; i < intArr.length; i++) {
			int maxIndex = intArr[intArr.length-1];
			int maxVal = intArr[intArr.length-1];
			for (int j = i; j < intArr.length-1; j++) {
				if (maxVal < intArr[j]) {
					maxVal = intArr[j];
					maxIndex = j;
				}
			}
			swap(intArr, maxIndex, i);
			printArray(intArr);
			System.out.println("  " + i + "번째");
		}
	}
	public static void swap(int[] intArray, int idxA, int idxB) {
		int temp = intArray[idxA];
		intArray[idxA] = intArray[idxB];
		intArray[idxB] = temp;
	}

	public static void printArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			if (i == intArray.length - 1) {
				System.out.print(intArray[i]);
			} else {
				System.out.print(intArray[i] + ", ");
			}
		}
	}

	public static void printArray(String[] strArray) {
		for (int i = 0; i < strArray.length; i++) {
			if (i == strArray.length - 1) {
				System.out.print(strArray[i]);
			} else {
				System.out.print(strArray[i] + ", ");
			}
		}

	}

	}


