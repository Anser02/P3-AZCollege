package chemistrydept;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class cheInternalMarks2023batch extends CreateConnection
{
	Scanner ob=new Scanner (System.in);
	Scanner obb=new Scanner (System.in);
	String qry,sr;
	Connection c;

	public void batch2023s1IM() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from c2023s1im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
		}
	}
	
	
	public void batch2023s2IM() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from c2023s2im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
		}
	}

}
