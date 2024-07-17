package externalMarkCOE;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import examinationMarkEntryTamilDept.ArrierEntry2021Tamildept;
import examinationMarkEntryTamilDept.ArrierEntry2022Tamildept;
import examinationMarkEntryTamilDept.ArrierEntry2023Tamildept;

public class ArrierTamilDept extends CreateConnection

{
	String inpu,nn;
	int nm;
	Scanner obb=new Scanner (System.in);
	
	

	public void ArrierTamildept() throws SQLException
	{
		ArrierEntry2021Tamildept a11=new ArrierEntry2021Tamildept();
		ArrierEntry2022Tamildept a21=new ArrierEntry2022Tamildept();
		ArrierEntry2023Tamildept a31=new ArrierEntry2023Tamildept();

		

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
				a11.A2021tS1();
			break;
			case "s2":
				a11.A2021tS2();
				break;
			case "s3":
				a11.A2021tS3();
				break;
			case "s4":
				a11.A2021tS4();
				break;
			case "s5":
				a11.A2021tS5();
				break;
			case "s6":
				a11.A2021tS6();
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
				a21.A2022tS1();
			break;
			case "s2":
				a21.A2022tS2();
				break;
			case "s3":
				a21.A2022tS3();
				break;
			case "s4":
				a21.A2022tS4();
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
				a31.A2023tS1();
			break;
			case "s2":
				a31.A2023tS2();
				break;
			default: System.out.println("*** Invalid Input ***");
			}
			
			break;
			default: System.out.println("*** Invalid Input ***");
		}
		
				
	}

}

