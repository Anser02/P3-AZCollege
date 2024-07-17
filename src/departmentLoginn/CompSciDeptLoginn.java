package departmentLoginn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;
import csdept.Csdept2021batch;
import csdept.Csdept2022batch;
import csdept.Csdept2023batch;
import csdept.InternalMarks2021batch;
import csdept.InternalMarks2022;
import csdept.InternalMarks2023batch;

public class CompSciDeptLoginn extends CreateConnection
{
	Scanner obb=new Scanner(System.in);
	String ii,inpu,qry,ui,pp;
	Connection c;
	
	public void CompSciDeptLogin() throws SQLException
	{
		
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		boolean found=false;
		
		Csdept2023batch cc=new Csdept2023batch();
		Csdept2022batch ccc=new Csdept2022batch();
		Csdept2021batch cccc=new Csdept2021batch();
		System.out.println();
		System.out.println(" *** Department of Computer Science ***");
		System.out.println();
		while(true)
		{
		System.out.println("Enter User Id :");
		ui=obb.nextLine();
		System.out.println("Enter Password :");
		pp=obb.nextLine();
		qry="select *from dept;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(ui.equals(rs.getString(2)) && (pp.equals(rs.getString(3))))
			{
					found=true;
		System.out.println("==================================");
		System.out.println("   *** login successfully ***   ");
		System.out.println("==================================");
			
		while(true)
		{
			System.out.println();
			System.out.println("   ***   Press 'u'  - Update Internal Marks     ***   ");
			System.out.println("   ***   Press 's'  - Show Internal Marks       ***   ");
			System.out.println("   ***   Press 'sl' - Student List              ***   ");
			System.out.println("   ***   Press 'fp' - Student Fees paid status  ***   ");
			System.out.println("   ***   Press 'l'  - LogOut                    ***   ");
		ii=obb.nextLine();
		switch(ii)
		{
		
		case "u":
			System.out.println("   ***   Press '1' - Update 2023 Batch Student Internal marks   ***   ");
			System.out.println("   ***   Press '2' - Update 2022 Batch Student Internal marks   ***   ");
			System.out.println("   ***   Press '3' - Update 2021 Batch Student Internal marks   ***   ");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "1":
				System.out.println("   ***   Press '1' - Update sem1 Internal marks   ***   ");
				System.out.println("   ***   Press '2' - Update sem2 Internal marks   ***   ");
				inpu=obb.nextLine();

				switch(inpu)
				{
				case "1":
					cc.Batch2023S1IMUpdate();
					break;
				case "2":
					cc.Batch2023S2IMUpdate();
					default:
						System.out.println("*** Invalid Input ***");
				}
				
				
				break;
				
			case "2":
				System.out.println("   ***   Press '3' - Update sem3 Internal marks   ***   ");
				System.out.println("   ***   Press '4' - Update sem4 Internal marks   ***   ");
				inpu=obb.nextLine();
				switch(inpu)
				{
				case "1":
					ccc.Batch2022S3IMUpdate();
					break;
				case "2":
					ccc.Batch2022S4IMUpdate();
					default:
						System.out.println("*** Invalid Input ***");
				}

				break;
			case "3":
				System.out.println("   ***   Press '5' - Update sem5 Internal marks   ***   ");
				System.out.println("   ***   Press '6' - Update sem6 Internal marks   ***   ");
				inpu=obb.nextLine();
				switch(inpu)
				{
				case "1":
					cccc.Batch2021S5IMUpdate();
					break;
				case "2":
				cccc.Batch2021S6IMUpdate();
				break;
				default:
						System.out.println("*** Invalid Input ***");
				}

				break;
			}
			
			
			break;
		case "s":
			System.out.println("   ***   Press 1 - 2023 batch student Internal marks   ***   ");
			System.out.println("   ***   Press 2 - 2022 batch student Internal marks   ***   ");
			System.out.println("   ***   Press 3 - 2021 batch student Internal marks   ***   ");
			inpu=obb.nextLine();
			InternalMarks2023batch im=new InternalMarks2023batch();
			switch(inpu)
			{
			case "1":
				System.out.println("2023 Batch");
				System.out.println("   ***   Press 1 - show sem1 Internal marks   ***   ");
				System.out.println("   ***   Press 2 - show sem2 Internal marks   ***   ");
				inpu=obb.nextLine();
				switch(inpu)
				{
				case "1":
					im.batch2023s1IM();
					break;
				case "2":
					im.batch2023s2IM();
					break;
				default:
					System.out.println("*** Invalid Input ***");
				}
			break;
			
			case "2":
				InternalMarks2022 imm=new InternalMarks2022();
				System.out.println("2022 Batch");
				System.out.println("   ***   Press 1 - show sem1 Internal marks   ***   ");
				System.out.println("   ***   Press 2 - show sem2 Internal marks   ***   ");
				System.out.println("   ***   Press 3 - show sem3 Internal marks   ***   ");
				System.out.println("   ***   Press 4 - show sem4 Internal marks   ***   ");
				inpu=obb.nextLine();
				switch(inpu)
				{
				case "1":
					imm.batch2022s1IM();
					break;
				
				case "2":
					imm.batch2022s2IM();
					break;
				case "3":
					imm.batch2022s3IM();
					break;
				
				case "4":
					imm.batch2022s4IM();
					break;
				default:
					System.out.println("*** Invalid Input ***");	
				}
				
				
				break;
			
			case "3":
				InternalMarks2021batch iii=new InternalMarks2021batch();
				System.out.println("2021 Batch");
				System.out.println("   ***   Press 1 - show sem1 Internal marks   ***   ");
				System.out.println("   ***   Press 2 - show sem2 Internal marks   ***   ");
				System.out.println("   ***   Press 3 - show sem3 Internal marks   ***   ");
				System.out.println("   ***   Press 4 - show sem4 Internal marks   ***   ");
				System.out.println("   ***   Press 5 - show sem5 Internal marks   ***   ");
				System.out.println("   ***   Press 6 - show sem6 Internal marks   ***   ");
				inpu=obb.nextLine();
				switch(inpu)
				{
				case "1":
					iii.batch2021s1IM();
					break;
				case "2":
					iii.batch2021s2IM();
					break;
				case "3":
					iii.batch2021s3IM();
					break;
				case "4":
					iii.batch2021s4IM();
					break;
				case "5":
					iii.batch2021s5IM();
					break;
				case "6":
					iii.batch2021s6IM();
					break;
				default:
					System.out.println("*** Invalid Input ***");
				
				}
			}
			
			
			break;
		case "sl":
			System.out.println("   ***   Press '1'  - 2023 Batch Student List     ***   ");
			System.out.println("   ***   Press '2'  - 2022 Batch Student List     ***   ");
			System.out.println("   ***   Press '3'  - 2021 Batch Student List     ***   ");
			inpu=obb.nextLine();
			
			switch(inpu)
			{
			case "1":
				cc.Batch2023Studentlist();
				break;
			case "2":
				ccc.Batch2022Studentlist();
				break;
			case "3":
				cccc.Batch2021Studentlist();
				break;
			default:
				System.out.println("*** Invalid Input ***");
		
			
		}
			break;
		case "fp":
			System.out.println("   ***   Press '1'  - 2023 Batch Student List     ***   ");
			System.out.println("   ***   Press '2'  - 2022 Batch Student List     ***   ");
			System.out.println("   ***   Press '3'  - 2021 Batch Student List     ***   ");
			inpu=obb.nextLine();
			
			switch(inpu)
			{
			case "1":
				cc.Batch2023feespendinglist();
				break;
			case "2":
				ccc.Batch2022feespendinglist();
				break;
			case "3":
				cccc.Batch2021feespendinglist();
				break;
			default:
				System.out.println("*** Invalid Input ***");
					
		}
			
			break;
			
		case "l":
			System.out.println("===================================");
			System.out.println("   *** LogOut Successfull ***   ");
			System.out.println("===================================");
			System.exit(0);
			break;
		default :
			System.out.println("   *** Invalid Input ***   ");
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
