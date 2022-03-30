package lec11_java_api;

import java.util.ArrayList;
import java.util.HashMap;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import kbs.UtillKBS;

public class ApiJson {

	public static void main(String[] args) {

		// Json
		// maven re 어쩌구에서 다운
		// .jar 파일을 프로젝트 안에 넣기
		// 프로젝트 우클릭 - build path - add External Archives ...
		// 혹은 프로젝트 마우스 우클릭 = properties - java bulid path = library add external archives ...
		
		// 우리 프로젝트를 .jar 파일로 만들어서 라이브러리로 사용할 수 있도록 해보자
		// 프로젝트 우클릭 - Export 
		
		System.out.println(UtillKBS.makeUniqueId());
		
		// 우리 프로젝트를 실행할 수 있는 jar 파일(runnable jar file) 로 만들어보자
		// 프로젝트 우클릭 - Export - Runnable for jar file
		
		// JSON 객체 만들기
		JSONObject jsonObject = new JSONObject();
		
		// JSOM 데이터는 이름과 값의 쌍으로 구성이 된다.
		// key 와 value 쌍으로 구성되는 HashMap과 유사
		// hashMap(String, objest) 라고 봐도 무방
		jsonObject.put("name", "아이유");
		jsonObject.put("age", 30);
		
		// JSONArray 배열
		JSONArray jsonArray = new JSONArray();
		jsonArray.add("좋은날");
		jsonArray.add("밤편지");
		jsonArray.add("무릎");
		jsonArray.add("마시멜로우");
		jsonArray.add("몰라요");
		jsonArray.add("이런 엔딩");
		
		jsonObject.put("songList", jsonArray);
		
		System.out.println(jsonObject);
		System.out.println(jsonObject.toString());
		System.out.println(jsonObject.toJSONString());
		
		System.out.println("\n==========================================\n");
		
		//JSON 객체 만드는 두번째 방법
		HashMap<String, Object> hashMap = new HashMap<String, Object>();
		
		hashMap.put("이름", "태연");
		hashMap.put("나이", 33);
		
		ArrayList<String> songList = new ArrayList<String>();
		songList.add("만약에");
		songList.add("INVU");
		songList.add("I");
		songList.add("FINE");
		
		hashMap.put("음악들", songList);
		
		// hashMap을 JSONObject로 만들기
		JSONObject taeyeon = new JSONObject(hashMap);
		System.out.println(hashMap);
		System.out.println(taeyeon.toJSONString());
		
		// JSON 객체 안에 JSON 객체도 당연히 들어간다.
		jsonObject.put("taeyeon", taeyeon);
		System.out.println(jsonObject.toJSONString());
		
		System.out.println("\n==========================================\n");
		/*
		// JSON 파싱 (키를 이용해서 값 꺼내보기)
		JSONParser jsonParser = new JSONParser();
		
		String temp =  ;
		JSONObject iuJson = (JSONObject)jsonParser.parse(temp);
		
		// 아이유 꺼내보기
		// JSONObject 에서 get()을 하면 Object로 리턴을 해서 
		// 변수에 담을 때 형변환을 해주어야 한다.
		System.out.println(iuJson.get("name"));
		String name = (String)iuJson.get("name");
		
		// JSONString 에서 JSONObject로 파싱한 경우 숫자는 long 타입이다.
		long age = (long) iuJson.get("age");
		System.out.println(age);
		
		JSONArray songs = (JSONArray)iuJson.get("songList");
		for(int i = 0; i < songs.size(); i++) {
			System.out.println(songs.get(i));
		}
		
		JSONObject tyJson = (JSONObject)iuJson.get("taeyeon");
		String tyName = (String)tyJson.get("이름");
		System.out.println(tyName);
		
		long tyAge = (long)tyJson.get("나이");
		System.out.println(tyAge);
		
		JSONArray tySongs = (JSONArray)tyJson.get("음악들");
		for(int i = 0; i < tySongs.size(); i++) {
			System.out.println(tySongs.get(i));
		}*/
	}
}
