package lec12_exception;

import java.util.Scanner;

public class TryWithResource {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// finally에서 사용하는 close
		
		try {
			System.out.println("아무말이나 입력: ");
			System.out.println(sc.nextLine());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			sc.close();
		}
		
		// try-with-resource 구문
		// catch 생략가능
		// 닫아야 할 객체를 try()안에 선언 후 try 블록{} 내에서 사용
		// 객체의 클래스는 AutoCloseable 인터페이스를 구현하고 있어야 한다.
		try(Scanner sca = new Scanner(System.in)) {
			System.out.println("아무말: ");
			System.out.println(sca.nextLine());
		}
		
		// try() 괄호안에 객체 여러개 선언
		try(Scanner scan = new Scanner(System.in);
				Scanner scan1 = new Scanner(System.in)){
			System.out.println("아무말말: ");
			System.out.println(scan.nextLine());
			System.out.println("아무말말말말말: ");
			System.out.println(scan1.nextLine());
		}
	}
}
