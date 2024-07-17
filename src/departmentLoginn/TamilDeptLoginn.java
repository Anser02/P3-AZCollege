package departmentLoginn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;
import tamildept.Tamildept2021batch;
import tamildept.Tamildept2022batch;
import tamildept.Tamildept2023batch;
import tamildept.tInternalMarks2021batch;
import tamildept.tInternalMarks2022batch;
import tamildept.tInternalMarks2023batch;

public class TamilDeptLoginn extends CreateConnection
{
	Scanner obb=new Scanner(System.in);
	String ii,inpu,qry,ui,pp;
	Connection c;
	
	public void Tamildeptoginn() throws SQLException
	{
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		boolean found=false;
		
		Tamildept2023batch td3=new Tamildept2023batch();
		Tamildept2022batch td2=new Tamildept2022batch();
		Tamildept2021batch td1=new Tamildept2021batch();
		while(true)
		{
		System.out.println();
		System.out.println(" *** Department of Tamil ***");
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
									td3.Batch2023S1IMUpdate();
									break;
								case "2":
									td3.Batch2023S2IMUpdate();
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
									td2.Batch2022S3IMUpdate();
									break;
								case "2":
									td2.Batch2022S4IMUpdate();
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
									td1.Batch2021S5IMUpdate();
									break;
								case "2":
								td1.Batch2021S6IMUpdate();
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
							tInternalMarks2023batch	t2023=new tInternalMarks2023batch();
							tInternalMarks2022batch	t2022=new tInternalMarks2022batch();	
							tInternalMarks2021batch	t2021=new tInternalMarks2021batch();	

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
									t2023.batch2023s1IM();
									break;
								case "2":
									t2023.batch2023s2IM();
									break;
								default:
									System.out.println("*** Invalid Input ***");
								}
							break;
							
							case "2":
								System.out.println("2022 Batch");
								System.out.println("   ***   Press 1 - show sem1 Internal marks   ***   ");
								System.out.println("   ***   Press 2 - show sem2 Internal marks   ***   ");
								System.out.println("   ***   Press 3 - show sem3 Internal marks   ***   ");
								System.out.println("   ***   Press 4 - show sem4 Internal marks   ***   ");
								inpu=obb.nextLine();
								switch(inpu)
								{
								case "1":
									t2022.batch2022s1IM();
									break;
								
								case "2":
									t2022.batch2022s2IM();
									break;
								case "3":
									t2022.batch2022s3IM();
									break;
								
								case "4":
									t2022.batch2022s4IM();
									break;
								default:
									System.out.println("*** Invalid Input ***");	
								}
								
								
								break;
							
							case "3":
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
									t2021.batch2021s1IM();
									break;
								case "2":
									t2021.batch2021s2IM();
									break;
								case "3":
									t2021.batch2021s3IM();
									break;
								case "4":
									t2021.batch2021s4IM();
									break;
								case "5":
									t2021.batch2021s5IM();
									break;
								case "6":
									t2021.batch2021s6IM();
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
								td3.Batch2023Studentlist();
								break;
							case "2":
								td2.Batch2022Studentlist();
								break;
							case "3":
								td1.Batch2021Studentlist();
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
								td3.Batch2023feespendinglist();
								break;
							case "2":
								td2.Batch2022feespendinglist();
								break;
							case "3":
								td1.Batch2021feespendinglist();
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
}
