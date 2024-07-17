package departmentLoginn;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;
import engdept.Englishdept2021batch;
import engdept.Englishdept2022batch;
import engdept.Englishdept2023batch;
import engdept.eInternalMarks2021batch;
import engdept.eInternalMarks2022batch;
import engdept.eInternalMarks2023batch;

public class EnglishDeptLoginn extends CreateConnection
{

	Scanner obb=new Scanner(System.in);
	String ii,inpu,qry,ui,pp;
	Connection c;
	
	public void EnglishDeptLogin() throws SQLException
	{
		
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		boolean found=false;
		
		Englishdept2023batch ed3=new Englishdept2023batch();
		Englishdept2022batch ed2=new Englishdept2022batch();
		Englishdept2021batch ed1=new Englishdept2021batch();
	
		System.out.println();
		System.out.println(" *** Department of English ***");
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
									ed3.Batch2023S1IMUpdate();
									break;
								case "2":
									ed3.Batch2023S2IMUpdate();
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
									ed2.Batch2022S3IMUpdate();
									break;
								case "2":
								ed2.Batch2022S4IMUpdate();
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
									ed1.Batch2021S5IMUpdate();
									break;
								case "2":
								ed1.Batch2021S6IMUpdate();
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
							eInternalMarks2023batch	e2023=new eInternalMarks2023batch();
							eInternalMarks2022batch	e2022=new eInternalMarks2022batch();	
							eInternalMarks2021batch	e2021=new eInternalMarks2021batch();	

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
									e2023.batch2023s1IM();
									break;
								case "2":
									e2023.batch2023s2IM();
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
									e2022.batch2022s1IM();
									break;
								
								case "2":
									e2022.batch2022s2IM();
									break;
								case "3":
									e2022.batch2022s3IM();
									break;
								
								case "4":
									e2022.batch2022s4IM();
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
								e2021.batch2021s1IM();
									break;
								case "2":
									e2021.batch2021s2IM();
									break;
								case "3":
									e2021.batch2021s3IM();
									break;
								case "4":
									e2021.batch2021s4IM();
									break;
								case "5":
									e2021.batch2021s5IM();
									break;
								case "6":
									e2021.batch2021s6IM();
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
								ed3.Batch2023Studentlist();
								break;
							case "2":
								ed2.Batch2022Studentlist();
								break;
							case "3":
								ed1.Batch2021Studentlist();
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
								ed3.Batch2023feespendinglist();
								break;
							case "2":
								ed2.Batch2022feespendinglist();
								break;
							case "3":
								ed1.Batch2021feespendinglist();
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
