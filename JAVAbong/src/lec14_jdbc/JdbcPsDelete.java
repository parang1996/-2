package lec14_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcPsDelete {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		// 1. 드라이버 로딩 ( 딱 한번만 로딩해주면 된다 ) ( 한 메인안에서 한정)
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("드라이버 등록 성공");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("드라이버 등록 실패");
			System.exit(0); // 프로그램 종료
		}

		try {
			String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe";
			String id = "jdbc";
			String pw = "jdbc";

			conn = DriverManager.getConnection(url, id, pw);
			
			StringBuffer query = new StringBuffer();
			query.append("delete 						");
			query.append("			students			");
			query.append("where 1=1						");
			query.append("	and stu_id in (?, ?)		");
			
			ps = conn.prepareStatement(query.toString());
			
				int idx = 1;
				ps.setInt(idx++, 4);
				ps.setInt(idx++, 5);
			
				int cnt = ps.executeUpdate();
				
			if (cnt > 0) {
				System.out.println(cnt + "행이 삽입되었습니다.");
				
				// 연달아 쿼리문 실행하기 (비추천)
				ps.close();
				ps = conn.prepareStatement("select * from students");
				// prepareStatement 의 setString은 인덱스가 1부터 시작
				
				
				rs = ps.executeQuery();
				
				while(rs.next()) {
					int stuId = rs.getInt("stu_id");
					String stuName = rs.getString("stu_name");
					int stuScore = rs.getInt("stu_score");
					
					System.out.println("아이디: " + stuId + ", 이름: " + stuName + ", 점수: " + stuScore);		
				
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(rs != null) try {rs.close();}catch(SQLException e) {}
			if(ps != null) try {ps.close();}catch(SQLException e) {}
			if(conn != null) try {conn.close();}catch(SQLException e) {}
		}
	}

}
