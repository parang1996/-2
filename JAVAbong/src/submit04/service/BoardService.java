package submit04.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import submit04.connection.ConnectionPool;
import submit04.dao.BoardDao;
import submit04.model.BoardDTO;
import submit04.model.UserDTO;


public class BoardService {

	private BoardService() {
	}

	private static BoardService instance = new BoardService();
	private BoardDao dao = BoardDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();


	public static BoardService getInstance() {
		if (instance == null) {
			instance = new BoardService();
		}
		return instance;
	}

	// 회원가입
	public int registUser(String id, String pw, String name) {
		Connection conn = cp.getConnection();

		try {
			return dao.registUser(conn, id, pw, name);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}
		return 0;
	}
	
	// 유저 데이터 받아오기
	public UserDTO getUser(String id) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.getUser(conn, id);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return new UserDTO();
	}
	
	// 게시글 저장하기
	public int registBoard(BoardDTO dto) {
		Connection conn = cp.getConnection();

		try {
			return dao.registBoard(conn, dto);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}
		return 0;
	}
	
	// 일치하는 게시글 출력하기
	public BoardDTO showBoard(int nm) {
		Connection conn = cp.getConnection();

		try {
			return dao.BoardList(conn, nm);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}
		return new BoardDTO();
	}
	
	// 게시글 전체 출력
	public ArrayList<BoardDTO> showAll() {
		Connection conn = cp.getConnection();

		try {
			return dao.BoardAll(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (conn != null)
				cp.releaseConnection(conn);
		}
		return new ArrayList<BoardDTO>();
	}
}
