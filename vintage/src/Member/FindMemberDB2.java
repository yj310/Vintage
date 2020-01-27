package Member;

import java.sql.*;

import Vintage.database_connect;

public class FindMemberDB2 extends database_connect {
	String name = null;
	String id = null;
	String tel = null;

	public FindMemberDB2(int ID) {

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
			String SQL = "SELECT * FROM member_Data WHERE _id = '" + ID + "';";
			rs = stmt.executeQuery(SQL);
			
			
			if(rs.next())
			{
				name = rs.getString("_name");
				id = rs.getString("ID");
				tel = rs.getString("CallNumber");
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
		
		
		
	}
	
	public String getName() {
		return name;
	}
	public String getID() {
		return id;
	}
	public String getCallNumber() {
		return tel;
	}
}
