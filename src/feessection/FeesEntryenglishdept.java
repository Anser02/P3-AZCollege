package feessection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class FeesEntryenglishdept extends CreateConnection
{

	Scanner ob=new Scanner (System.in);
	Scanner obb=new Scanner (System.in);
	String qry,sr,rr,ss,bb;
	Connection c;
	
	public void feesentryenglishdept() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
	qry="select *from englishdeptstu;";
	rs=st.executeQuery(qry);
	System.out.println();
	
System.out.println("Enter Reg no :");
rr=obb.nextLine();
while(rs.next())
{
	if(rr.equals(rs.getString(1)))
		System.out.println("Student Name        :"+rs.getString(2));
}

qry="select *from englishdeptstu;";
rs=st.executeQuery(qry);
while(rs.next())
{
	if(rr.equals(rs.getString(1)))
	{
		System.out.println("Sem1 fees paid      :    "+rs.getString(6));
		System.out.println("Sem2 fees paid      :    "+rs.getString(7));
		System.out.println("Sem3 fees paid      :    "+rs.getString(8));
		System.out.println("Sem4 fees paid      :    "+rs.getString(9));
		System.out.println("Sem5 fees paid      :    "+rs.getString(10));
		System.out.println("Sem6 fees paid      :    "+rs.getString(11));
	}
}
System.out.println();
System.out.println("Which sem fees what to pay ?");
ss=obb.nextLine();
switch(ss)
{
case "1":
	qry="update englishdeptstu set sem1_fees_paid='yes' where reg_no=?;";
	ps=c.prepareStatement(qry);
	ps.setString(1,rr);
	ps.executeUpdate();
//System.out.println("updated successfully...");
break;

case "2":
	qry="update englishdeptstu set sem2_fees_paid='yes' where reg_no=?;";
	ps=c.prepareStatement(qry);
	ps.setString(1,rr);
	ps.executeUpdate();
//System.out.println("updated successfully...");
break;
case "3":
	qry="update englishdeptstu set sem3_fees_paid='yes' where reg_no=?;";
	ps=c.prepareStatement(qry);
	ps.setString(1,rr);
	ps.executeUpdate();
//System.out.println("updated successfully...");
break;
case "4":
	qry="update englishdeptstu set sem3_fees_paid='yes' where reg_no=?;";
	ps=c.prepareStatement(qry);
	ps.setString(1,rr);
	ps.executeUpdate();
//System.out.println("updated successfully...");
break;
case "5":
	qry="update englishdeptstu set sem5_fees_paid='yes' where reg_no=?;";
	ps=c.prepareStatement(qry);
	ps.setString(1,rr);
	ps.executeUpdate();
//System.out.println("updated successfully...");
break;
case "6":
	qry="update englishdeptstu set sem6_fees_paid='yes' where reg_no=?;";
	ps=c.prepareStatement(qry);
	ps.setString(1,rr);
	ps.executeUpdate();
//System.out.println("updated successfully...");
default :
System.out.println("   *** Invalid Input ***   ");
}
System.out.println();
System.out.println("AZ College (Autonomous)");
System.out.println(" Thiruvannamalai-606401 ");
System.out.println();
System.out.println("        ===========");
System.out.println("        Fees Recipt");
System.out.println("        ===========");


qry="select *from englishdeptstu;";
rs=st.executeQuery(qry);
while(rs.next())
{
	if(rr.equals(rs.getString(1)))
	{
		System.out.println();
		System.out.println("Reg No         :"+rs.getString(1));
		System.out.println("Student Name   :"+rs.getString(2));
	System.out.println();
	}
}	
qry="select *from efees;";
rs=st.executeQuery(qry);

while(rs.next())
{
	if(ss.equals(rs.getString(3)))
	{
		
			//System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+"  "+rs.getString(4)+"  "+rs.getString(5)+"  "+rs.getString(6)+"  "+rs.getString(7));
			System.out.println("Department    :    "+rs.getString(1));
			System.out.println("Section       :    "+rs.getString(2));
			System.out.println("Sem           :    "+rs.getString(3));
			System.out.println();
			System.out.println("Sem Fess      :    Rs."+rs.getString(4));
			System.out.println("Lab Fess      :    Rs."+rs.getString(5));
			System.out.println("Sem Exam Fees :    Rs."+rs.getString(6));
			System.out.println();
			System.out.println("================================");
			System.out.println("Total Amount  :    Rs."+rs.getString(7));
			System.out.println("================================");
		}	
	}
System.out.println("Cash Received : ");
bb=obb.nextLine();
String qryy;
System.out.println();
System.out.println("=====================================================");
System.out.println("   ***   Bill Generated Successfully   ***   ");
System.out.println("=====================================================");
	
}

}

