package csdept;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class InternalMarks2021batch extends CreateConnection
{
	Scanner ob=new Scanner (System.in);
	Scanner obb=new Scanner (System.in);
	String qry,sr;
	Connection c;

	public void batch2021s1IM() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from cs2021s1im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
		}
	}
	
	
	public void batch2021s2IM() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from cs2021s2im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
		}
	}
	
	public void batch2021s3IM() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from cs2021s3im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
		}
	}
	public void batch2021s4IM() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from cs2021s4im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
		}
	}
	
	public void batch2021s5IM() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from cs2021s5im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
		}
	}
	
	public void batch2021s6IM() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from cs2021s6im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
		}
	}
}
