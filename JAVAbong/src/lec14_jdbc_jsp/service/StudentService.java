package lec14_jdbc_jsp.service;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;

import lec14_jdbc_jsp.dao.StudentDao;
import lec14_jdbc_jsp.jdbc.ConnectionPool;
import lec14_jdbc_jsp.model.Student;

public class StudentService {
	
	private StudentService() {
	}
	
	private static StudentService instance = new StudentService();
	
	public static StudentService getInstance() {
		if(instance == null) {
			instance = new StudentService();
		}
		return instance;
	}
	
	private StudentDao dao = StudentDao.getInstance();
	private ConnectionPool cp = ConnectionPool.getInstance();
	
	// 목록조회 ( select )
	public ArrayList<Student> stuList(){
		Connection conn = cp.getConnection();
		
		try {
			return dao.stuList(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		
		return new ArrayList<Student>();		// null 로 둬도됨 -> null 체크해야함
	}
	
	// 추가 ( insert )
	public int insertStu(Student student) {
		Connection conn = cp.getConnection();
		
		try {
			return dao.insertStu(conn, student);
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}
	
	// 삭제 ( delete )
	public int deleteStu(Student student) {
		Connection conn = cp.getConnection();
		try {
			return dao.deleteStu(conn, student);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}
	
	// 전체 삭제 
	public int deleteAllStu() {
		Connection conn = cp.getConnection();
		try {
			return dao.deleteAll(conn);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}
	
	// 수정
	public int updateStu(Student student) {
		Connection conn = cp.getConnection();
		try {
			return dao.updateStu(conn, student);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(conn != null) cp.releaseConnection(conn);
		}
		return 0;
	}
}