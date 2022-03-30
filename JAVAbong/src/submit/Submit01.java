package submit;

public class Submit01 {

	public static void main(String[] args) {
		int i = 100;
		double j = 3.14d;
		String str = "Hello world!";
		System.out.println("정수 : " + i);
		System.out.println("실수 : " + j);
		System.out.println("문자열 : " + str);
		
		System.out.println("\n==============================\n");
		
		i = 200;
		j = 3.141592d;
		str = "change";
		
		System.out.println("\n==============================\n");
		
		double dou1 = (double)i;
		System.out.println("정수 -> 실수형 : " + dou1);
		int int3 = (int)j;
		System.out.println("실수 -> 정수형 : " + int3);
		
		int int1 = 500; 
		String str2 = Integer.toString(int1);
		System.out.println("정수 -> 문자열 : " + str2);
		System.out.println("정수 -> 문자열 : " + str2 + 500);
		
		String strInt = "12345";
		int strInt1 = Integer.parseInt(strInt);
		System.out.println("문자열 타입 정수 -> 정수 형변환 : " + strInt1);
		System.out.println("\n==============================\n");
		
		final int finalInt = 300;
		final double finalDouble = 1.23456d;
		final String finalStr = "상수 문자열";
		System.out.println("상수 : " + finalInt);
		System.out.println("상수 : " + finalDouble);
		System.out.println("상수 : " + finalStr);

		
		
	}

}
