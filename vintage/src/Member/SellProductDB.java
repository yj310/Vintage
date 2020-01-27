package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Vintage.database_connect;

public class SellProductDB extends database_connect {

	/* ������ �޼��� */
	public boolean sell(String title, int count){
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps;
		int id = -1;
		int new_stock;
		int old_stock = 0;		// ������ ���
		boolean result = false;
		
		try
		{
			/* ����̹� ���� */
			Class.forName(driver_con);
			//System.out.println("����̹� ���� ����!");
			
			/* MySQL ���� */
			conn = DriverManager.getConnection(url);
			//System.out.println("������ ���̽� ���� ����!");
			
			/* �����ͺ��̽� ���� */
			stmt = conn.createStatement();
			String useJava_Project = use_schema;
			stmt.executeUpdate(useJava_Project);
			
			/* ��ǰ�� �´� ���̵�, ��� ���� */
			String SQL = "SELECT * FROM product_data WHERE title = '" + title + "'";
			rs = stmt.executeQuery(SQL);
			if(rs.next()) {
				id = Integer.parseInt(rs.getString("id"));
				old_stock = Integer.parseInt(rs.getString("stock"));
			}
			
			
			if(id >= 0)
			{
				result = true;
			}
			else if(id < 0)
			{
				return result;
			}
			
			/* ���� �ִ� ���� �߰��� ��� ���� */
			new_stock = old_stock - count;
			
			
			/* ��ǰ�� ���̵�� ��ǰ���� �̿��Ͽ� ��ǰ�� ��� ���� */
			String MakeNewProduct = "UPDATE product_data SET stock=" + new_stock + " WHERE id=" + id + " and title='" + title + "';";
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
