package feesSectionn2;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import feessection.ChemistrydeptfeesDetails;


public class DeptChemistryfeespending extends CreateConnection

{
	String ip;
	Scanner obb=new Scanner (System.in);
	
	public void ChemistryDeptFeesPending() throws SQLException
	{
		System.out.println("   ***   Press '1'  - 1st Year Student Fees Pending List     ***   ");
		System.out.println("   ***   Press '2'  - 2nd Year Student Fees Pending List     ***   ");
		System.out.println("   ***   Press '3'  - 3rd Year Student Fees Pending List     ***   ");
		ip=obb.nextLine();
		ChemistrydeptfeesDetails d4=new ChemistrydeptfeesDetails();
		
		switch(ip)
		{
		case "1":
			d4.Chemistrydept2021batchfp();
			break;
			
		case "2":
			d4.Chemistrydept2022batchfp();
			break;
			
		case "3":
			d4.Chemistrydept2023batchfp();
			break;
			
			default:	
				System.out.println("   *** Invalid Input ***   ");	
		}
	}
	
}
