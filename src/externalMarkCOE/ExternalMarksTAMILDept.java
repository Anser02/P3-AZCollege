package externalMarkCOE;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import examinationMarkEntryTamilDept.TamilDept2021batchEMEntry;
import examinationMarkEntryTamilDept.TamilDept2022batchEMEntry;
import examinationMarkEntryTamilDept.TamilDept2023batchEMEntry;

public class ExternalMarksTAMILDept extends CreateConnection

{
	String inpu;
	Scanner obb=new Scanner (System.in);
	TamilDept2021batchEMEntry t11=new TamilDept2021batchEMEntry();
	TamilDept2022batchEMEntry t21=new TamilDept2022batchEMEntry();
	TamilDept2023batchEMEntry t31=new TamilDept2023batchEMEntry();


	public void TamildeptExternalMarks() throws SQLException
	{

		System.out.println("   ***   Press 1 - Update 2021 Batch Student External marks   ***   ");
		System.out.println("   ***   Press 2 - Update 2022 Batch Student External marks   ***   ");
		System.out.println("   ***   Press 3 - Update 2023 Batch Student External marks   ***   ");
		inpu=obb.nextLine();
		switch(inpu)
		{
		case "1":
			System.out.println(" *** 2021 Batch Student External mark ***");
			System.out.println();
			System.out.println("   ***   Press s5 - Update sem5 External marks   ***   ");
			System.out.println("   ***   Press s6 - Update sem6 External marks   ***   ");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "s5":
				t11.Tamildept2021S5em();
				break;
			case "s6":
				t11.Tamildept2021S6em();
			}
			break;
			
		case "2":
			System.out.println(" *** 2022 Batch Student External mark ***");
			System.out.println();
			System.out.println("   ***   Press s3 - Update sem3 External marks   ***   ");
			System.out.println("   ***   Press s4 - Update sem4 External marks   ***   ");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "s3":
				t21.Tamildept2022S3em();
				break;
			case "s4":
				t21.Tamildept2022S4em();
			}
			break;	
			
		case "3":
			System.out.println(" *** 2023 Batch Student External mark ***");
			System.out.println();
			System.out.println("   ***   Press s1 - Update sem1 External marks   ***   ");
			System.out.println("   ***   Press s2 - Update sem2 External marks   ***   ");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "s1":
				t31.Tamildept2023S1em();
				break;
			case "s2":
				t31.Tamildept2023S2em();
			}
			break;	
			
		}

		
	}
	
}
