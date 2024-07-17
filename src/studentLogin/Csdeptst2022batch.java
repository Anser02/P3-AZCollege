package studentLogin;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class Csdeptst2022batch extends CreateConnection
{

	Connection c;
	Scanner obb=new Scanner(System.in);
	String qry,sgnn;
	
	
	
	public void Csdept2022s4Result() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		System.out.println("Enter reg no:");
		sgnn=obb.nextLine();
		qry="select *from csdeptstu;";
		rs=st.executeQuery(qry);
		while(rs.next())
				{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println("Reg No         :  "+rs.getString(1));
				System.out.println("Student Name   :  "+rs.getString(2));
			}
				}
		qry="select *from cs2022s4im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println(" *** Internal Marks ***");
				System.out.println();
				System.out.println("==========================================");

				System.out.println("Sub1       :    "+rs.getString(2)+"/25");
				System.out.println("Sub2       :    "+rs.getString(3)+"/25");
				System.out.println("Sub3       :    "+rs.getString(4)+"/25");
				System.out.println("Sub4       :    "+rs.getString(5)+"/25");
				System.out.println("Sub5       :    "+rs.getString(6)+"/25");
				System.out.println("Sub6       :    "+rs.getString(7)+"/25");
				System.out.println("==========================================");

				System.out.println();
			}										
		}
		qry="select *from cs2022s4em;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println(" *** External Exam Marks ***");
				System.out.println();
				System.out.println("==========================================");

				System.out.println("Sub1       :    "+rs.getString(2)+"/75");
				System.out.println("Sub2       :    "+rs.getString(3)+"/75");
				System.out.println("Sub3       :    "+rs.getString(4)+"/75");
				System.out.println("Sub4       :    "+rs.getString(5)+"/75");
				System.out.println("Sub5       :    "+rs.getString(6)+"/75");
				System.out.println("Sub6       :    "+rs.getString(7)+"/75");
				System.out.println();
				//System.out.println("Total      :    "+rs.getString(8)+"/450");
				System.out.println("Result     :    "+rs.getString(9));
				System.out.println("==========================================");

				System.out.println();
			}
		}
	}
	
	public void Csdept2022s3Result() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		System.out.println("Enter reg no:");
		sgnn=obb.nextLine();
		qry="select *from csdeptstu;";
		rs=st.executeQuery(qry);
		while(rs.next())
				{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println("Reg No         :  "+rs.getString(1));
				System.out.println("Student Name   :  "+rs.getString(2));
			}
				}
		qry="select *from cs2022s3im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println(" *** Internal Marks ***");
				System.out.println();
				System.out.println("==========================================");

				System.out.println("Sub1       :    "+rs.getString(2)+"/25");
				System.out.println("Sub2       :    "+rs.getString(3)+"/25");
				System.out.println("Sub3       :    "+rs.getString(4)+"/25");
				System.out.println("Sub4       :    "+rs.getString(5)+"/25");
				System.out.println("Sub5       :    "+rs.getString(6)+"/25");
				System.out.println("Sub6       :    "+rs.getString(7)+"/25");
				System.out.println("==========================================");

				System.out.println();
			}
		}
		qry="select *from cs2022s3em;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println(" *** External Exam Marks ***");
				System.out.println();
				System.out.println("==========================================");

				System.out.println("Sub1       :    "+rs.getString(2)+"/75");
				System.out.println("Sub2       :    "+rs.getString(3)+"/75");
				System.out.println("Sub3       :    "+rs.getString(4)+"/75");
				System.out.println("Sub4       :    "+rs.getString(5)+"/75");
				System.out.println("Sub5       :    "+rs.getString(6)+"/75");
				System.out.println("Sub6       :    "+rs.getString(7)+"/75");
				System.out.println();
				//System.out.println("Total      :    "+rs.getString(8)+"/450");
				System.out.println("Result     :    "+rs.getString(9));
				System.out.println("==========================================");

				System.out.println();
			}	
		}
	}
	
	public void Csdept2022s2Result() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		System.out.println("Enter reg no:");
		sgnn=obb.nextLine();
		qry="select *from csdeptstu;";
		rs=st.executeQuery(qry);
		while(rs.next())
				{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println("Reg No         :  "+rs.getString(1));
				System.out.println("Student Name   :  "+rs.getString(2));
			}
				}
		qry="select *from cs2022s2im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println(" *** Internal Marks ***");
				System.out.println();
				System.out.println("==========================================");

				System.out.println("Sub1       :    "+rs.getString(2)+"/25");
				System.out.println("Sub2       :    "+rs.getString(3)+"/25");
				System.out.println("Sub3       :    "+rs.getString(4)+"/25");
				System.out.println("Sub4       :    "+rs.getString(5)+"/25");
				System.out.println("Sub5       :    "+rs.getString(6)+"/25");
				System.out.println("Sub6       :    "+rs.getString(7)+"/25");
				System.out.println("==========================================");

				System.out.println();
			}	
		}
	qry="select *from cs2022s2em;";
	rs=st.executeQuery(qry);
	while(rs.next())
	{
		if(sgnn.equals(rs.getString(1)))
		{
			System.out.println(" *** External Exam Marks ***");
			System.out.println();
			System.out.println("==========================================");

			System.out.println("Sub1       :    "+rs.getString(2)+"/75");
			System.out.println("Sub2       :    "+rs.getString(3)+"/75");
			System.out.println("Sub3       :    "+rs.getString(4)+"/75");
			System.out.println("Sub4       :    "+rs.getString(5)+"/75");
			System.out.println("Sub5       :    "+rs.getString(6)+"/75");
			System.out.println("Sub6       :    "+rs.getString(7)+"/75");
			System.out.println();
			//System.out.println("Total      :    "+rs.getString(8)+"/450");
			System.out.println("Result     :    "+rs.getString(9));
			System.out.println("==========================================");

			System.out.println();
		}	
	}
	}
	
	public void Csdept2022s1Result() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		System.out.println("Enter reg no:");
		sgnn=obb.nextLine();
		qry="select *from csdeptstu;";
		rs=st.executeQuery(qry);
		while(rs.next())
				{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println("Reg No         :  "+rs.getString(1));
				System.out.println("Student Name   :  "+rs.getString(2));
			}
				}
		qry="select *from cs2022s1im;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println();
				System.out.println(" *** Internal Marks ***");
				System.out.println();
				System.out.println("==========================================");

				System.out.println("Sub1       :    "+rs.getString(2)+"/25");
				System.out.println("Sub2       :    "+rs.getString(3)+"/25");
				System.out.println("Sub3       :    "+rs.getString(4)+"/25");
				System.out.println("Sub4       :    "+rs.getString(5)+"/25");
				System.out.println("Sub5       :    "+rs.getString(6)+"/25");
				System.out.println("Sub6       :    "+rs.getString(7)+"/25");
				System.out.println("==========================================");

				System.out.println();
			}
			}
		qry="select *from cs2022s1em;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println("*** External Exam Marks ***");
				System.out.println();
				System.out.println("==========================================");

				System.out.println("Sub1       :    "+rs.getString(2)+"/75");
				System.out.println("Sub2       :    "+rs.getString(3)+"/75");
				System.out.println("Sub3       :    "+rs.getString(4)+"/75");
				System.out.println("Sub4       :    "+rs.getString(5)+"/75");
				System.out.println("Sub5       :    "+rs.getString(6)+"/75");
				System.out.println("Sub6       :    "+rs.getString(7)+"/75");
				System.out.println();
				//System.out.println("Total      :    "+rs.getString(8)+"/450");
				System.out.println("Result     :    "+rs.getString(9));
				System.out.println("==========================================");

				System.out.println();
			}
		}
	}
	
	
	
	public void Sem3feesAmount() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from csfees where sem='3';";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println("==========================================");

			System.out.println("Department    :    "+rs.getString(1));
			System.out.println("Section       :    "+rs.getString(2));
			System.out.println("Sem           :    "+rs.getString(3));
			System.out.println("Sem Fess      :    Rs."+rs.getString(4));
			System.out.println("Lab Fess      :    Rs."+rs.getString(5));
			System.out.println("Sem Exam Fees :    Rs."+rs.getString(6));
			System.out.println();
			System.out.println("Total Amount  :    Rs."+rs.getString(7));
			System.out.println("==========================================");

		}
		
	}
	
	public void Sem4feesAmount() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		qry="select *from csfees where sem='4';";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			System.out.println("==========================================");
			System.out.println("Department    :    "+rs.getString(1));
			System.out.println("Section       :    "+rs.getString(2));
			System.out.println("Sem           :    "+rs.getString(3));
			System.out.println("Sem Fess      :    Rs."+rs.getString(4));
			System.out.println("Lab Fess      :    Rs."+rs.getString(5));
			System.out.println("Sem Exam Fees :    Rs."+rs.getString(6));
			System.out.println();
			System.out.println("Total Amount  :    Rs."+rs.getString(7));
			System.out.println("==========================================");

		}
		
	}
	
	
	
	
	
	
	
	public void SemfeesStatus() throws SQLException
	{
		c=getConnection();		
		Statement st=c.createStatement();
		ResultSet rs;
		System.out.println("Enter reg no:");
		sgnn=obb.nextLine();
		qry="select *from csdeptstu;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(1)))
			{
				System.out.println();
			System.out.println("==========================================");
			System.out.println("Reg No          :    "+rs.getString(1));
			System.out.println("Name            :    "+rs.getString(2));
			System.out.println("==========================================");
			//System.out.println("Sem1 fees Paid  :    "+rs.getString(6));
			//System.out.println("Sem2 fees Paid  :    "+rs.getString(7));
			System.out.println("Sem3 fees Paid  :    "+rs.getString(8));
			System.out.println("Sem4 fees Paid  :    "+rs.getString(9));
			//System.out.println("Sem5 fees Paid  :    "+rs.getString(10));
			//System.out.println("Sem6 fees Paid  :    "+rs.getString(11));
			System.out.println("==========================================");
			}
		}
	}
	
}

