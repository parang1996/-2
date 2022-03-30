package submit2;

public class Book {
	int bookNumber;
	String bookName;
	boolean rent = false;
	
	public Book() {
		
	}
	
	public int getBookNumber() {
		return bookNumber;
	}

	public void setBookNumber(int bookNumber) {
		this.bookNumber = bookNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public boolean isRent() {
		return rent;
	}

	public void setRent(boolean rent) {
		this.rent = rent;
	}

	public Book(int bookNumber, String bookName) {
		super();
		this.bookNumber = bookNumber;
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		
		if(rent == false) {
			return "[책번호: " + bookNumber + ", 책 제목: " + bookName + ", 대여상태: " + "대여가능"+ "]";
		}else{
			return "[책번호: " + bookNumber + ", 책 제목: " + bookName + ", 대여상태: " + "대여불가능"+ "]";
		}
	}
}
