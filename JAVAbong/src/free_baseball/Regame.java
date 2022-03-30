package free_baseball;

import java.util.Scanner;

public class Regame {

	public static void regame() {
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("\n리겜 ? ( Y / N )");
		System.out.print(">>> ");
		String regame = sc.nextLine();
		if(regame.equals("Y") || regame.equals("y")) {
			Start.gameStart();
		} else {
			System.out.println("\n다음에 보자 ~~~~~~~~~~~~");
			break;
			}
		}			
	}
}
