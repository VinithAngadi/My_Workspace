package Airport;

public class Traveler 
{
	private int iTravelerID,iExpiryYear;
	private String sTravelerName;
	private long lTravelerContactNo;
	private float fBaggageAmount;
	private boolean bNOCStatus;
    
	public Traveler(int iTravelerID, int iExpiryYear, String sTravelerName,
			long lTravelerContactNo, float fBaggageAmount, boolean bNOCStatus) 
	{
		super();
		this.iTravelerID = iTravelerID;
		this.iExpiryYear = iExpiryYear;
		this.sTravelerName = sTravelerName;
		this.lTravelerContactNo = lTravelerContactNo;
		this.fBaggageAmount = fBaggageAmount;
		this.bNOCStatus = bNOCStatus;
	}
	
	public int getiExpiryYear() 
	{
		return iExpiryYear;
	}

	public float getfBaggageAmount() 
	{
		return fBaggageAmount;
	}

	public boolean isbNOCStatus() 
	{
		return bNOCStatus;
	}
	
	public boolean validateName()
	{
		if(sTravelerName.length() > 4 && sTravelerName.length() < 20)
			return true;
		else
			return false;
	}
	
	public boolean validateContactNo()
	{
		if(lTravelerContactNo >= 7000000000l && lTravelerContactNo <= 9999999999l)
			return true;
		else
			return false;
	}
	
	public void displayInformation()
	{
		System.out.println("Traveler ID : "+iTravelerID);
		System.out.println("Traveler Name : "+sTravelerName);
		System.out.println("Traveler Contact Number :"+lTravelerContactNo);
		
	}
}