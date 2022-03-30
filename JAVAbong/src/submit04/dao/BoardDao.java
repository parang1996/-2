package submit04.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import submit04.model.BoardDTO;
import submit04.model.UserDTO;


public class BoardDao {
	
	public BoardDao() {}
	
	private static BoardDao instance = new BoardDao();
	
	public static BoardDao getInstance() {
		if(instance == null) {
			instance = new BoardDao();
		}
		return instance;
	}
	
	// 회원가입
	
	public int registUser(Connection conn, String id, String pw, String name) throws SQLException {
		
		StringBuffer query = new StringBuffer();
		
		query.append("insert into					");
		query.append("			user_info			");
		query.append("values(						");
		query.append("	        ?					");
		query.append("	      , ?					");
		query.append("	      , ?					");
		query.append("	      )					");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		UserDTO temp = new UserDTO(id, pw, name);
		
		int idx = 1;
		ps.setString(idx++, temp.getId());
		ps.setString(idx++, temp.getPw());
		ps.setString(idx++, temp.getName());
		
		
		int cnt = ps.executeUpdate();
		if(ps != null) ps.close();
		
		return cnt;
	}
		
		// 회원가입 중복체크
		public UserDTO getUser(Connection conn, String id) throws SQLException {
			StringBuffer query = new StringBuffer();
			
			query.append("select                 			");
			query.append("      user_id      				");
			query.append("    , user_pw    					");
			query.append("    , user_nm   			   	");
			query.append("FROM           	       	 	");
			query.append("	 user_info           		");
			query.append("WHERE 1=1						   	");
			query.append("			AND user_id = ?	   	");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());
			
			ps.setString(1, id);
			
			ResultSet rs = ps.executeQuery();
			
			UserDTO temp = new UserDTO();

			while (rs.next()) {

				temp.setId(rs.getString("user_id"));
				temp.setPw(rs.getString("user_pw"));
				temp.setName(rs.getString("user_nm"));
		
			}
			if (ps != null)ps.close();
			if (rs != null)rs.close();

			return temp;
		}
		
		// 게시글 작성 저장
		public int registBoard(Connection conn, BoardDTO dto) throws SQLException {
			
			StringBuffer query = new StringBuffer();
			
			
			
			query.append("insert into					");
			query.append("			board				");
			query.append("values(						");
			query.append("	     board_seq.nextVal	");
			query.append("	      , ?					");
			query.append("	      , ?					");
			query.append("	      , ?					");
			query.append("	      , ?					");
			query.append("	      )					");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());
			
			int idx = 1;
			ps.setString(idx++,	dto.getAuthor() );
			ps.setString(idx++, dto.getBoard_date());
			ps.setString(idx++, dto.getBoard_title());
			ps.setString(idx++, dto.getBoard_content());
			
			
			int cnt = ps.executeUpdate();
			if(ps != null) ps.close();
			
			return cnt;
		}
		
		// 번호랑 일치하는 게시글 출력 
		public BoardDTO BoardList(Connection conn, int nm) throws SQLException {
			StringBuffer query = new StringBuffer();
			
			query.append("select                 			");
			query.append("       board_nm    				");
			query.append("      ,author    					");
			query.append("      ,board_date    			");
			query.append("      ,board_title  				");
			query.append("      ,board_content    			");
			query.append("FROM           	       	 	");
			query.append("	 board	       	    		");
			query.append("WHERE 1=1						   	");
			query.append("			and board_nm = ?	;  	");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());
			
			ps.setInt(1, nm);
			
			ResultSet rs = ps.executeQuery();
			
			BoardDTO temp = new BoardDTO();

			while (rs.next()) {
				temp.setBoard_nm(rs.getInt("board_nm"));
				temp.setAuthor(rs.getString("author"));
				temp.setBoard_date(rs.getString("board_date"));
				temp.setBoard_title(rs.getString("board_title"));
				temp.setBoard_content(rs.getString("board_content"));
		
			}
			if (ps != null)ps.close();
			if (rs != null)rs.close();

			return temp;
		}
		
		// 게시글 전체 출력
		public ArrayList<BoardDTO> BoardAll(Connection conn) throws SQLException {
			StringBuffer query = new StringBuffer();
			
			query.append("select                 			");
			query.append("       board_nm    				");
			query.append("      ,author    					");
			query.append("      ,board_date    			");
			query.append("      ,board_title  				");
			query.append("      , board_content    		");
			query.append("FROM           	       	 	");
			query.append("	 board;		   	    		");


			PreparedStatement ps = conn.prepareStatement(query.toString());
			
			ResultSet rs = ps.executeQuery();
			
			ArrayList<BoardDTO> result = new ArrayList<BoardDTO>();

			while (rs.next()) {
				BoardDTO temp = new BoardDTO();
				temp.setBoard_nm(rs.getInt("board_nm"));
				temp.setAuthor(rs.getString("author"));
				temp.setBoard_date(rs.getString("board_date"));
				temp.setBoard_title(rs.getString("board_title"));
				temp.setBoard_content(rs.getString("board_content"));
				
				result.add(temp);
			}
			if (ps != null)ps.close();
			if (rs != null)rs.close();
			
			return result;
		}
	}

