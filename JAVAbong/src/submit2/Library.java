package submit2;

import java.util.ArrayList;

public class Library {
	
	ArrayList<Book> bookList = new ArrayList<Book>();
	
	private Library() {
	}
	
	private static Library instance = new Library();
	
	public static Library getInstance() {
		return instance;
	}
	


	
	
	
	
	
}
