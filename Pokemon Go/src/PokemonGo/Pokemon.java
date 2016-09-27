package PokemonGo;

public class Pokemon 
{
	private int iPokeID,iInitialCP,iTotalMatchPlayed,iWon,iLost;
	private String sPokeName,sType;
	private float fFinalCP;
	public Pokemon(int iPokeID, int iInitialCP, int iWon, int iLost, String sPokeName, String sType) 
	{
		super();
		this.iPokeID = iPokeID;
		this.iInitialCP = iInitialCP;
		this.iWon = iWon;
		this.iLost = iLost;
		this.sPokeName = sPokeName;
		this.sType = sType;
	}
	public void calPokemonCP()
	{
		float f;
		if(iWon > iLost)
		{
			if(iWon >= 1 && iWon <= 20)
				f = 0.1f;
			else if(iWon > 20 && iWon <= 40)
				f = 0.25f;
			else if(iWon > 40 && iWon <= 60)
				f = 0.4f;
			else
				f = 0.5f;
			fFinalCP = iInitialCP - ((iWon - iLost) * f);
		}
		else
		{
			if(iLost >= 1 && iLost <= 20)
				f = 0.1f;
			else if(iLost > 20 && iLost <= 40)
				f = 0.25f;
			else if(iLost > 40 && iLost <= 60)
				f = 0.4f;
			else
				f = 0.5f;
			fFinalCP = iInitialCP - ((iWon - iLost) * f);
		}
	}
	public void display()
	{
		System.out.println("Pokemon Name :"+sPokeName);
		System.out.println("Pokemon Type :"+sType);
		System.out.println("Initial CP :"+iInitialCP);
		System.out.println("Matches won :"+iWon);
		System.out.println("Matches lost :"+iLost);
		System.out.println("Final CP : "+fFinalCP);
	}
	
}