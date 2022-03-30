package lec05_control;

import java.util.Scanner;
import java.util.regex.Pattern;

public class testTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자만 입력하여라");
		String inputText = sc.nextLine();
		String regex = "^[a-zA-z]*$";
		boolean onlyText = Pattern.matches(regex, inputText);
		
		if(!onlyText) {
			System.out.println("문자만 쓰라고");
		} else {
			System.out.println("잘해쓰,");
		} sc.close();
		
		
		
		
		
	}

}
