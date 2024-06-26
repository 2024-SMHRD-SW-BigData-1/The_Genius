package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;







public class MemberDAO {
    public static final String black    = "\u001B[30m" ;
    public static final String red      = "\u001B[31m" ;
    public static final String green    = "\u001B[32m" ;
    public static final String yellow   = "\u001B[33m" ;
    public static final String blue     = "\u001B[34m" ;
    public static final String purple   = "\u001B[35m" ;
    public static final String cyan     = "\u001B[36m" ;
    public static final String white     = "\u001B[37m" ;

    public static final String exit     = "\u001B[0m" ;

	Connection conn = null;
	PreparedStatement psmt = null;
	ResultSet rs= null;
	
	
	public void dbOpen() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String id = "campus_24SW_BIG_p1_2";
			String pw = "smhrd2";
			String url = "jdbc:oracle:thin:@project-db-campus.smhrd.com:1524:xe";
			conn = DriverManager.getConnection(url,id,pw);
		}catch (ClassNotFoundException e) {
			System.out.println("동적 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("권한 확인 실패");
			e.printStackTrace();
		}
	}
	public void dbClose() {
		try {
			if(rs!=null) {
				rs.close();
			}
			if(psmt!=null)
				psmt.close();
			if(conn!=null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	public int joinmember(MemberDTO dto) {
			
			int cnt = 0;
			dbOpen();
			String sql ="insert into member values(?,?,0)";
			try {
				
				psmt = conn.prepareStatement(sql);
				
				psmt.setString(1, dto.getID());
				psmt.setString(2, dto.getPW());
				
				cnt = psmt.executeUpdate();
				
				
			} catch (SQLException e) {
				System.out.println("SQL 실행 에러");
				e.printStackTrace();
			}finally {
				dbClose();
			}
			return cnt;
		}
	public boolean login(MemberDTO dto) {
		dbOpen();
		String sql = "select * from member where id =? and pw =?";
		try {
			psmt= conn.prepareStatement(sql);
			psmt.setString(1, dto.getID());
			psmt.setString(2, dto.getPW());
			rs = psmt.executeQuery();
			if(rs.next()) {
				return true;
			}
			return false;
			
		}catch (SQLException e) {
			System.out.println("SQL 실행 에러");
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return false;
		
	}
	public int delete(MemberDTO dto) {
		int cnt = 0;
		dbOpen();
		String sql ="delete from member where id = ? and pw = ?";
		try {
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, dto.getID());
			psmt.setString(2, dto.getPW());
			cnt = psmt.executeUpdate();
			
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 에러");
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return cnt;
		
	}
	public boolean checkID(MemberDTO idto) {
		dbOpen();
		String sql = "select count(id) from member where id=?";
		try {
			
			psmt = conn.prepareStatement(sql);
			
			psmt.setString(1, idto.getID());
			rs = psmt.executeQuery();

			rs.next(); // 행
			if (rs.getInt(1)/* 열 */ == 1) {
				return true;
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 실행 에러");
			e.printStackTrace();
		}finally {
			dbClose();
		}
		return false;
		
	}
public ArrayList<MemberDTO> rank() {
		
		dbOpen();
		ArrayList<MemberDTO> top = new ArrayList<MemberDTO>();
		String sql ="SELECT id,point FROM (SELECT * FROM member ORDER BY point DESC) WHERE ROWNUM <=5";
		try {
			psmt = conn.prepareStatement(sql);
			rs = psmt.executeQuery();
			while(rs.next()) {
				// get
				String id =rs.getString("id");
				int point =rs.getInt("point");
	
				MemberDTO dto = new MemberDTO(id,point);
				top.add(dto);
			}
			
			
		}  catch (SQLException e) {
			System.out.println("SQL 실행 에러");
			e.printStackTrace();
		}finally {
			dbClose();
		}
		
		return top;
		
	}
}


