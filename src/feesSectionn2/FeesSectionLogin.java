package feesSectionn2;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import connectionn.CreateConnection;
import feessection.FeesEntryChemistrydept;
import feessection.FeesEntrycsdept;
import feessection.FeesEntryenglishdept;
import feessection.FeesEntrytamildept;

public class FeesSectionLogin extends CreateConnection
{

	String inpu,uui,ppp,pup,qry;
	Scanner obb=new Scanner(System.in);
	Connection c;
	
	
	public void FeesSectionLoginn() throws SQLException
	{
		
		c=getConnection();
		Statement st=c.createStatement();
		ResultSet rs;
		boolean found=false;
		
		System.out.println(" *** Fees Section ***");
		System.out.println();
		while(true)
		{
		System.out.println("Enter User Id :");
		uui=obb.nextLine();
		System.out.println("Enter Password:");
		pup=obb.nextLine();
		
		qry="select *from fees_login;";
		rs=st.executeQuery(qry);
		while(rs.next())
		{
			if(uui.equals(rs.getString(1))&&pup.equals(rs.getString(2)))
			{
				System.out.println("=====================================================");
				System.out.println("*** Login Successfull *** ");
				System.out.println("=====================================================");
		
		
		while(true)
		{
		System.out.println("press 'P' - pay the student sem fees");
		System.out.println("Press 'fp'- fees pending list");
		System.out.println("Press 'l' - logout");
		inpu=obb.nextLine();
		FeesEntrycsdept f1=new FeesEntrycsdept();
		FeesEntrytamildept f2=new FeesEntrytamildept();
		FeesEntryenglishdept f3=new FeesEntryenglishdept();
		FeesEntryChemistrydept f4=new FeesEntryChemistrydept();		
		switch(inpu)
		{
		
		case "p":
			System.out.println("press cs- comp sci dept");
			System.out.println("press t- tamil dept");
			System.out.println("press e- english dept");
			System.out.println("press ch- chemistry dept");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "cs":
				f1.feesentrycsdept();
				break;
			case "t":
				f2.feesentrytamildept();
				break;
			case "e":
				f3.feesentryenglishdept();
				break;
			case "ch":
				f4.feesentrychemistrydept();
				break;
			default :
				System.out.println("   *** Invalid Input ***   ");						
			}
											
			break;
			
		case "fp":
			String ip;				
			System.out.println("press cs- comp sci dept");
			System.out.println("press t- tamil dept");
			System.out.println("press e- english dept");
			System.out.println("press ch- chemistry dept");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "cs":
				DeptCsfeespending d1=new DeptCsfeespending();
				d1.CsdeptFeesPending();
				break;
			
			case "t":
				DeptTamilfeespending d2=new DeptTamilfeespending();
				d2.TamilDeptFeesPending();
				break;
				
			case "e":
				DeptEnglishfeespending d3=new DeptEnglishfeespending();
				d3.EnglishDeptFeesPending();
				break;
				
			case "ch":
				DeptChemistryfeespending d4=new DeptChemistryfeespending();
				d4.ChemistryDeptFeesPending();			
				break;
				
			default :
				System.out.println("   *** Invalid Input ***   ");	
				
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
