package Lec07_array;

public class aa {

	public static int main(int[] winArray, int[] myArr) {
		
	
			int result = 0;
			for(int i = 0; i < winArray.length; i++) {
				for(int j= 0; j < myArr.length ; j++) {
					if(winArray[i] == myArr[j]) {
						result += 1;
					}
				}
			}return result;
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
	
	}
}