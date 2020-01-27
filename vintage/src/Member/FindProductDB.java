package Member;

import java.sql.*;

import Vintage.database_connect;

public class FindProductDB extends database_connect {
	public int[] FindProduct(String product) {

		boolean result = false;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps;
		int[] product1 = new int[50];
		int count = 0;
		
		try
		{
			/* ����̹� ���� */
			Class.forName(driver_con);
			
			/* MySQL ���� */
			conn = DriverManager.getConnection(url);

			/* �����ͺ��̽� ���� */
			stmt = conn.createStatement();
			String useJava_Project = use_schema;
			stmt.executeUpdate(useJava_Project);
			
			
			/* ��ǰ ã�� */
			for(int i = 0; i < 50; i++) {
				String SQL = "SELECT * FROM product_data WHERE title like '%" + product + "%' and id=" + (i + 1) + ";";
				rs = stmt.executeQuery(SQL);
				if(rs.next()) {
					product1[count] = Integer.parseInt(rs.getString("id"));
					count++;
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
		
		return product1;
		
	}
}
