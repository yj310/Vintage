package Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import Vintage.database_connect;

public class Bought_Product_Data extends database_connect {

public Bought_Product_Data(Bought_Product b1) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int a = 0;
			
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
			
			
			String SQL = "insert into Bought_Product_Data(customer, product, _count, price, receiver, CallNumber, address, how) value('" + b1.getId() + "', '" + b1.getProduct() + "'," + b1.getCount() + ", " + b1.getPrice() + ", '" + b1.getName() + "', '" + b1.getCallNumber() + "', '" + b1.getAddress() + "', '" + b1.getHow() + "');";
			stmt.executeUpdate(SQL);
			
			
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
