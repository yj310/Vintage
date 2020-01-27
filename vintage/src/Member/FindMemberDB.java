package Member;

import java.sql.*;

import Vintage.database_connect;

public class FindMemberDB extends database_connect {
	

	public Member FindMember(String ID, String password) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Member m1 = null;
		
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
			
			/* 유저 찾기 */
			String SQL = "SELECT * FROM member_Data WHERE ID = '" + ID + "' and _password = '" + password + "'";
			rs = stmt.executeQuery(SQL);
			
			
			
			if(rs.next())
			{
				m1 = new Member(rs.getString("_name"), rs.getString("ID"), rs.getString("_password"), rs.getString("CallNumber"));
			}
			
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
		
		
		return m1;
		
	}
}
