package lec05_control;

import java.util.Scanner;

public class conditionQuestion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력해주세요");
		String name = sc.nextLine();	
		System.out.print("연락처를 \"-\" 없이 입력해주세요");
		String phone = sc.nextLine();
		System.out.print("나이를 입력해주세요");
		String age = sc.nextLine();
		
		if((name.length() > 0) && 
				(phone.length() == 11 || phone.length() ==10) && 
				(Integer.parseInt(age) >= 14)) {
				System.out.println("버튼 활성화");
			} else {
				System.out.println("불가");
			}sc.close();
	} 

}
