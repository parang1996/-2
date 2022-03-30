package submit2;

import java.util.ArrayList;
import java.util.Collections;

public class Submit01 {
	public static void main(String[] args) {
		// 1. 정수를 담을 수 있는 ArrayList 객체를 생성하고, 10부터 20 사이의 랜덤 숫자를 10개 담으시오.
		// 2. 해당 정수형 리스트를 한 줄로 출력하시오.

		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++) {
			int random = (int)((Math.random()*11)+10);
			intList.add(random);
		}System.out.println(intList + " - 한 줄로 출력");
		
		// 3. 해당 정수형 리스트에서 중복된 숫자들을 제거한 후 출력하시오.
		
		ArrayList<Integer> intList2 = new ArrayList<Integer>();
		
		for(int i = 0; i < 10; i++){
			int random2 = (int)((Math.random()*11)+10);
			if(intList2.contains(random2)) {
				i--;
			}else {
				intList2.add(random2);
			}
		}System.out.println(intList2 + " - 중복된 숫자 제거");
		
		// 4. 중복을 제거한 정수형 리스트를 오름차순으로 정렬하여 출력하시오.
		
		Collections.sort(intList2);
		System.out.println(intList2 + " - 중복된 숫자 제거 오름차순 정렬");
		
		// 5. 중복을 제거한 정수형 리스트를 내림차순으로 정렬하여 출력하시오.
		
		Collections.sort(intList2, Collections.reverseOrder());
		System.out.println(intList2 + " - 중복된 숫자 제거 내림차순 정렬");
	}
}
