package admission;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class AdmissionLoginn extends CreateConnection
{
	Scanner obb=new Scanner(System.in);
	Connection c;
	String qry,ui,pp,inpu;
	boolean found=false;

	public void AdmissionLogin() throws SQLException
	{
		
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		PreparedStatement ps;
		
		while(true)
		{
		System.out.println("Enter User Id:");
		ui=obb.nextLine();
		System.out.println("Enter Password:");
		pp=obb.nextLine();
		qry="select *from admission_login;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(ui.equals(rs.getString(1))&&pp.equals(rs.getString(2)))
			{
				found=true;
				System.out.println();
				System.out.println("=================================");
				System.out.println("   *** Login Succssfully ***   ");
				System.out.println("=================================");
						System.out.println();
						while(true)
						{
					System.out.println("   ***   Press 'a'  - New Admission    ***   ");
					System.out.println("   ***   Press 'al' - Admission List   ***   ");
					System.out.println("   ***   Press 'l'  - LogOut           ***   ");	
					inpu=obb.nextLine();
					AdmissionEntry ae=new AdmissionEntry();
					switch(inpu)
					{
					case "a":
						ae.NewAdmisionEntry();
						break;
					case "al":
						ae.ListofAdmission();
						break;
					case "l":
						System.out.println();
						System.out.println("==================================");
						System.out.println("   *** LogOut Successfull ***   ");
						System.out.println("==================================");
						System.exit(0);
						break;
					default :
						System.out.println("   *** Invalid  Input ***   ");
						
					}
						}	
			}
		}

		if(!found)
		{
			System.out.println();
			System.out.println("   *** Invalid login ***   ");
		System.out.println();
		System.out.println(" *** Enter Correct Userid & Password *** ");
		System.out.println();
		}
		}
	}
}
