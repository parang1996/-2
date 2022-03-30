package free_baseball;

import java.util.ArrayList;

public class RandomNumber {

	// 랜덤 숫자 생성

	public static int randomNum() {
		
		int random = (int) (Math.random() * 10);
		return random;
	}

	// 중복을 허용하지 않는 랜덤숫자 배열 생성

	public static ArrayList<Integer> randomArrayNum() {

		ArrayList<Integer> randomArr = new ArrayList<Integer>();

		for (int i = 0; i < 3; i++) {
			int temp = randomNum();
			if (randomArr.contains(temp)) {
				i--;
			} else {
				randomArr.add(temp);
			}
		}
		return randomArr;
	}
}
