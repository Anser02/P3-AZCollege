package externalMarkCOE;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import examinationMarkEntryChemistryDept.CheDept2021batchEMEntry;
import examinationMarkEntryChemistryDept.CheDept2022batchEMEntry;
import examinationMarkEntryChemistryDept.CheDept2023batchEMEntry;
import examinationMarkEntryEnglishDept.EngDept2021batchEMEntry;
import examinationMarkEntryEnglishDept.EngDept2022batchEMEntry;
import examinationMarkEntryEnglishDept.EngDept2023batchEMEntry;

public class ExternalMarksCHEMISTRYDept extends CreateConnection

{
	String inpu;
	Scanner obb=new Scanner (System.in);
	CheDept2021batchEMEntry ch11=new CheDept2021batchEMEntry();
	CheDept2022batchEMEntry ch21=new CheDept2022batchEMEntry();
	CheDept2023batchEMEntry ch31=new CheDept2023batchEMEntry();

	public void ChedeptExternalMarks() throws SQLException
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
				ch11.Chedept2021S5em();
				break;
			case "s6":
				ch11.chedept2021S6em();
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
				ch21.chedept2022S3em();
				break;
			case "s4":
				ch21.Engdept2022S4em();
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
				ch31.chedept2023S1em();
				break;
			case "s2":
				ch31.chedept2023S2em();
			}
			break;	
			
		}

		
	}

}
