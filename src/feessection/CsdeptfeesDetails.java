package feessection;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import connectionn.CreateConnection;

public class CsdeptfeesDetails extends CreateConnection
{
	String qry;
	Connection c;

	public void Csdept2023batchfp() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from csdeptstu where year_of_study='1';";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println();
			System.out.println("Reg no:"+rs.getString(1));
			System.out.println("Name:"+rs.getString(2));
			System.out.println("Sem1 fees paid:"+rs.getString(6));
			System.out.println("Sem2 fees paid:"+rs.getString(7));
		}
	}
	
	public void Csdept2022batchfp() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from csdeptstu where year_of_study='2';";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println();
			System.out.println("Reg no:"+rs.getString(1));
			System.out.println("Name:"+rs.getString(2));
			System.out.println("Sem3 fees paid:"+rs.getString(8));
			System.out.println("Sem4 fees paid:"+rs.getString(9));
		}
	}
	
	public void Csdept2021batchfp() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from csdeptstu where year_of_study='3';";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println();
			System.out.println("Reg no:"+rs.getString(1));
			System.out.println("Name:"+rs.getString(2));
			System.out.println("Sem5 fees paid:"+rs.getString(10));
			System.out.println("Sem6  fees paid:"+rs.getString(11));
		}
	}
	
}
