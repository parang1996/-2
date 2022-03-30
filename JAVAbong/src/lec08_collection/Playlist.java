package lec08_collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Playlist {

	public static void main(String[] args) {
		ArrayList<String> playList = new ArrayList<String>(Arrays.asList("INVU: 태연", "사랑은 늘 도망가: 임영웅", "취중고백: 멜로망스", "언제나 사랑해: 케이시"
				, "듣고 싶을까: MSG워너비", "ELEVEN: IVE", "Step Back: GOT the beat", "abcdefu: GAYLE", "회전목마: sokodomo", "너, 너: 휘인"
				, "SMILEY: YENA", "호랑수월가: 탑현", "리무진: 비오", "RUN2U: STAYC", "눈이 오잖아: 이무진", "Counting Stars: 비오", "신호등: 이무진"
				, "어제처럼: 폴킴", "잊었니: 임영웅", "잊을 수 있을까: 노을", "HERO: 임영웅", "Can't Control Myself: 태연", "Next Level: aespa"
				, "strawberry moon: 아이유", "겨울잠: 아이유", "끝사랑: 임영웅", "드라마: 아이유", "Bk Love: 임영웅", "만남은 쉽고 이별은 어려워: 베이식"
				, "Weekend: 태연", "Savage: aespa", "Butter: 방탄소년단", "Dynamite: 방탄소년단", "OHAYO MY NIGHT: 디핵", "사랑인가 봐: 멜로망스"
				, "라일락: 아이유", "Celebrity: 아이유", "낙하: 악동뮤지션", "Blueming: 아이유", "롤린: 브레이브걸스", "고백: 멜로망스", "그런 밤: 태연"));
		
		showList(playList);
		
		System.out.println("\n============= 정렬 =============\n");
		
		Collections.sort(playList);
		showList(playList);
		
		System.out.println("\n============= 검색 =============\n");
		
		ArrayList<String> searchList = new ArrayList<String>();
		
		for(int i=0; i < playList.size(); i++) {
			if(playList.get(i).indexOf("아이유") != -1) {
				searchList.add(playList.get(i));
			}
		}
			showList(searchList);
	}
	// 파라미터로 입력받은 문자열 리스트를 페이징 처리해서 출력해주는 함수
	static void showList(ArrayList<String> inputList) {
		int totalCountGul = inputList.size();		// ex)게시판 글 336개
		int showCountInOnePage = 10;       		// 한 페이지에 15개 게시글
		System.out.println("사이즈 : " + inputList.size());
		
		// 총 페이지 수 42 / 10 = 4.2 을 올림처리
		// int countPage = (int)Math.ceil((double) totalCountGul / showCountInOnePage); Math.ceil 사용	
		double temp = (double) totalCountGul / showCountInOnePage;
		int countPage = 0;
		if(temp > totalCountGul/showCountInOnePage) {
			countPage = (totalCountGul/showCountInOnePage) +1;
		}else {
			countPage = totalCountGul/showCountInOnePage;
		}
		// 마지막 페이지 수 42 % 10 = 2
		int countLastPageGul = totalCountGul % showCountInOnePage;
		
		// 페이징
		// playList의 인덱스 0 ~ 41
		// i가 0일때 페이지가 1, 인덱스 0~9
		// i가 1일때 페이지가 2, 인덱스 10,19
		// i가 2일때 페이지가 3, 인덱스 20,29 
		for(int i=0; i < countPage; i++) {
			System.out.println("현재 페이지 : " + (i+1));
		// i가 4일때(페이지5) 인덱스 0~49 이므로 범위 오바
	    // 40~41 < 42
		int start = i * showCountInOnePage;
		int end = (i * showCountInOnePage) + showCountInOnePage;
		if(i == countPage-1) {
			// 42
			//end = (i * showCountInOnePage) + countLastPageGul;
			end = inputList.size();
		}
		for(int j = start; j < end; j++) {
			System.out.println((j+1) + ", " + inputList.get(j));
			}
		System.out.println("====================\n");
	}
	}
	}
