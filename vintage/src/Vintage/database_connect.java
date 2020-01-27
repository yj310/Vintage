package Vintage;


public class database_connect {

	private String localhost = "3306";
	private String schema = "test";
	private String user = "root";
	private String password = "hi0310";
	
	protected String url = "jdbc:mysql://localhost:"+localhost+"/"+schema+"?serverTimezone=UTC&user="+user+"&password="+password;
	protected String driver_con = "com.mysql.cj.jdbc.Driver";
	protected String use_schema = "use "+schema;
	
}
