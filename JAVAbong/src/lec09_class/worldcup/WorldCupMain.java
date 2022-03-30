package lec09_class.worldcup;

import java.util.ArrayList;
import java.util.Scanner;

public class WorldCupMain {

	public static void main(String[] args) {
		Menu menu = new Menu();
		Menu menu2 = new Menu("짜장면", false);
		System.out.println(menu2);
		
		System.out.println(menu2.getName());  				// 필드변수에 private을 걸어두었기 때문에 getters/setters로 접근
		
		ArrayList<Menu> menuList = new ArrayList<Menu>();
		
		menuList.add(new Menu("짜장면"));
		menuList.add(new Menu("짬뽕"));
		menuList.add(new Menu("볶음밥"));
		menuList.add(new Menu("김치찌개"));
		menuList.add(new Menu("제육볶음"));
		menuList.add(new Menu("돈까스"));
		menuList.add(new Menu("김밥"));
		menuList.add(new Menu("떡볶이"));
		menuList.add(new Menu("뼈해장국"));
		menuList.add(new Menu("순대국밥"));
		menuList.add(new Menu("햄버거"));
		menuList.add(new Menu("냉면"));
		menuList.add(new Menu("파스타"));
		menuList.add(new Menu("삼겹살"));
		menuList.add(new Menu("생선구이"));
		menuList.add(new Menu("리조또"));
		
		Scanner sc = new Scanner(System.in);
		
		// 16강
		// 0:1 | 2:3 | 4:5 | ~~
		System.out.println("16강");
		for(int i=0; i < menuList.size(); i+=2) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1." + menuList.get(i).getName() + " 2." + menuList.get(i+1).getName());
			System.out.print(">>> ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				menuList.get(i).setSelect(true);
			}else if(select == 2) {
				menuList.get(i+1).setSelect(true);
			}
		}
		
		// 8강
		System.out.println("8강");
		ArrayList<Menu> menuList8 = trueList(menuList);
		for(int i=0; i < menuList8.size(); i+=2) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1." + menuList8.get(i).getName() + " 2." + menuList8.get(i+1).getName());
			System.out.print(">>> ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				menuList8.get(i).setSelect(true);
			}else if(select == 2) {
				menuList8.get(i+1).setSelect(true);
			}
		}
		
		// 4강
		System.out.println("4강");
		ArrayList<Menu> menuList4 = trueList(menuList8);
		for(int i=0; i < menuList4.size(); i+=2) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1." + menuList4.get(i).getName() + " 2." + menuList4.get(i+1).getName());
			System.out.print(">>> ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				menuList4.get(i).setSelect(true);
			}else if(select == 2) {
				menuList4.get(i+1).setSelect(true);
			}
		}
		
		// 결승
		System.out.println("결승");
		ArrayList<Menu> menuListFinal = trueList(menuList4);
		for(int i=0; i < menuListFinal.size(); i+=2) {
			System.out.println("메뉴를 선택해주세요");
			System.out.println("1." + menuListFinal.get(i).getName() + " 2." + menuListFinal.get(i+1).getName());
			System.out.print(">>> ");
			
			int select = Integer.parseInt(sc.nextLine());
			
			if(select == 1) {
				menuListFinal.get(i).setSelect(true);
			}else if(select == 2) {
				menuListFinal.get(i+1).setSelect(true);
			}
		}
		for(Menu mn2 : menuListFinal) {
			if(mn2.isSelect()) {
				System.out.println(mn2.getName() + "우승");
			}
		}
	}
	
	public static ArrayList<Menu> trueList(ArrayList<Menu> list){
		ArrayList<Menu> selectList = new ArrayList<Menu>();
		for(Menu mn : list) {
			if(mn.isSelect()) {
				selectList.add(new Menu(mn.getName()));
			}
		}
		return selectList;
	}
}
