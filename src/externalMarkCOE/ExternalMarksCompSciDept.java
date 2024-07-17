package externalMarkCOE;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import examinationMarkEntryCompSciDept.Csdept2021batchExternalMarkEntrty;
import examinationMarkEntryCompSciDept.Csdept2022batchExternalMarkEntrty;
import examinationMarkEntryCompSciDept.Csdept2023batchExternalMarkEntrty;
import examinationMarkEntryEnglishDept.EngDept2021batchEMEntry;
import examinationMarkEntryEnglishDept.EngDept2022batchEMEntry;
import examinationMarkEntryEnglishDept.EngDept2023batchEMEntry;

public class ExternalMarksCompSciDept extends CreateConnection

{
	String inpu;
	Scanner obb=new Scanner (System.in);
	
	Csdept2021batchExternalMarkEntrty cs11=new Csdept2021batchExternalMarkEntrty();
	Csdept2022batchExternalMarkEntrty cs21=new Csdept2022batchExternalMarkEntrty();
	Csdept2023batchExternalMarkEntrty cs31=new Csdept2023batchExternalMarkEntrty();



	public void CompScideptExternalMarks() throws SQLException
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
				cs11.Cs2021S5EM();
				break;
			case "s6":
				cs11.Cs2021S6EM();
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
				cs21.Cs2022S3EM();
				break;
			case "s4":
				cs21.Cs2022S4EM();
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
				cs31.Cs2023S1EM();
				break;
			case "s2":
				cs31.Cs2023S2EM();
			}
			break;	
			
		}

		
	}


}
