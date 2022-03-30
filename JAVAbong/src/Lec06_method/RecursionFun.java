package Lec06_method;

public class RecursionFun {

	public static void main(String[] args) {
		// 5, 4, 3, 2, 1 출력되게 할 재귀함수
		anyFunction(5);
		System.out.println("\n==================\n");
		// 팩토리얼 구하는 함수
		System.out.println(factorial(5));
		// 재귀함수를 팩토리얼 만들기
		System.out.println(reFac(5));
		System.out.println("\n==================\n");
		// 10진수 수를 2진수 변환
		
	}
	public static void anyFunction(int num) {
		if(num == 0) { //조건식
			return;
		}
		System.out.println(num);
		anyFunction(num-1); //증감식
	}
	public static long factorial(int num) {
		long result = 1;
		for(int i =1; i <= num; i++) {
			result *= i;
		}
		return result;
	}
	public static long reFac(int num) {
		if(num ==1) {
			return 1;
		}
		return num * reFac(num-1);
		// 5를 넣었다하면 
		// 5 * reFac(4)
		// 5 * 4 * reFac(3)
		// ~~ 
	}
}
