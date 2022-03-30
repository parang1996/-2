package lec09_class.cafe;

import java.util.Scanner;

import lec09_class.Constants;

public class CafeMain {

	public static void main(String[] args) {
		Cafe starBucks = new Cafe("스타벅스");
		
		starBucks.addCoffee(new Coffee("아메리카노", 5000));
		starBucks.addCoffee(new Coffee("에스프레소", 7000));
		starBucks.addCoffee(new Coffee("코코아", 9000));
		
		Cafe conte = new Cafe("꽁떼");
		conte.addCoffee(new Coffee("아메리카노", 2500));
		conte.addCoffee(new Coffee("에스프레소", 3000));
		conte.addCoffee(new Coffee("아이스티", 3500));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("방문할 카페를 선택해주세요.");
			System.out.println("1.스타벅스 | 2.꽁떼 | 3.사무실로 복귀..");
			System.out.print(">>> ");
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				// 스타벅스 방문
				System.out.printf(Constants.WELCOME_CAFE, starBucks.getName());
				System.out.println("메뉴판");
				starBucks.showCoffeeList();
				System.out.println("메뉴를 선택해주세요: ");
				String inputText = sc.nextLine();
				
				int index = starBucks.indexOfCoffee(inputText);
				if(index != -1) {
					Coffee coffee = starBucks.getCoffee(index);
					System.out.println(coffee.getName() + "를" + coffee.getPrice() + "에 구매하였습니다.");
				}
			}else if(select == 2) {
				// 꽁떼 방문
				System.out.println("어서오세요. 꽁떼 입니다.");
				System.out.println("메뉴판");
				conte.showCoffeeList();
				System.out.println("메뉴를 선택해주세요: ");
				String inputText = sc.nextLine();
				
				int index = conte.indexOfCoffee(inputText);
				if(index != -1) {
					Coffee coffee = conte.getCoffee(index);
					System.out.println(coffee.getName() + "를" + coffee.getPrice() + "에 구매하였습니다.");				
			}else if(select == 3) {
				System.out.println("사무실로 복귀합니다.");
				break;
			}
		}
	}
  }
}
