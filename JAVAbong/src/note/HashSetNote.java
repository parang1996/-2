package note;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashSet;
import java.util.TreeSet;

import submit03.DateBoard;

public class HashSetNote {
	public static void main(String[] args) {
		ArrayList<DateBoard> dbList = new ArrayList<DateBoard>();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		TreeSet<DateBoard> lotto = new TreeSet<DateBoard>();
		for (int i = 0; i < 30; i++) {
			int randMonth = (int) (Math.random() * 3) + 1; // 1~3
			int randDay = (int) (Math.random() * 28) + 1; // 1~28
			Calendar cal = Calendar.getInstance();
			cal.set(2022, randMonth - 1, randDay);

			String strDate = sdf.format(cal.getTime());
			dbList.add(new DateBoard(i + "번째 생성된 글", strDate));
		}
		
	
			lotto.addAll(dbList);
		
		
		
		


	}
}
