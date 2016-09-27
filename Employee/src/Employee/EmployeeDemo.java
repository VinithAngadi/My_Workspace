package Employee;

import java.util.Scanner;

public class EmployeeDemo 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int iNoOfEmp;
		String sName,sDesignation;
		int iID;
		float fBS,fHighSalary;;
		System.out.println("Enter number of Employees:");
		iNoOfEmp = sc.nextInt();
		Employee[] Emp = new Employee[iNoOfEmp];
		for(int i = 0; i < iNoOfEmp;i++)
		{
			System.out.println("Enter Employee "+(i+1)+" Details:\n");
			System.out.println("Name:");
			sName = sc.next();
			System.out.println("Designation:");
			sDesignation = sc.next();
			System.out.println("ID:");
			iID = sc.nextInt();
			System.out.println("Basic Salary:");
			fBS = sc.nextFloat();
			Emp[i] = new Employee(iID,sName,fBS,sDesignation);
		    Emp[i].calNetSalary();
		}
		fHighSalary = Emp[0].getfNetSalary();
		for(int i = 1;i < iNoOfEmp;i++)
		{
			if(Emp[i].getfNetSalary()>fHighSalary)
			{
				fHighSalary = Emp[i].getfNetSalary();
			}
		}
		System.out.println("Highest Salary = "+fHighSalary);
	}
}