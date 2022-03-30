package submit03;

import java.util.Scanner;

public class BoardMain {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);

			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 글 목록 | 2. 글 쓰기 | 3. 종료");
			System.out.print(">>> ");
			int select = Integer.parseInt(sc.nextLine());

			if (select == 2) {
				System.out.println("글 제목을 입력해주세요: ");
				String BoardTitle = sc.nextLine();
				System.out.println("글 내용을 입력해주세요: ");
				String BoardContents = sc.nextLine();
				Board board = new Board(BoardTitle, BoardContents);
				BoardDB.boardList.add(board);
			}else if (select == 1) {
				for (int i = 0; i < BoardDB.boardList.size(); i++) {
					System.out.println(BoardDB.boardList.get(i));
				}
			}else if (select == 3) {
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}
