package lec08_collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class CollectionQuestion {

	public static void main(String[] args) {
		// 중복제거
		// makeLotto 를 ArrayList 와 HashSet을 이용해서 만들어보세요
//		ArrayList<Integer> lotto1 = new ArrayList<Integer>();
//		HashSet<Integer> lotto = new HashSet<Integer>();
		
//		while(true) {
//			int lottoNum = (int)(Math.random()*45 +1);
//			for(int i=0; i<1; i++) {
//				lotto.add(lottoNum);
//				if(lotto.size() == 6) {
//					lotto1.addAll(lotto);
//					Collections.sort(lotto1);
//					System.out.println(lotto1);
//					break;
//				}
//			}
//		}
		makeLotto();
		
		// ArrayList 로만 처리
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i=0; i < 10; i++) {
			intList.add(i);
		}
		for(int i=4; i < 10; i++) {
			intList.add(i);
		}
		
		ArrayList<Integer> intArray = new ArrayList<Integer>();
		for(int i=0; i < intList.size(); i++) {
			if(intArray.indexOf(intList.get(i)) == -1) {
				intArray.add(intList.get(i));
			}
		}
		System.out.println(intArray);
	}
	static void makeLotto() {
		
		ArrayList<Integer> lotto1 = new ArrayList<Integer>();
		HashSet<Integer> lotto = new HashSet<Integer>();	
		
		while(lotto.size() < 6) {
			int rand = (int)(Math.random()*45 +1);
			lotto.add(rand);
		}
		
		ArrayList<Integer> lottoList = new ArrayList<Integer>();
		lottoList.addAll(lotto);
		Collections.sort(lottoList);
		System.out.println(lottoList);
	}
}
		
	
	
	

