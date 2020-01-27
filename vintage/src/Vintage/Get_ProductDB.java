package Vintage;

import java.sql.*;

import Member.Member;

public class Get_ProductDB extends database_connect {
	

	public int Get_Product(String category, int num) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int a = 0;
		//PreparedStatement ps;
		
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
			String SQL = "SELECT * FROM product_data WHERE category = '" + category + "' and id = '" + num + "';";
			rs = stmt.executeQuery(SQL);
			if(rs.next()) {
				a = Integer.parseInt(rs.getString("id"));
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
		
		
		return a;
		
	}
}
