package Manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Vintage.database_connect;

public class Check_MemberDB extends database_connect {
	public Check_MemberDB() {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int [][] memberData = new int[50][3];
		
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
			
			
			for(int i = 0; i < 50; i++) {
				String MakeNewProduct = "Select * From member_data where _id=" + (i + 1) + ";";
				rs = stmt.executeQuery(MakeNewProduct);
				if(rs.next()) {
						memberData[i][0] = Integer.parseInt(rs.getString("ID"));
						memberData[i][1] = Integer.parseInt(rs.getString("_name"));
						memberData[i][2] = Integer.parseInt(rs.getString("CallNumber"));
						
					
					
				}
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
}
