package Vintage;

import java.sql.*;

import Member.Member;

public class Get_ProductDB2 extends database_connect {
	
	String title=null;
	String price=null;
	String stock=null;
	String category=null;
	String id=null;

	public void Get_Product3(int id) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String a = null;
		
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
			String SQL = "SELECT * FROM product_data WHERE id = '" + id + "';";
			rs = stmt.executeQuery(SQL);
			if(rs.next()) {
				title = rs.getString("title");
				price = rs.getString("price");
				stock = rs.getString("stock");
				category = rs.getString("category");
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
	
	public String getTitle() {
		return title;
	}
	public String getPrice() {
		return price;
	}
	public String getStock() {
		return stock;
	}
	public String getCategory() {
		return category;
	}
	
	
	
}
