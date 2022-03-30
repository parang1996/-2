package submit03;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Board {
	
	private int page;
	private String title;
	private String date;
	private String contents;
	
	public Board(int page, String title, String date, String contents) {
		super();
		this.page = page;
		this.title = title;
		this.date = date;
		this.contents = contents;
	}

	
	
	public Board(String title, String contents) {
		super();
		Date date = new Date();
		SimpleDateFormat formatDate = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		String  todayDate = formatDate.format(date);
		BoardDB boardDb = BoardDB.getInstance();
		this.page = boardDb.pageNum();
		this.date = todayDate;
		this.title = title;
		this.contents = contents;
	}
	

	@Override
	public String toString() {
		return page + ". | " + title +" | " + date + "]";
	}

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getContents() {
		return contents;
	}

	public void setContents(String contents) {
		this.contents = contents;
	}
	
}
