package examinationMarkEntryEnglishDept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class EngDept2023batchEMEntry extends CreateConnection
{
	Scanner ob=new Scanner (System.in);
	Scanner obb=new Scanner (System.in);
	String qry,sr;
	Connection c;
	int s1,s2,s3,s4,s5,s6;


	public void Engdept2023S1em() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		System.out.println("Enter Student Reg No:");
		sr=obb.nextLine();
		qry="select *from englishdeptstu;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sr.equals(rs.getString(1)))
			{
				System.out.println();
				//System.out.println("Reg No         :  "+rs.getString(1));
				System.out.println("Student Name   :  "+rs.getString(2));
				System.out.println();
			}
		}
		System.out.println("Enter sub1 marks:");
		s1=ob.nextInt();
		System.out.println("Enter sub2 marks:");
		s2=ob.nextInt();
		System.out.println("Enter sub3 marks:");
		s3=ob.nextInt();
		System.out.println("Enter sub4 marks:");
		s4=ob.nextInt();
		System.out.println("Enter sub5 marks:");
		s5=ob.nextInt();
		System.out.println("Enter sub6 marks:");
		s6=ob.nextInt();
		qry="insert into e2023s1em (regno,sub1,sub2,sub3,sub4,sub5,sub6) values (?,?,?,?,?,?,?)";
		ps=c.prepareStatement(qry);
		ps.setString(1, sr);
		ps.setInt(2, s1);
		ps.setInt(3, s2);
		ps.setInt(4, s3);
		ps.setInt(5, s4);
		ps.setInt(6, s5);
		ps.setInt(7, s6);
	ps.executeUpdate();
	System.out.println("=====================================================");
	System.out.println("   ***   External marks updated successfully   ***   ");
	System.out.println("=====================================================");
	System.out.println();
	System.out.println();
	}
	
	public void Engdept2023S2em() throws SQLException
	{	
		c=getConnection();		
	Statement st=c.createStatement();
	ResultSet rs;
	PreparedStatement ps;
		System.out.println("Enter Student Reg No:");
		sr=obb.nextLine();
		qry="select *from englishdeptstu;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sr.equals(rs.getString(1)))
			{
				System.out.println();
				//System.out.println("Reg No         :  "+rs.getString(1));
				System.out.println("Student Name   :  "+rs.getString(2));
				System.out.println();
			}
		}
		System.out.println("Enter sub1 marks:");
		s1=ob.nextInt();
		System.out.println("Enter sub2 marks:");
		s2=ob.nextInt();
		System.out.println("Enter sub3 marks:");
		s3=ob.nextInt();
		System.out.println("Enter sub4 marks:");
		s4=ob.nextInt();
		System.out.println("Enter sub5 marks:");
		s5=ob.nextInt();
		System.out.println("Enter sub6 marks:");
		s6=ob.nextInt();
		qry="insert into e2023s2em (regno,sub1,sub2,sub3,sub4,sub5,sub6)values (?,?,?,?,?,?,?)";
		ps=c.prepareStatement(qry);
		ps.setString(1, sr);
		ps.setInt(2, s1);
		ps.setInt(3, s2);
		ps.setInt(4, s3);
		ps.setInt(5, s4);
		ps.setInt(6, s5);
		ps.setInt(7, s6);
	ps.executeUpdate();
	System.out.println("=====================================================");
	System.out.println("   ***   External marks updated successfully   ***   ");
	System.out.println("=====================================================");
	System.out.println();
	System.out.println();
	}


}
