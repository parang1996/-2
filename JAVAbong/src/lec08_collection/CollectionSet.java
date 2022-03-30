package lec08_collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CollectionSet {

	public static void main(String[] args) {
		// 집합(HashSet) 의 선언
		HashSet<String> stuSet = new HashSet<String>();
		HashSet<String> stuSet2 = new HashSet<String>();
		Set<String> stuSet3 = new HashSet<String>();		// 다형성
		
		// .add() 데이터추가
		stuSet.add("욱근");
		stuSet.add("주석");
		stuSet.add("예반");
		System.out.println(stuSet);
		// 중복 안됨
		stuSet.add("욱근");
		System.out.println(stuSet);
		
		// .contains() 해당 데이터가 set 안에 있으면 true, 없으면 false
		System.out.println(stuSet.contains("주석"));
		
		// .size() set내 데이터 개수 리턴
		System.out.println(stuSet.size());
		
		System.out.println("\n==================================\n");
		
		// set 조회
		// while문 사용 (못생김)
		Iterator<String> iterator = stuSet.iterator();
		
		while(iterator.hasNext()) {
			String name = iterator.next();
			System.out.println(name);
		}
		
		// 향상된 for문 = foreach문
		for(String name : stuSet) {
			System.out.println(name);
		}
		
		// .foreach 사용
		stuSet.forEach(name -> System.out.println(name));
		stuSet.forEach(name -> {
			System.out.println(name);		
		});
		
		// set은 집합을 쓰는 경우가 아니라면 잘 쓰지 않으며, 그나마 쓴다면 중복을 허용하지 않는 속성을 이용하는 경우다.
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		
		for(int i=0; i < 10; i++) {
			intList.add(i);
		}
		for(int i=4; i < 10; i++) {
			intList.add(i);
		}
		System.out.println(intList);
		
		// ArrayList 에서 HashSet 으로 변환
		HashSet<Integer> tempSet = new HashSet<Integer>();
		tempSet.addAll(intList);
		System.out.println(tempSet);
		
		// HashSet 에서 ArrayList 로 변환
		intList.clear();
		intList.addAll(tempSet);
		System.out.println(intList);
	}	
}
