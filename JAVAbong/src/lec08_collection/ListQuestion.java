package lec08_collection;

import java.util.ArrayList;
import java.util.Arrays;

public class ListQuestion {

	public static void main(String[] args) {
		
		// 하이마트 물건 목록
		// "냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨", "건조기" #1
		// 아내가 사고 싶은 물건
		// "냉장고", "세탁기", "에어컨" #2
		// 남편이 사고 싶은 물건
		// "노트북", "TV", "에어컨" #3
		// 각각의 목록들을 배열로 만들고 서로 사고 싶은 물건 목록(교집합) #4 다 산다고 했을 때 구매목록 #5
		
		ArrayList<String> martList = new ArrayList<String>(Arrays.asList("냉장고", "선풍기", "TV", "노트북", "세탁기", "에어컨", "건조기"));
		
		ArrayList<String> wifeList = new ArrayList<String>(Arrays.asList("냉장고", "세탁기", "에어컨"));
		
		ArrayList<String> myList = new ArrayList<String>(Arrays.asList("노트북", "에어컨", "TV"));
		
		ArrayList<String> same = new ArrayList<String>(Arrays.asList());
		
		ArrayList<String> all = new ArrayList<String>(Arrays.asList());
		
		System.out.println(martList);
		
		for(int i=0; i < wifeList.size(); i++) {
			if(wifeList.indexOf(myList.get(i))!= -1) {
				same.add(myList.get(i));
			} 
		}	System.out.println("서로 사고 싶은 물건 목록 : " + same);
		
		// foreach 문으로 해결
		for(String wi : wifeList) {
			all.add(wi);
		}
		for(String hu : myList) {
			if(all.indexOf(hu) == -1) {
				all.add(hu);
			}
		}
		System.out.println("다 산다고 했을 때 구매목록 : " + all);
		
		// 교집합 개꿀
		same = new ArrayList<String>();
		same.addAll(wifeList);
		same.retainAll(myList);
		System.out.println("간단하게 뽑아낸 교집합 : " + same);
		// 동적 매개변수
		int maxVal = MaxValue(1,4,5,23,15,59,19);
		System.out.println(maxVal);
		
		ArrayList<Integer> intList = new ArrayList<Integer>();
		intList.add(1);
		intList.add(123);
		intList.add(5425);
		intList.add(44);
		intList.add(2);
		intList.add(99);
		intList.add(102);
		
		maxVal = maxValue(intList);
		System.out.println(maxVal);
	}
	
	static int MaxValue(int...num) {
		int maxVal = 0;
		for(int i=0; i < num.length; i++) {
			if(maxVal < num[i]) {
				maxVal = num[i];
			}
		}
		return maxVal;
	}
	
	static int maxValue(ArrayList<Integer> num) {
		int maxVal = 0;
		for(int i=0; i < num.size(); i++) {
			if(maxVal < num.get(i)) {
				maxVal = num.get(i);
			}
		} return maxVal;
		
	}
}

