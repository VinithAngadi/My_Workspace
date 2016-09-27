package Retailshop;

public class Customer 
{
	private long lTeleNo;
	private String sCustName;
	private int iCustID;
	private String sAddress;
	
	public Customer(long lTeleNo, String sCustName, int iCustID, String sAddress) {
	
		this.lTeleNo = lTeleNo;
		this.sCustName = sCustName;
		this.iCustID = iCustID;
		this.sAddress = sAddress;
	}

	public boolean validateTeleNo()
	{
		if(lTeleNo >= 7000000000l && lTeleNo <= 9999999999l)
			return true;
		else
			return false;
	}
	public boolean validateCustName()
	{
		if(sCustName.length() <= 20 && sCustName.length() >=4)
			return true;
		else
			return false;
	}
	public void displayDetails()
	{
		System.out.println("Customer ID : "+iCustID);
		System.out.println("Customer Name : "+sCustName);
		System.out.println("Contact Number : "+lTeleNo);
		System.out.println("Address : "+sAddress);
	}
}
