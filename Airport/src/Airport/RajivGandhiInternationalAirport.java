package Airport;

public class RajivGandhiInternationalAirport implements Airport
{

	@Override
	public boolean checkedInBaggage(float weight) 
	{
		if(weight >= 0 && weight <= 35)
		    return true;
		else
			return false;
	}

	@Override
	public boolean checkExpiryDate(int year) 
	{
		if(year >= 2004 && year <= 2028)
		    return true;
		else
			return false;
	}
	
}
