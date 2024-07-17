package studentLoginn2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;
import studentLogin.Csdeptst2021batch;
import studentLogin.Csdeptst2022batch;
import studentLogin.Csdeptst2023batch;

public class CompSciDeptStuLoginn extends CreateConnection
{

	Csdeptst2021batch c1=new Csdeptst2021batch();
	Csdeptst2022batch c2=new Csdeptst2022batch();
	Csdeptst2023batch c3=new Csdeptst2023batch();
	String qry,inpu,sgnn,spp;
	Scanner obb=new Scanner(System.in);
	Connection c;
	boolean found=false;
	
	public void CompSciDeptStuLogin2021() throws SQLException
	{
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		
		
		System.out.println(" *** 2021 Batch *** ");	
		while(true)
		{
		System.out.println("Enter reg no:");
		sgnn=obb.nextLine();
		System.out.println("Enter Password:");
		spp=obb.nextLine();
		
		qry="select *from csdeptstu; ";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(4))&&spp.equals(rs.getString(5)))
			{
				found=true;
				System.out.println("====================================");
				System.out.println("   *** Login Succssfully ***   ");
				System.out.println("====================================");
				
				while(true)
				{
			System.out.println("   ***   Press 'r'  - to see the Exam Result     ***   ");
			System.out.println("   ***   Press 'f'  - to see Sem Fees Status     ***   ");
			System.out.println("   ***   Press 'fa' - to see the Sem Exam Fees Amount     ***   ");
			System.out.println("   ***   Press 'l'  - logout     ***   ");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "r":
				System.out.println("   ***   Press 's1'  - Sem1 Result    ***   ");
				System.out.println("   ***   Press 's2'  - Sem2 Result    ***   ");
				System.out.println("   ***   Press 's3'  - Sem3 Result    ***   ");
				System.out.println("   ***   Press 's4'  - Sem4 Result    ***   ");
				System.out.println("   ***   Press 's5'  - Sem5 Result    ***   ");
				System.out.println("   ***   Press 's6'  - Sem6 Result    ***   ");

				inpu=obb.nextLine();
				switch(inpu)
				{
				case "s1":
					c1.Csdept2021s1Result();
					break;
				case "s2":
					c1.Csdept2021s2Result();
					break;
				case "s3":
					c1.Csdept2021s3Result();
					break;
				case "s4":
					c1.Csdept2021s4Result();
					break;
				case "s5":
					c1.Csdept2021s5Result();
					break;
				case "s6":
					c1.Csdept2021s6Result();
					break;
				default :
					System.out.println("   *** Invalid  Input ***   ");
				}
				break;
				
			case "f":
				c1.SemfeesStatus();
				break;
			case "fa":
				System.out.println();
				System.out.println("press 's5' - sem5 fees amount");
				System.out.println("press 's6' - sem6 fees amount");
				inpu=obb.nextLine();
				switch(inpu)
				{
				case "s5":
					c1.Sem5feesAmount();
					break;
				case "s6":
					c1.Sem6feesAmount();
					break;
				default :
					System.out.println("   *** Invalid  Input ***   ");
				}
				break;
			default :
				System.out.println("   *** Invalid  Input ***   ");
			break;	
			case "l":
				System.out.println("===============================");
				System.out.println("*** Logout Successfully ***");
				System.out.println("===============================");
				System.exit(0);
			}
	}
			}
		}

			if(!found)
			{
			System.out.println();
			System.out.println("           *** Invalid login ***         ");
			System.out.println();
			System.out.println(" *** Enter Correct Userid & Password *** ");
			System.out.println();
			}
				
				
	}
	}
	
	
	public void CompSciDeptStuLogin2022() throws SQLException
	{
		
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		
		System.out.println(" *** 2022 Batch *** ");	
		while(true)
		{
		System.out.println("Enter reg no:");
		sgnn=obb.nextLine();
		System.out.println("Enter Password:");
		spp=obb.nextLine();
		
		qry="select *from csdeptstu; ";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(4))&&spp.equals(rs.getString(5)))
			{
				found=true;
				System.out.println("====================================");
				System.out.println("   *** Login Succssfully ***   ");
				System.out.println("====================================");
				
				while(true)
				{
		System.out.println("   ***   Press 'r'  - to see the Exam Result     ***   ");
		System.out.println("   ***   Press 'f'  - to see Sem Fees Status     ***   ");
		System.out.println("   ***   Press 'fa' - to see the Sem Exam Fees Amount     ***   ");
		System.out.println("   ***   Press 'l'  - logout     ***   ");
		inpu=obb.nextLine();
		switch(inpu)
		{
		case "r":
			System.out.println("   ***   Press 's1'  - Sem1 Result    ***   ");
			System.out.println("   ***   Press 's2'  - Sem2 Result    ***   ");
			System.out.println("   ***   Press 's3'  - Sem3 Result    ***   ");
			System.out.println("   ***   Press 's4'  - Sem4 Result    ***   ");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "s1":
				c2.Csdept2022s1Result();
				break;
			case "s2":
				c2.Csdept2022s2Result();
				break;
			case "s3":
				c2.Csdept2022s3Result();
				break;
			case "s4":
				c2.Csdept2022s4Result();
				break;
			default :
				System.out.println("   *** Invalid  Input ***   ");
			}
			break;
		case "f":
			c1.SemfeesStatus();
			break;
		case "fa":
			System.out.println();
			System.out.println("press 's3' - sem3 fees amount");
			System.out.println("press 's4' - sem4 fees amount");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "s3":
				c2.Sem3feesAmount();
				break;
			case "s4":
				c2.Sem4feesAmount();
				break;
			default :
				System.out.println("   *** Invalid  Input ***   ");
			}
			break;
		case "l":
			System.out.println("===============================");
			System.out.println("*** Logout Successfully ***");
			System.out.println("===============================");
			System.exit(0);
		}
	}
			}
		}

			if(!found)
			{
			System.out.println();
			System.out.println("           *** Invalid login ***         ");
			System.out.println();
			System.out.println(" *** Enter Correct Userid & Password *** ");
			System.out.println();
			}
				
				
	}
	}
	
	
	public void CompSciDeptStuLogin2023() throws SQLException
	{
		
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		
		System.out.println(" *** 2023 Batch *** ");	
		while(true)
		{
		System.out.println("Enter reg no:");
		sgnn=obb.nextLine();
		System.out.println("Enter Password:");
		spp=obb.nextLine();
		
		qry="select *from csdeptstu; ";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(sgnn.equals(rs.getString(4))&&spp.equals(rs.getString(5)))
			{
				found=true;
				System.out.println("====================================");
				System.out.println("   *** Login Succssfully ***   ");
				System.out.println("====================================");
				
				while(true)
				{
		System.out.println("   ***   Press 'r'  - to see the Exam Result     ***   ");
		System.out.println("   ***   Press 'f'  - to see Sem Fees Status     ***   ");
		System.out.println("   ***   Press 'fa' - to see the Sem Exam Fees Amount     ***   ");
		System.out.println("   ***   Press 'l'  - logout     ***   ");
		inpu=obb.nextLine();
		switch(inpu)
		{
		case "r":
			System.out.println("   ***   Press 's1'  - Sem1 Result    ***   ");
			System.out.println("   ***   Press 's2'  - Sem2 Result    ***   ");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "s1":
				c3.Csdept2023s1Result();
				break;
			case "s2":
				c3.Csdept2023s2Result();
				break;
			default :
				System.out.println("   *** Invalid  Input ***   ");
			}
			break;
		case "f":
			c3.SemfeesStatus();
			break;
		case "fa":
			System.out.println();
			System.out.println("press 's1' - sem1 fees amount");
			System.out.println("press 's2' - sem2 fees amount");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "s1":
				c3.Sem1feesAmount();
				break;
			case "s2":
				c3.Sem2feesAmount();
				break;
			default :
				System.out.println("   *** Invalid  Input ***   ");
			}
			break;
		case "l":
			System.out.println("===============================");
			System.out.println("*** Logout Successfully ***");
			System.out.println("===============================");
			System.exit(0);
		}
	}
			}
		}

			if(!found)
			{
			System.out.println();
			System.out.println("           *** Invalid login ***         ");
			System.out.println();
			System.out.println(" *** Enter Correct Userid & Password *** ");
			System.out.println();
			}
				
				
	}
	}
	
	}
	
	

