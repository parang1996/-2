package submit04;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import submit04.model.BoardDTO;
import submit04.model.UserDTO;
import submit04.service.BoardService;

public class BoardMain {

	public static void main(String[] args) {
		BoardService service = BoardService.getInstance();
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>> ");

			int select = 0;

			try {
				select = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력해주세요.");
				continue;
			}

			if (select == 1) {
				// 회원가입
				System.out.println("아이디를 입력해주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();
				System.out.println("이름를 입력해주세요.");
				System.out.print(">>> ");
				String name = sc.nextLine();

				UserDTO user = service.getUser(id);

				if (user.getId() != null) {
					System.out.println("중복된 아이디 입니다.");
				} else {
					int resultCnt = service.registUser(id, pw, name);

					if (resultCnt > 0) {
						System.out.println("회원가입 완료");
					} else {
						System.out.println("오류가 발생했습니다.");
					}
				}
				// 로그인
			} else if (select == 2) {
				System.out.println("아이디를 입력해주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();

				UserDTO user = service.getUser(id);

				if (user.getPw().equals(pw)) {
					System.out.println(user.getName() + "님으로 접속했습니다.");
				} else {
					System.out.println("회원 정보가 잘못 되었습니다.");
					continue;
				}
					// 로그인 이후 진행
					while(true) {
						ArrayList<BoardDTO> showBoard = service.showAll();
						for(BoardDTO bd : showBoard) {
							System.out.println(bd);
						}
						
						System.out.println("행동을 입력해주세요.");
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.print(">>> ");
						
						select = 0;
						
						try {
							select = Integer.parseInt(sc.nextLine());
						} catch (Exception e) {
							System.out.println("숫자만 입력해주세요.");
							continue;
						}
						if(select == 1) {
							System.out.print("글 제목을 입력해주세요: ");
							String title = sc.nextLine();
							System.out.print("글 내용을 입력해주세요: ");
							String content = sc.nextLine();
							
							BoardDTO dto = new BoardDTO(user.getId(), title, content);

							int resultCnt = service.registBoard(dto);
						
							
							if(resultCnt > 0) {
								System.out.println("글이 작성되었습니다.");
							}
						}else if(select == 2) {
							System.out.println("글 번호를 입력해주세요: ");
							int input = Integer.parseInt(sc.nextLine());
							
							BoardDTO temp = service.showBoard(input);
							System.out.println("====================================");
							System.out.println("제목: " + temp.getBoard_title());
							System.out.println("작성자: " + temp.getAuthor());
							System.out.println("작성일: " + temp.getBoard_date());
							System.out.println("글내용: " + temp.getBoard_content());
							System.out.println("====================================");		
							
						}else if(select == 3) {
							System.out.println("로그아웃을 하였습니다.");
							break;
						}
					}
				
			}else if(select == 3) {
				System.out.println("종료합니다");
				break;
			}
		}
	}
}
