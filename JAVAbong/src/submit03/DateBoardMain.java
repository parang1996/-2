package submit03;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Pattern;

public class DateBoardMain {

	public static void main(String[] args) {
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");

		for (int i = 0; i < 30; i++) {
			int randMonth = (int) (Math.random() * 3) + 1; // 1~3
			int randDay = (int) (Math.random() * 28) + 1; // 1~28
			Calendar cal = Calendar.getInstance();
			cal.set(2022, randMonth - 1, randDay);

			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard(i + "번째 생성된 글", strDate));
		}
		System.out.println("\n===================날짜 순으로 정렬================================\n");
		
		arrangeList(dbList);
		
		System.out.println("\n===================최근 한달 내 게시글 출력================================\n");
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		
		sdf = new SimpleDateFormat("Mdd");
				
		cal.add(Calendar.DATE, -30);
		int a = Integer.parseInt(sdf.format(cal.getTime()));
		
		for(int i = 0; i < dbList.size(); i++) {
			if(Integer.parseInt(dbList.get(i).getDate().replace(".", "").substring(5, 8)) > a){
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n===================이번 달에 작성된 게시글 출력================================\n");
		
		cal.setTime(new Date());
		sdf = new SimpleDateFormat("M");
		int b = Integer.parseInt(sdf.format(cal.getTime()));
		
		for(int i = 0; i < dbList.size(); i++) {
			if(Integer.parseInt(dbList.get(i).getDate().replace(".", "").substring(5, 6)) == b) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n===================2월에 작성된 게시글 출력================================\n");
		
		cal.setTime(new Date());
		sdf = new SimpleDateFormat("M");
		
		for(int i = 0; i < dbList.size(); i++) {
			if(Integer.parseInt(dbList.get(i).getDate().replace(".", "").substring(5, 6)) == 2) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n============2022년 2월 14일부터 2022년 3월 21일 까지 게시글 출력======================\n");
		
		cal.setTime(new Date());
		sdf = new SimpleDateFormat("Mdd");
		
		for(int i = 0; i < dbList.size(); i++) {
			if(Integer.parseInt(dbList.get(i).getDate().replace(".", "").substring(5, 8)) >= 214
					&& Integer.parseInt(dbList.get(i).getDate().replace(".", "").substring(5, 8)) <= 321) {
				System.out.println(dbList.get(i));
			}
		}
		
		System.out.println("\n============submit04======================\n");
		
		String result = "";
		String qq = "a3b2c4d1a2h4";
		String regex = "[a-z]*";
		
		for(int i = 0; i < qq.length()-1; i++) {
			if(Pattern.matches(regex, qq.substring(i, i+1))){
				for(int j = 0; j < Integer.parseInt(qq.substring(i+1, i+2)); j++) {
					result += qq.substring(i, i+1);
				}
			}else {
				qq.replace(qq.substring(i, i+1), "");
			}
		}System.out.println(result);
		
	}
		

	public static void arrangeList(ArrayList<DateBoard> dbList) {
		for (int i = 0; i < dbList.size(); i++) {
			for (int j = i; j < dbList.size(); j++) {

				if (Integer.parseInt(dbList.get(i).getDate().replace(".", "").substring(5, 8))  
						> Integer.parseInt(dbList.get(j).getDate().replace(".", "").substring(5, 8))) {
					DateBoard temp = dbList.get(i);
					dbList.set(i, dbList.get(j));
					dbList.set(j, temp);
				}
			}
			System.out.println(dbList.get(i));
		}
	}
}
