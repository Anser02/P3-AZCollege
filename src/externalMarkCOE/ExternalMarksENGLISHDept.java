package externalMarkCOE;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import examinationMarkEntryEnglishDept.EngDept2021batchEMEntry;
import examinationMarkEntryEnglishDept.EngDept2022batchEMEntry;
import examinationMarkEntryEnglishDept.EngDept2023batchEMEntry;
import examinationMarkEntryTamilDept.TamilDept2021batchEMEntry;
import examinationMarkEntryTamilDept.TamilDept2022batchEMEntry;
import examinationMarkEntryTamilDept.TamilDept2023batchEMEntry;

public class ExternalMarksENGLISHDept extends CreateConnection

{
	String inpu;
	Scanner obb=new Scanner (System.in);
	
	EngDept2021batchEMEntry e11=new EngDept2021batchEMEntry();
	EngDept2022batchEMEntry e21=new EngDept2022batchEMEntry();
	EngDept2023batchEMEntry e31=new EngDept2023batchEMEntry();


	public void EngdeptExternalMarks() throws SQLException
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
				e11.Engdept2021S5em();
				break;
			case "s6":
				e11.Engdept2021S6em();
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
				e21.Engdept2022S3em();
				break;
			case "s4":
				e21.Engdept2022S4em();
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
				e31.Engdept2023S1em();
				break;
			case "s2":
				e31.Engdept2023S2em();
			}
			break;	
			
		}

		
	}

}
