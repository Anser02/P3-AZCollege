package examinationMarkEntryEnglishDept;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class ArrierEntry2023EngDept extends CreateConnection
{
	Scanner ob=new Scanner(System.in);
	Scanner obb=new Scanner(System.in);
	String sgnn,qry,nnn;
	Connection c;
	int nm;

 
 public void A2023eS1() throws SQLException
 {
	 c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		
		
		 System.out.println();
		 System.out.println("Enter Reg No:");
			sgnn=obb.nextLine();
			qry="select *from englishdeptstu;";
			rs=st.executeQuery(qry);
			while(rs.next())
					{
				if(sgnn.equals(rs.getString(1)))
				{
					System.out.println();
					System.out.println("Reg No         :  "+rs.getString(1));
					System.out.println("Student Name   :  "+rs.getString(2));
					System.out.println();
				}
					}
			qry="select *from e2023s1em;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
		if(sgnn.equals(rs.getString(1)))
		{
			System.out.println();
			System.out.println(rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
			System.out.println();
		}
			}
	 System.out.println();
	 System.out.println();
		System.out.println("Press 1 - update sub1 Mark");
		System.out.println("Press 2 - update sub2 Mark");
		System.out.println("Press 3 - update sub3 Mark");
		System.out.println("Press 4 - update sub4 Mark");
		System.out.println("Press 5 - update sub5 Mark");
		System.out.println("Press 6 - update sub6 Mark");
		nnn=obb.nextLine();
		switch(nnn)
		{
		case "1":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s1em set sub1=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
		case "2":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s1em set sub2=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
		case "3":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s1em set sub3=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
		case "4":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s1em set sub4=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
		case "5":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update t20223s1em set sub5=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
		case "6":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s1em set sub6=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
			default :
				System.out.println("*** Invalid Input ***");
			
		}
 }
 
 public void A2023eS2() throws SQLException
 {
	 c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
	 
		
		 System.out.println();
		 System.out.println("Enter Reg No:");
			sgnn=obb.nextLine();
			qry="select *from englishdeptstu;";
			rs=st.executeQuery(qry);
			while(rs.next())
					{
				if(sgnn.equals(rs.getString(1)))
				{
					System.out.println();
					System.out.println("Reg No         :  "+rs.getString(1));
					System.out.println("Student Name   :  "+rs.getString(2));
					System.out.println();
				}
					}
			qry="select *from e2023s2em;";
			rs=st.executeQuery(qry);
			while(rs.next())
			{
		if(sgnn.equals(rs.getString(1)))
		{
			System.out.println();
			System.out.println(rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
			System.out.println();
		}
			}
	 System.out.println();
	 System.out.println();
		System.out.println("Press 1 - update sub1 Mark");
		System.out.println("Press 2 - update sub2 Mark");
		System.out.println("Press 3 - update sub3 Mark");
		System.out.println("Press 4 - update sub4 Mark");
		System.out.println("Press 5 - update sub5 Mark");
		System.out.println("Press 6 - update sub6 Mark");
		nnn=obb.nextLine();
		switch(nnn)
		{
		case "1":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s2em set sub1=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
		case "2":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s2em set sub2=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
		case "3":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s2em set sub3=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
		case "4":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s2em set sub4=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
		case "5":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s2em set sub5=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
		case "6":
			System.out.println("Enter New Mark :");
			nm=ob.nextInt();
			qry="update e2023s2em set sub6=? where regno=?;";
			ps=c.prepareStatement(qry);
			ps.setInt(1,nm);
			ps.setString(2,sgnn);
			ps.executeUpdate();
			System.out.println();
			System.out.println("=====================================================");
			System.out.println("   ***   New mark updated successfully   ***   ");
			System.out.println("=====================================================");
			break;
			default :
				System.out.println("*** Invalid Input ***");
			
		}
 }



}
