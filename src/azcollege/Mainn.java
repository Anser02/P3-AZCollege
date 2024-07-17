package azcollege;

import java.sql.SQLException;
import java.util.Scanner;

import admission.AdmissionLoginn;
import departmentLoginn.ChemistryDeptLoginn;
import departmentLoginn.CompSciDeptLoginn;
import departmentLoginn.EnglishDeptLoginn;
import departmentLoginn.TamilDeptLoginn;
import externalMarkCOE.COELoginn;
import feesSectionn2.FeesSectionLogin;
import studentLoginn2.CsdeptStuLoginMain;

public class Mainn {

	public static void main(String[] args) throws SQLException {
		String inpu;
		Scanner obb=new Scanner (System.in);
		System.out.println();
		System.out.println(" ----------        AZ College (Autonomous)   ----------");
		System.out.println("                   Thiruvannamalai-606401             ");
		System.out.println();				
		System.out.println("   ***   Press '1'  -  Admission Login     ***   ");
		System.out.println("   ***   Press '2'  -  Department Login    ***   ");
		System.out.println("   ***   Press '3'  -  Student Login       ***   ");
		System.out.println("   ***   Press '4'  -  Fees Section Login  ***   ");
		System.out.println("   ***   Press '5'  -  Exam Section Login  ***   ");
		System.out.println();  
		String i;
		i=obb.nextLine();
		
		switch(i)
		{
		case "1":
			AdmissionLoginn al=new AdmissionLoginn();
			al.AdmissionLogin();			
		break;
						
		case "2":
			System.out.println("Press 'cs'  -  Comp Sci Dept Login");
			System.out.println("Press 't'   -  Tamil Dept Login");
			System.out.println("Press 'e'   -  Englist Dept Login");
			System.out.println("Press 'c'   -  Chemistry Dept Login");
			inpu=obb.nextLine();
			switch(inpu)
			{			
			case "cs":
				CompSciDeptLoginn csd=new CompSciDeptLoginn();
				csd.CompSciDeptLogin();
				break;				
			case "t":
				TamilDeptLoginn tdl=new TamilDeptLoginn();
				tdl.Tamildeptoginn();
				break;			
			case "e":
				EnglishDeptLoginn  edl=new EnglishDeptLoginn();
				edl.EnglishDeptLogin();
				break;				
			case "c":
				ChemistryDeptLoginn cd=new ChemistryDeptLoginn();
				cd.CheDeptLogin();
				break;				
			default :
				System.out.println("   *** Invalid  Input ***   ");			
			}			
			break;			
			
		case "3":
			CsdeptStuLoginMain cs=new CsdeptStuLoginMain();
			cs.CsdeptStuloginMain();
			break;
										
		case "4":
			FeesSectionLogin fl=new FeesSectionLogin();
			fl.FeesSectionLoginn();		
			break;
							
		case "5":
			COELoginn cl=new COELoginn();
			cl.coeLogin();				
			break;
			
		default :
			System.out.println("   *** Invalid Input ***   ");		
		}
	}
}
