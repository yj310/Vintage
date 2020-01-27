package Manager;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Vintage.database_connect;

public class Distroy_StockDB extends database_connect {

	/* ������ �޼��� */
	public boolean Distroy(String title){
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps;
		int id = -1;
		boolean result = false;
		
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
			
			/* ��ǰ�� �´� ���̵�, ��� ���� */
			String SQL = "SELECT * FROM product_data WHERE title = '" + title + "'";
			rs = stmt.executeQuery(SQL);
			if(rs.next()) {
				id = Integer.parseInt(rs.getString("id"));
			}
			
			
			if(id >= 0)
			{
				result = true;
			}
			else if(id < 0)
			{
				return result;
			}
			
			/* ��ǰ�� ���̵�� ��ǰ���� �̿��Ͽ� ��ǰ�� ��� �ʱ�ȭ */
			String MakeNewProduct = "UPDATE product_data SET stock=" + 0 + " WHERE id=" + id + " and title='" + title + "';";
			stmt.executeUpdate(MakeNewProduct);
			
			
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
			
			return result;
			
		}
		
		
	}
}
