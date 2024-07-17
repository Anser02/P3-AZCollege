package externalMarkCOE;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import examinationMarkEntryEnglishDept.ArrierEntry2021EngDept;
import examinationMarkEntryEnglishDept.ArrierEntry2022EngDept;
import examinationMarkEntryEnglishDept.ArrierEntry2023EngDept;

public class ArrierEnglishDept extends CreateConnection

{
	String inpu,nn;
	int nm;
	Scanner obb=new Scanner (System.in);
	
	



	public void ArrierEngdept() throws SQLException
	{
		ArrierEntry2021EngDept a11=new ArrierEntry2021EngDept();
		ArrierEntry2022EngDept a21=new ArrierEntry2022EngDept();
		ArrierEntry2023EngDept a31=new ArrierEntry2023EngDept();

		

		System.out.println("   ***   Press 1 - Update 2021 Batch Student External marks   ***   ");
		System.out.println("   ***   Press 2 - Update 2022 Batch Student External marks   ***   ");
		System.out.println("   ***   Press 3 - Update 2023 Batch Student External marks   ***   ");
		inpu=obb.nextLine();
		switch(inpu)
		{
		case "1":
			System.out.println("Press s1 - update sem1 Mark");
			System.out.println("Press s2 - update sem2 Mark");
			System.out.println("Press s3 - update sem3 Mark");
			System.out.println("Press s4 - update sem4 Mark");
			System.out.println("Press s5 - update sem5 Mark");
			System.out.println("Press s6 - update sem6 Mark");
			nn=obb.nextLine();
			switch(nn)
			{
			case "s1":
				a11.A2021eS1();
			break;
			case "s2":
				a11.A2021eS2();
				break;
			case "s3":
				a11.A2021eS3();
				break;
			case "s4":
				a11.A2021eS4();
				break;
			case "s5":
				a11.A2021eS5();
				break;
			case "s6":
				a11.A2021eS6();
				break;
			default: System.out.println("*** Invalid Input ***");
			}
		break;
		
		
		case "2":
			System.out.println("Press s1 - update sem1 Mark");
			System.out.println("Press s2 - update sem2 Mark");
			System.out.println("Press s3 - update sem3 Mark");
			System.out.println("Press s4 - update sem4 Mark");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "1":
				a21.A2022eS1();
			break;
			case "s2":
				a21.A2022eS2();
				break;
			case "s3":
				a21.A2022eS3();
				break;
			case "s4":
				a21.A2022eS4();
				break;
			default: System.out.println("*** Invalid Input ***");
				
			}
			break;
			
			
		case "3":
			System.out.println("Press s1 - update sem1 Mark");
			System.out.println("Press s2 - update sem2 Mark");
			inpu=obb.nextLine();
			switch(inpu)
			{
			case "1":
				a31.A2023eS1();
			break;
			case "s2":
				a31.A2023eS2();
				break;
			default: System.out.println("*** Invalid Input ***");
			}
			
			break;
			default: System.out.println("*** Invalid Input ***");
		}
		
				
	}

}
