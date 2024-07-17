package admission;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class AdmissionEntry extends CreateConnection
{
	String qry;
	Connection c;
	Scanner obb=new Scanner(System.in);


	public void NewAdmisionEntry() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		String an,add,at,mm,sn,sd,sds,sm,sdob,smn,sb,fn,fm;
		System.out.println("Enter Admission No:");
		an=obb.nextLine();
		System.out.println("Enter Student Name:");
		sn=obb.nextLine();
		System.out.println("Enter Student DOB: (format : 13-09-2002)");
		sdob=obb.nextLine();
		System.out.println("Enter dept:");
		sd=obb.nextLine();
		System.out.println("Enter Student Address:");
		add=obb.nextLine();
		System.out.println("Enter Student Mobile No:");
		mm=obb.nextLine();
		System.out.println("Enter Student Mail id:");
		sm=obb.nextLine();
		System.out.println("Enter student blood group");
		sb=obb.nextLine();
		System.out.println("Enter Father Name:");
		fn=obb.nextLine();
		System.out.println("Enter Father Mobile No:");
		fm=obb.nextLine();
		qry="insert into admission values (?,?,?,?,?,?,?,?,?,?);";
		ps=c.prepareStatement(qry);
		ps.setString(1,an);
		ps.setString(2,sn);
		ps.setString(3,sdob);
		ps.setString(4,sd);
		ps.setString(5,add);
		ps.setString(6,mm);
		ps.setString(7,sm);
		ps.setString(8,sb);
		ps.setString(9,fn);
		ps.setString(10,fm);
		ps.executeUpdate();
		System.out.println();
		System.out.println("===================================");
		System.out.println("   *** Admission Completed ***   ");
		System.out.println("===================================");
		System.out.println();
	}
	
	public void ListofAdmission() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from admission;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{	
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("Admission No   : "+rs.getString(1));
			System.out.println("Department     : "+rs.getString(4));
			System.out.println("Student Name   : "+rs.getString(2));
			System.out.println("Student DOB    : "+rs.getString(3));
			System.out.println("Stu Mobile No  : "+rs.getString(6));
			System.out.println("Stu Mail Id    : "+rs.getString(7));
			System.out.println("Stu Address    : "+rs.getString(5));
			System.out.println("=====================================================");
			System.out.println();
		}
	}
}
