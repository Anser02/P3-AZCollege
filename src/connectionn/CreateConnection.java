package connectionn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CreateConnection {
	public static Connection getConnection() throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3307/ic","root","");
		return con;
	}

}
