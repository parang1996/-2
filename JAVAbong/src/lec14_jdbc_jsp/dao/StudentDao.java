package lec14_jdbc_jsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import lec14_jdbc_jsp.model.Student;

public class StudentDao {

	private StudentDao() {
	}

	private static StudentDao instance = new StudentDao();

	public static StudentDao getInstance() {
		if (instance == null) {
			instance = new StudentDao();
		}
		return instance;
	}

	// 목록조회 ( SELECT )
	public ArrayList<Student> stuList(Connection conn) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("select                 		");
		query.append("      stu_id      as id		");
		query.append("    , stu_name    as	name 	");
		query.append("    , stu_score   as score  ");
		query.append("FROM                  	 	");
		query.append("	 students           		");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		ResultSet rs = ps.executeQuery();

		ArrayList<Student> result = new ArrayList<Student>();

		while (rs.next()) {
			Student temp = new Student();

			temp.setStuId(rs.getInt("id"));
			temp.setStuName(rs.getString("name"));
			temp.setStuScore(rs.getInt("score"));

			result.add(temp);
		}
		if (ps != null)
			ps.close();
		if (rs != null)
			rs.close();

		return result;
	}

	// 목록추가 ( insert )
	public int insertStu(Connection conn, Student student) throws SQLException {
		StringBuffer query = new StringBuffer();
		query.append("insert into					");
		query.append("			students			");
		query.append("values(						");
		query.append("	      stu_seq.nextval	");
		query.append("	      , ?					");
		query.append("	      , ?					");
		query.append("	      )					");

		PreparedStatement ps = conn.prepareStatement(query.toString());

		int idx = 1;
		ps.setString(idx++, student.getStuName());
		ps.setInt(idx++, student.getStuScore());
		
		int cnt = ps.executeUpdate();
		
		if(ps!=null)ps.close();
		
		return cnt;
	}
	
	// 삭제 ( delete )							// int 숫자(아이디)로 해도댐
	public int deleteStu(Connection conn, Student student) throws SQLException {
		
		StringBuffer query = new StringBuffer();
		query.append("delete 						");
		query.append("			students			");
		query.append("where 1=1						");
		query.append("	and stu_id = ?			");
		
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int idx = 1;
		ps.setInt(idx++, student.getStuId());
		
		int cnt = ps.executeUpdate();	// 반환 된 행의 갯수를 리턴
		
		if(ps!=null)ps.close();
		
		return cnt;
	}
	
	// 전체삭제
		public int deleteAll(Connection conn) throws SQLException {
		
		StringBuffer query = new StringBuffer();
		query.append("delete 						");
		query.append("			students			");
	
		PreparedStatement ps = conn.prepareStatement(query.toString());
		
		int cnt = ps.executeUpdate();	// 반환 된 행의 갯수를 리턴
		
		if(ps!=null)ps.close();
		
		return cnt;
	}
		
	// 수정 ( update )
		public int updateStu(Connection conn, Student student) throws SQLException{
			
			StringBuffer query = new StringBuffer();
			query.append("update						");
			query.append("			students		");
			query.append("set stu_name = ?			");
			query.append("  , stu_score = ?			");
			query.append("where		1=1				");
			query.append("	and		stu_id = ?		");
			
			PreparedStatement ps = conn.prepareStatement(query.toString());

			int idx = 1;
			ps.setString(idx++, student.getStuName());
			ps.setInt(idx++, student.getStuScore());
			ps.setInt(idx++, student.getStuId());
			
			int cnt = ps.executeUpdate();	// 반환 된 행의 갯수를 리턴
			
			if(ps!=null)ps.close();
			
			return cnt;
		}
}