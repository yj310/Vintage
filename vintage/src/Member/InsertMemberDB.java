package Member;

import java.sql.*;

import Vintage.database_connect;

public class InsertMemberDB extends database_connect {
	public InsertMemberDB(Member m1) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps;
		
		try
		{
			/* 드라이버 연결 */
			Class.forName(driver_con);
			
			/* MySQL 접속 */
			conn = DriverManager.getConnection(url);
			
			/* 데이터베이스 접속 */
			stmt = conn.createStatement();
			String useJava_Project = use_schema;
			stmt.executeUpdate(useJava_Project);
			
			/* 유저 생성 */
			String MakeNewMember = "INSERT INTO member_Data(_name, ID, _password, CallNumber) VALUES('" + m1.getName() + "', '" + m1.getId() + "', '" + m1.getPassword() + "', '" + m1.getCallNumber() + "');";
			stmt.executeUpdate(MakeNewMember);
			
			
		}
		catch(ClassNotFoundException cnfe)
		{
			cnfe.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		finally
		{
			if(conn != null) {
				try 
				{
					conn.close();
				}
				catch(SQLException se)
				{
					
				}
			}
			
			if(stmt != null)
			{
				try
				{
					stmt.close();
				}
				catch(SQLException se)
				{
					
				}
			}
			
			if(rs != null)
			{
				try
				{
					rs.close();
				}
				catch(SQLException se)
				{
					
				}
			}
			
		}
		
	}
}
