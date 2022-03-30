package submit03;

import java.util.ArrayList;

public class BoardDB {
	
	private BoardDB() {
		
	}
	
	private static BoardDB instance = new BoardDB();
	
	public static BoardDB getInstance() {
		return instance;
	}
	
	public static ArrayList<Board> boardList = new ArrayList<Board>();
	
	public int pageNum() {
		return boardList.size()+1;
	}
	
}
