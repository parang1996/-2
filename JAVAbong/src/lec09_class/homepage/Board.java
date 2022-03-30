package lec09_class.homepage;

public class Board {
	private int no;				// 글번호
	private String title; 		// 글 제목
	private String content;		// 글 내용
	private String author; 		// 글 작성자
	
	public Board() {
	}
	// 글번호를 절대 받지 않겠다 하면 삭제 ㄱ
	public Board(int no, String title, String content, String author) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.author = author;
	}
	
	public Board(String title, String content, String author) {
		super();
		BoardDB boardDB = BoardDB.getInstance();
		this.no = boardDB.sizeBoard();
		this.title = title;
		this.content = content;
		this.author = author;
	}

	@Override
	public String toString() {
		return "[" + no + " | " + title + " | " + author + "]";
	}
	
	public void showBoard() {
		System.out.println("--------------------------");
		System.out.println("제목: " + this.title );
		System.out.println("작성자: " + author);
		System.out.println(content);
		System.out.println("---------------------------");
	}
	
	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
}
