package externalMarkCOE;

import java.sql.SQLException;
import java.util.Scanner;

import connectionn.CreateConnection;
import examinationMarkEntryCompSciDept.ArrierEntryof2021Csdept;
import examinationMarkEntryCompSciDept.ArrierEntryof2022Csdept;
import examinationMarkEntryCompSciDept.ArrierEntryof2023Csdept;


public class ArrierCSDept extends CreateConnection

{
	String inpu,nn;
	int nm;
	Scanner obb=new Scanner (System.in);
	
	



	public void ArrierCsdept() throws SQLException
	{
		ArrierEntryof2021Csdept a11=new ArrierEntryof2021Csdept();
		ArrierEntryof2022Csdept a21=new ArrierEntryof2022Csdept();
		ArrierEntryof2023Csdept a31=new ArrierEntryof2023Csdept();

		

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
				a11.A2021csS1();
			break;
			case "s2":
				a11.A2021csS2();
				break;
			case "s3":
				a11.A2021csS3();
				break;
			case "s4":
				a11.A2021csS4();
				break;
			case "s5":
				a11.A2021csS5();
				break;
			case "s6":
				a11.A2021csS6();
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
				a21.A2022csS1();
			break;
			case "s2":
				a21.A2022csS2();
				break;
			case "s3":
				a21.A2022csS3();
				break;
			case "s4":
				a21.A2022csS4();
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
				a31.A2023csS1();
			break;
			case "s2":
				a31.A2023csS2();
				break;
			default: System.out.println("*** Invalid Input ***");
			}
			
			break;
			default: System.out.println("*** Invalid Input ***");
		}
		
				
	}

}