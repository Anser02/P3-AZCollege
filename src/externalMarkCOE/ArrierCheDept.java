package externalMarkCOE;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import examinationMarkEntryChemistryDept.ArrierEntry2021CheDept;
import examinationMarkEntryChemistryDept.ArrierEntry2022CheDept;
import examinationMarkEntryChemistryDept.ArrierEntry2023CheDept;

public class ArrierCheDept extends CreateConnection

{
	String inpu,nn;
	int nm;
	Scanner obb=new Scanner (System.in);
	

	public void ArrierChedept() throws SQLException
	{
		ArrierEntry2021CheDept a11=new ArrierEntry2021CheDept();
		ArrierEntry2022CheDept a21=new ArrierEntry2022CheDept();
		ArrierEntry2023CheDept a31=new ArrierEntry2023CheDept();

		

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
				a11.A2021cheS1();
			break;
			case "s2":
				a11.A2021cheS2();
				break;
			case "s3":
				a11.A2021cheS3();
				break;
			case "s4":
				a11.A2021cheS4();
				break;
			case "s5":
				a11.A2021cheS5();
				break;
			case "s6":
				a11.A2021cheS6();
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
				a21.A2022cheS1();
			break;
			case "s2":
				a21.A2022cheS2();
				break;
			case "s3":
				a21.A2022cheS3();
				break;
			case "s4":
				a21.A2022cheS4();
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
				a31.A2023cheS1();
			break;
			case "s2":
				a31.A2023cheS2();
				break;
			default: System.out.println("*** Invalid Input ***");
			}
			
			break;
			default: System.out.println("*** Invalid Input ***");
		}
		
				
	}

}
