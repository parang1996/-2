package lec14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelect {

	public static void main(String[] args) {
		// 변수 정의
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		// 1. 드라이버 로딩 ( 딱 한번만 로딩해주면 된다 ) ( 한 메인안에서 한정) 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 등록 실패");
			System.exit(0);		// 프로그램 종료
		}
		
		try {
			// 2. 데이터베이스 서버와 연결(Connection)한다.
			// ip주소 (ifconfig 주소(찐), localhost = 127.0.0.1)
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "jdbc";
			String pw = "jdbc";
			conn = DriverManager.getConnection(url, id, pw);
			
			// 3. 쿼리문 객체를 생성한다.
			stmt = conn.createStatement();
			
			// 4. 쿼리문 실행과 동시에 결과를 객체에 담는다.
			
			StringBuffer query = new StringBuffer();
			query.append("select                 ");
			query.append("      stu_id      as id	");
			query.append("    , stu_name    as	name ");
			query.append("    , stu_score   as score  ");
			query.append("FROM                   ");
			query.append("	 students           ");
			rs = stmt.executeQuery(query.toString());
			// 5. 실행결과(rs) 처리
			// select 결과
			while(rs.next()) { // 다음 행이 있으면 true 를 반환하며, 커서가 한칸 내려간다.
				int stuId = rs.getInt("id");
				String stuName = rs.getString("name");
				int stuScore = rs.getInt("score");
				System.out.println("id: " + stuId + ", name: " + stuName + ", phone: " + stuScore);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			// 6. 자원정리(close)
			if(rs != null) try {rs.close();}catch(SQLException e) {}
			if(stmt != null) try {stmt.close();}catch(SQLException e) {}
			// Connection 객체를 나중에 닫고, 꼭 닫아야 한다.
			if(conn != null) try {conn.close();}catch(SQLException e) {}
		}
		
	}

}
