package studentLoginn2;

import java.sql.SQLException;
import java.util.Scanner;

public class CsdeptStuLoginMain
{
	String inpu;
	Scanner obb=new Scanner(System.in);

	public void CsdeptStuloginMain() throws SQLException
	{
		System.out.println("Cs dept student login");
		System.out.println("   ***   Press '2021'  - 2021 Batch Student List     ***   ");
		System.out.println("   ***   Press '2022'  - 2022 Batch Student List     ***   ");
		System.out.println("   ***   Press '2023'  - 2023 Batch Student List     ***   ");
		inpu=obb.nextLine();
		CompSciDeptStuLoginn sl1=new CompSciDeptStuLoginn();
		switch(inpu)
		{
		case "2021":
			sl1.CompSciDeptStuLogin2021();
			break;
		case "2022":
			sl1.CompSciDeptStuLogin2022();
			break;
			
		case "2023":
			sl1.CompSciDeptStuLogin2023();
			break;
		default :
			System.out.println("   *** Invalid Input ***   ");
		}
	}
}
