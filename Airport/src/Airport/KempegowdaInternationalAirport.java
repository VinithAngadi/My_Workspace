package Airport;

public class KempegowdaInternationalAirport implements Airport 
{
	
	@Override
	public boolean checkedInBaggage(float weight) 
	{
		if(weight >= 0 && weight <= 40)
		    return true;
		else
			return false;
	}

	@Override
	public boolean checkExpiryDate(int year) 
	{
		if(year >= 2001 && year <= 2025)
		    return true;
		else
			return false;
	}
	
}
