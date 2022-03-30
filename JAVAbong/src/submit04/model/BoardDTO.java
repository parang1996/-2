package submit04.model;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import lec09_class.homepage.Board;

public class BoardDTO {
	private int board_nm;
	private String author; 
	private String board_date; 
	private String board_title; 
	private String board_content;
	
	public BoardDTO() {}

	public BoardDTO(String author, String board_title, String board_content) {
		
		Date dateToday = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd HH:mm");
		String today = dateFormat.format(dateToday);
	
		this.author = author;
		this.board_date = today;
		this.board_title = board_title;
		this.board_content = board_content;
	}
	
	


	@Override
	public String toString() {
		return "==================================\n"
				+ "제목: " + board_title  + "\n" +
				"작성자: " + author + "\n" +
				"작성일: " + board_date + "\n" +
				"글내용: " + board_content + "\n" +
				"==================================\n" +
				"[" + this.getBoard_nm()+ ". | " + board_title + " | " + author + " | " + board_date ;
	}

	public int getBoard_nm() {
		return board_nm;
	}

	public void setBoard_nm(int board_nm) {
		this.board_nm = board_nm;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getBoard_date() {
		return board_date;
	}

	public void setBoard_date(String board_date) {
		this.board_date = board_date;
	}

	public String getBoard_title() {
		return board_title;
	}

	public void setBoard_title(String board_title) {
		this.board_title = board_title;
	}

	public String getBoard_content() {
		return board_content;
	}

	public void setBoard_content(String board_content) {
		this.board_content = board_content;
	}
	
	
}
