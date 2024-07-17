package feesSectionn2;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import feessection.CsdeptfeesDetails;

public class DeptCsfeespending extends CreateConnection

{
	String ip;
	Scanner obb=new Scanner (System.in);
	
	public void CsdeptFeesPending() throws SQLException
	{
		System.out.println("   ***   Press '1'  - 1st Year Student Fees Pending List     ***   ");
		System.out.println("   ***   Press '2'  - 2nd Year Student Fees Pending List     ***   ");
		System.out.println("   ***   Press '3'  - 3rd Year Student Fees Pending List     ***   ");
		ip=obb.nextLine();
		CsdeptfeesDetails cs1=new CsdeptfeesDetails();
		
		switch(ip)
		{
		case "1":
			cs1.Csdept2023batchfp();
			break;
		case "2":
			cs1.Csdept2022batchfp();
			break;
		case "3":
			cs1.Csdept2021batchfp();
			break;
			default:	
				System.out.println("   *** Invalid Input ***   ");	
		}
	}
	

}
