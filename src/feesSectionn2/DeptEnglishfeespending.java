package feesSectionn2;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import feessection.EnglishdeptfeesDetails;

public class DeptEnglishfeespending extends CreateConnection

{
	String ip;
	Scanner obb=new Scanner (System.in);
	
	public void EnglishDeptFeesPending() throws SQLException
	{
		System.out.println("   ***   Press '1'  - 1st Year Student Fees Pending List     ***   ");
		System.out.println("   ***   Press '2'  - 2nd Year Student Fees Pending List     ***   ");
		System.out.println("   ***   Press '3'  - 3rd Year Student Fees Pending List     ***   ");
		ip=obb.nextLine();
		EnglishdeptfeesDetails d3=new EnglishdeptfeesDetails();
		switch(ip)
		{
		case "1":
			d3.Englishdept2021batchfp();
			break;
			
		case "2":
			d3.Englishdept2022batchfp();
			break;
			
		case "3":
			d3.Englishdept2023batchfp();
			break;
			
			default:	
				System.out.println("   *** Invalid Input ***   ");	
		}
	}
	

}
