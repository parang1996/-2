
package lec08_collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class CollectionMap {
	
	static HashMap<String, String> infoMap = new HashMap<>();
		
	

	public static void main(String[] args) {
		// 맵(HashMap) 의 선언
		HashMap<String, String> stuMap = new HashMap<String, String>();
		HashMap<String, Integer> stuMap2 = new HashMap<String, Integer>();
		Map<Integer, String> stuMap3 = new HashMap<Integer, String>();
		
		// .put(key, value) 맵에 데이터 추가
		stuMap.put("첫째", "손오공");
		stuMap.put("둘째", "손오반");
		stuMap.put("셋째", "손오천");
		System.out.println(stuMap);
		
		stuMap2.put("비트코인", 7000);
		stuMap2.put("삼성", 50000);
		System.out.println(stuMap2);
		
		stuMap3.put(0, "민우");
		stuMap3.put(999, "유진");
		System.out.println(stuMap3);
		
		stuMap.put("첫째", "배지터");
		System.out.println(stuMap);
		
		System.out.println("\n===================\n");
		
		// .size()
		System.out.println(stuMap.size());
		
		// .containsKey()
		// 해당 맵에 키가 존재한다면 true 리턴 없으면 false 리턴
		System.out.println(stuMap.containsKey("둘째"));
		
		// .containsValue()
		// 해당 맵에 값이 존재한다면 true 리턴 / 없으면 false
		System.out.println(stuMap.containsValue("손오공"));
		
		// .get(key)
		// key 에 해당하는 value 를 리턴
		System.out.println(stuMap2.get("비트코인"));
		
		// .remove(key)
		// key 에 해당하는 데이터 삭제
		stuMap.remove("첫째");
		System.out.println(stuMap);
		
		System.out.println("\n===================\n");
		
		// Map 순회
		// 1.keySet 이용
		Set<String> keySet = stuMap.keySet();
		
		// set으로 만든 뒤 향상된 for문 이용
		
		for(String key : keySet) {
			System.out.println(stuMap.get(key));
		}
		
		// 2.EntrySet 이용
		Set<Entry<String, String>> entrySet = stuMap.entrySet();
		
		for(Entry<String, String> entry : entrySet) {
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + "=" + value);
		}	
		// foreach + 람다식
			stuMap.forEach((key, value) -> System.out.println(key + value));
		
		// 사용자가 아이디와 비밀번호를 파라미터로 넣었을 때, 인포맵의 key(아이디)와 Value(비밀번호)가 일치하는지
		// 일치하면 true / 다르면 false를 리턴하는 함수를 만들어보세
			
			infoMap.put("a001", "1234a");
			infoMap.put("b001", "1234b");
			infoMap.put("c001", "1234c");
			infoMap.put("d001", "1234d");
			infoMap.put("e001", "1234e");
		
		System.out.println(loginCheck("a001","dd"));
		System.out.println(loginCheck("a001","1234a"));
	}
	
	static boolean loginCheck(String id, String pw) {
//		if(pw.equals(infoMap.get(id))){
//			return true;
//		}
//		return false;
		return pw.equals(infoMap.get(id));
	}
}
