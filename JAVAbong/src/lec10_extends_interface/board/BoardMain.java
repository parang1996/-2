package lec10_extends_interface.board;

public class BoardMain {

	public static void main(String[] args) {
		Board board = new Board(1, "첫번째 게시글", "졸립ㄴ다", "어웡워어");
		System.out.println(board.toString());
		
		// 중고거래 게시판
		// + 제품 이미지, 제품 가격
		TradeBoard trade = new TradeBoard(1, "팔아요", "선", "을나뭥ㄻ", "니얼굴.jpg", 10000000);
		System.out.println(trade.toString());
		// 동영상 게시판
		// + 동영상 링크
		VideoBoard video = new VideoBoard(1, "ㅋㅋㅋ", "ㅋㅋㅋ", "ㅋㅋㅋ", "링크");
		System.out.println(video.toString());
		
		
	}

}
