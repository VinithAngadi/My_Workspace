package Employee;

public class Employee 
{
	private int iEmpID;
	private String sEmpName,sDesignation;
	private float fBasicSalary, fAllowance,fNetSalary;

	

	public float getfNetSalary() {
		return fNetSalary;
	}

	public Employee(int iEmpID, String sEmpName, float fBasicSalary,String sDesignation) {
		this.iEmpID = iEmpID;
		this.sEmpName = sEmpName;
		this.fBasicSalary = fBasicSalary;
		this.sDesignation = sDesignation;
	}

	public void calNetSalary() {
		float fGrossSalary, fIncomeTax;
		if(sDesignation == "Developer")
		    fAllowance = (float) (fBasicSalary * 0.2);
		else if(sDesignation == "Team Leader")
			fAllowance = (float) (fBasicSalary * 0.3);
		else if(sDesignation == "Team Leader")
			fAllowance = (float) (fBasicSalary * 0.4);
		
		fGrossSalary = (float) (fBasicSalary + fAllowance);
		
		if (fGrossSalary <= 5000)
			fIncomeTax = 0;
		else if (fGrossSalary <= 10000 && fGrossSalary > 5000)
			fIncomeTax = (float) (fGrossSalary * 0.1);

		else if (fGrossSalary <= 20000 && fGrossSalary > 10000)
			fIncomeTax = (float) (fGrossSalary * 0.2);
		else
			fIncomeTax = (float) (fGrossSalary * 0.3);
		fNetSalary = (float) (fGrossSalary - fIncomeTax);
		Display(fGrossSalary,fIncomeTax,fNetSalary);

	}
	public void Display(float fGrossSalary,float fIncomeTax,float fNetSalary)
	{
		System.out.println("Employee Name: " + sEmpName);
		System.out.println("Employee Id: " + iEmpID);
		System.out.println("Designation :"+sDesignation);
		System.out.println("Basic Salary: " + fBasicSalary);
		System.out.println("Allowance: " + fAllowance);
		System.out.println("Gross Salary : " + fGrossSalary);
		System.out.println("Income Tax : " + fIncomeTax);
		System.out.println("Net Salary: " + fNetSalary);
	}
}