/*package submit04;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import submit04.model.BoardVO;
import submit04.model.MemberVO;
import submit04.service.HomepageService;
public class HomepageMain {
	
	public static void main(String[] args) {
		HomepageService service = HomepageService.getInstance();
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("행동을 선택해주세요.");
			System.out.println("1. 회원가입 | 2. 로그인 | 3. 종료");
			System.out.print(">>> ");
			int select = 0;
			try {
				select = Integer.parseInt(sc.nextLine());
			} catch (Exception e) {
				System.out.println("숫자만 입력해 주세요.");
				continue;
			}
			if (select == 1) {
				// 회원가입
				System.out.println("아이디를 입력해 주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해 주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();
				// 아이디 중복 체크
				MemberVO mem = service.getMem(id);
				if (mem.getMemId() != null) {
					System.out.println("중복된 아이디 입니다.");
				} else {
					int resultCnt = service.registMem(id, pw);
					if (resultCnt > 0) {
						System.out.println("회원가입 완료");
					} else {
						System.out.println("오류가 발생했습니다.");
					}
				}
			} else if (select == 2) {
				// 로그인
				System.out.println("아이디를 입력해 주세요.");
				System.out.print(">>> ");
				String id = sc.nextLine();
				System.out.println("비밀번호를 입력해 주세요.");
				System.out.print(">>> ");
				String pw = sc.nextLine();
				MemberVO mem = service.getMem(id);
				if (mem.getMemPw().equals(pw)) {
					System.out.println("로그인 되었습니다.");
					// 로그인 이후
					while (true) {
						ArrayList<BoardVO> showBoard = service.showBoard();
						for(int i = 0; i < showBoard.size(); i++) {
							System.out.println(showBoard.get(i));
						}
						System.out.println("1. 글쓰기 | 2. 글조회 | 3. 로그아웃");
						System.out.print(">>> ");
						select = 0;
						try {
							select = Integer.parseInt(sc.nextLine());
						} catch (Exception e) {
							System.out.println("숫자만 입력해 주세요.");
							continue;
						}
						if (select == 1) {
							// 오늘 날짜 세팅
							SimpleDateFormat sdf = new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
							Date today = new Date();
							String date = sdf.format(today);
							
							// 글쓰기
							System.out.print("글 제목을 입력해주세요: ");
							String title = sc.nextLine();
							System.out.print("글 내용 입력해주세요: ");
							String content = sc.nextLine();
							System.out.println("글이 작성되었습니다.");
							
							BoardVO board = new BoardVO();
							board.setBoardTitle(title);
							board.setBoardContent(content);
							board.setBoardId(id);
							
							service.saveBoard(board);
							
						} else if (select == 2) {
							// 글조회
							System.out.print("글 번호를 입력해주세요: ");
							int boardNo = Integer.parseInt(sc.nextLine());
							
							BoardVO temp = service.getBoard(boardNo);
							System.out.println("====================================");
							System.out.println("제목: " + temp.boardTitle);
							System.out.println("작성자: " + temp.boardId);
							System.out.println("작성일: " + temp.boardDate);
							System.out.println("글내용: " + temp.boardContent);
							System.out.println("====================================");							
							
						} else if (select == 3) {
							// 로그아웃
							System.out.println("로그아웃 하였습니다.");
							break;
						} else {
							System.out.println("잘못 입력하셨습니다.");
						}
					}
				}else {
					System.out.println("일치하는 회원이 없습니다.");
				}
			} else if (select == 3) {
				// 종료
				System.out.println("종료합니다.");
				break;
			}
		}
	}
}

package submit04.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import submit04.model.BoardVO;
import submit04.model.MemberVO;
public class HomepageDao {
	private static HomepageDao instance = new HomepageDao();
	
	private HomepageDao() {}
	
	public static HomepageDao getInstance() {
		if(instance == null) {
			instance = new HomepageDao();
		}
	return instance;
	}
	
	// 회원가입
	public int registMem(Connection conn, String id, String pw) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO				");
		query.append("			member			");
		query.append("VALUES (					");
		query.append("		  ?					");
		query.append("		, ?					");
		query.append("		)					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		MemberVO temp = new MemberVO(id, pw);
		
		int idx = 1;
		ps.setString(idx++, temp.getMemId());
		ps.setString(idx++, temp.getMemPw());
		int cnt = ps.executeUpdate();
		
		if(ps!=null)ps.close();
		
		return cnt;
	}
	// 회원가입할 때 중복 체크
	public MemberVO getMem(Connection conn, String id) throws SQLException {
		StringBuffer query = new StringBuffer();
		
		query.append("SELECT				");
		query.append("		mem_id  		");
		query.append("	  , mem_pw 			");
		query.append("FROM					");
		query.append("		member 			");
		query.append("WHERE 1=1				");
		query.append("AND mem_id = ?		");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ps.setString(1, id);
		
		ResultSet rs = ps.executeQuery();
		
		MemberVO temp = new MemberVO();
		
		while (rs.next()) {
			temp.setMemId(rs.getString("mem_id"));
			temp.setMemPw(rs.getString("mem_pw"));
		}
		
		if(ps!=null)ps.close();
		if(rs!=null)ps.close();
		
		return temp;
	}
	
	// 글 저장 (Insert)
	public int saveBoard(Connection conn, BoardVO board) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("INSERT INTO				");
		query.append("			board			");
		query.append("VALUES (					");
		query.append("		  seq_no.NEXTVAL	");
		query.append("		, ?					");
		query.append("		, ?					");
		query.append("		, ?					");
		query.append("		, ?					");
		query.append("		)					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setString(idx++, board.getBoardTitle());
		ps.setString(idx++, board.getBoardContent());
		ps.setString(idx++, board.getBoardId());
		ps.setString(idx++, board.getBoardDate());
		
		int cnt = ps.executeUpdate();
		
		if(ps!=null)ps.close();
		
		return cnt;
	}
	
	// 글의 번호를 입력해 그 글을 보여주는 것 (select)
	public BoardVO getBoard(Connection conn, int boardNo) throws SQLException{
		StringBuffer query = new StringBuffer();
		query.append("SELECT				");
		query.append("		board_no 		");
		query.append("	  , board_title  	");
		query.append("	  , board_content  	");
		query.append("	  , board_id	  	");
		query.append("	  , board_date  	");
		query.append("FROM					");
		query.append("		board			");
		query.append("WHERE 1=1				");
		query.append("AND board_no = ?		");
		query.append("ORDER BY 				");
		query.append("			1			");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		ps.setInt(1, boardNo);
	
		ResultSet rs = ps.executeQuery();
		
		BoardVO temp = new BoardVO();
		
		while(rs.next()) {
			temp.setBoardNo(rs.getInt("board_no"));
			temp.setBoardTitle(rs.getString("board_title"));
			temp.setBoardId(rs.getString("board_id"));
			temp.setBoardDate(rs.getString("board_date"));
			temp.setBoardContent(rs.getString("board_content"));
		}
		if(ps!=null)ps.close();
		if(rs!=null)rs.close();
		
		return temp;
		
	}
	
	// 글 목록을 보여주는 것 (select)
		public ArrayList<BoardVO> showBoard(Connection conn) throws SQLException{
			StringBuffer query = new StringBuffer();
			query.append("SELECT				");
			query.append("		board_no 		");
			query.append("	  , board_title  	");
			query.append("	  , board_id	  	");
			query.append("	  , board_date  	");
			query.append("FROM					");
			query.append("		board			");
			query.append("ORDER BY 				");
			query.append("			1			");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());		
			ResultSet rs = ps.executeQuery();
			
			ArrayList<BoardVO> result = new ArrayList<BoardVO>();
			
			while(rs.next()) {
				BoardVO temp = new BoardVO();
				
				temp.setBoardNo(rs.getInt("board_no"));
				temp.setBoardTitle(rs.getString("board_title"));
				temp.setBoardId(rs.getString("board_id"));
				temp.setBoardDate(rs.getString("board_date"));
				
				result.add(temp);
			}
			
			if(ps!=null)ps.close();
			if(rs!=null)rs.close();
			
			return result;
			
		}
	
	
		
	}
*/