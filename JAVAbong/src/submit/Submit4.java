package submit;

import java.util.Scanner;

public class Submit4 {

	public static void main(String[] args) {
		/*
		 * 사용자로부터 현재신장(cm)과 현재체중(kg)을 입력받아 비만도를 표기 해주는 프로그램을 작성하시오.
			표준체중(kg) = (현재신장 - 100) * 0.9
			비만도(%) = (현재체중 / 표준체중) * 100
			
			비만도가 80미만은 저체중
			비만도가 80이상 110미만은 정상체중
			비만도가 110이상 130미만은 과체중
			비만도가 130이상은 비만
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("현재 신장(cm)을 입력해주세요 : ");
		int inputCm = sc.nextInt();
		System.out.print("현재 체중(kg)을 입력해주세요 : ");
		int inputKg = sc.nextInt();
		double kg2 = (inputCm - 100) * 0.9;
		int kg3 = (int)(inputKg / kg2) * 100;
		if(kg3 < 80) {
			System.out.println("저체중입니다");
		}else if (kg3 >=80 && kg3 < 110) {
			System.out.println("정상체중입니다");
		}else if (kg3 >= 110 && kg3 < 130) {
			System.out.println("과체중입니다");
		}else {
			System.out.println("저체중입니다");
		}
		
		
		
	}

}
