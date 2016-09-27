package Airport;

public class Checks 
{
	public boolean checkBaggage(Traveler T) 
	{
		if(T.getfBaggageAmount() >= 0 && T.getfBaggageAmount() <= 40)
		    return true;
		else
			return false;
	
	}
	public boolean checkImmigration(Traveler T)
	{
		if(T.getiExpiryYear() >= 2001 && T.getiExpiryYear() <= 2025)
		    return true;
		else
			return false;
		
	}
	public boolean checkSecurity(Traveler T)
	{
		if(T.isbNOCStatus())
		    return true;
		else
			return false;
	}
}
