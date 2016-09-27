package Airport;

public class ChattrapatiShivajiInternationalAirport implements Airport
{

	@Override
	public boolean checkedInBaggage(float weight) 
	{
		if(weight >= 0 && weight <= 30)
		    return true;
		else
			return false;
	}

	@Override
	public boolean checkExpiryDate(int year) 
	{
		if(year >= 1999 && year <= 2020)
		    return true;
		else
			return false;
	}
	
}
