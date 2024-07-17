package externalMarkCOE;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;

public class COELoginn extends CreateConnection
{

	String inpu,d1,d2,qry;
	Scanner obb=new Scanner(System.in);
	Connection c;
	
	public void coeLogin() throws SQLException
	{
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		boolean found=false;
		
		System.out.println(" *** Control of Examination Section ***");
		System.out.println();
		while(true)
		{
		System.out.println("Enter User Id:");
		d1=obb.nextLine();
		System.out.println("Enter Password:");
		d2=obb.nextLine();
		qry="select *from coe_login;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(d1.equals(rs.getString(1))&&d2.equals(rs.getString(2)))
			{
				System.out.println("===============================");
				System.out.println("*** Login Successfull ***");
				System.out.println("===============================");
				System.out.println();
		System.out.println();
		System.out.println("press 'u' - to update External exam marks ");
		System.out.println("press 'a' - to update Arrier exam marks ");
		inpu=obb.nextLine();
		switch(inpu)
		{
		case "u":			
			System.out.println("press 'cs' - comp sci dept");
			System.out.println("press 't'  - tamil dept");
			System.out.println("press 'e'  - english dept");
			System.out.println("press 'ch' - chemistry dept");
			inpu=obb.nextLine();
			switch(inpu)
			{
				
			case "cs":					
				ExternalMarksCompSciDept emcs=new ExternalMarksCompSciDept();
				emcs.CompScideptExternalMarks();					
				break;
							
			case "t":
				ExternalMarksTAMILDept emt=new ExternalMarksTAMILDept();
				emt.TamildeptExternalMarks();
				break;
			
			case "e":
				ExternalMarksENGLISHDept eme=new ExternalMarksENGLISHDept();
				eme.EngdeptExternalMarks();					
				break;
				
			case "ch": 
				ExternalMarksCHEMISTRYDept emch=new ExternalMarksCHEMISTRYDept();
				emch.ChedeptExternalMarks();
			break;
			
			default :
				System.out.println("   *** Invalid Input ***   ");
			}
		break;
		
		
		//arrier entry//
		
		case "a":
			System.out.println("*** Arrier Entry ***");
			System.out.println();
			System.out.println("press cs- comp sci dept");
			System.out.println("press t- tamil dept");
			System.out.println("press e- english dept");
			System.out.println("press ch- chemistry dept");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "cs":
				ArrierCSDept a1=new ArrierCSDept();
				a1.ArrierCsdept();					
				break;
				
			case "t":
				ArrierTamilDept a2=new ArrierTamilDept();
				a2.ArrierTamildept();			
				break;
				
			case "e":
				ArrierEnglishDept a3=new ArrierEnglishDept();
				a3.ArrierEngdept();					
				break;
				
			case "ch":
				ArrierCheDept a4=new ArrierCheDept();
				a4.ArrierChedept();
				break;
			default :
				System.out.println("   *** Invalid Input ***   ");										
			}
							
			break;
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
