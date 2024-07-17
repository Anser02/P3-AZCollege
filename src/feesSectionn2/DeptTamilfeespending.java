package feesSectionn2;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import feessection.TamildeptfeesDetails;

public class DeptTamilfeespending extends CreateConnection

{
	String ip;
	Scanner obb=new Scanner (System.in);
	
	public void TamilDeptFeesPending() throws SQLException
	{
		System.out.println("   ***   Press '1'  - 1st Year Student Fees Pending List     ***   ");
		System.out.println("   ***   Press '2'  - 2nd Year Student Fees Pending List     ***   ");
		System.out.println("   ***   Press '3'  - 3rd Year Student Fees Pending List     ***   ");
		ip=obb.nextLine();
		TamildeptfeesDetails d2=new TamildeptfeesDetails();
		switch(ip)
		{
		case "1":
			d2.Tamildept2021batchfp();
			break;
			
		case "2":
			d2.Tamildept2022batchfp();
			break;
			
		case "3":
			d2.Tamildept2023batchfp();
			break;
			
			default:	
				System.out.println("   *** Invalid Input ***   ");	
		}
	}
	
}

