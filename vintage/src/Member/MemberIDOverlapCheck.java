/* �Ϲ� ȸ�� ���Խ� ���̵� �ߺ�Ȯ�� */
package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Vintage.database_connect;

public class MemberIDOverlapCheck extends database_connect {
	public boolean check(String ID) {

		boolean result = false;
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		PreparedStatement ps;
		
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
			
			
			/* ���� ã�� */
			String SQL = "SELECT * FROM member_Data WHERE ID = '" + ID + "'";
			rs = stmt.executeQuery(SQL);
			
			if(rs.next())
			{
				result = true;
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
		
		return result;
		
	}
}
