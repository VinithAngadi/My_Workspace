package Airport;

import java.util.Scanner;

public class Traveller
{
	private static String sName;
	private static float fBaggageAmount;
	private static int iExpiryYear;
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose the Airport:\n1. Kempegowda Int'l Airport\n2. Chatrapathi Shivaji Int'l Airport\n3. Rajiv Gandhi Int'l Airport\n");
		int choice = sc.nextInt();
		System.out.println("Enter Traveller name:");
		sName = sc.next();
		System.out.println("Enter Baggage weight:");
		fBaggageAmount = sc.nextFloat();
		System.out.println("Enter Passport Expiry Year:");
		iExpiryYear = sc.nextInt();
		switch(choice)
		{
		case 1: KempegowdaInternationalAirport KIA = new KempegowdaInternationalAirport();
				if(KIA.checkedInBaggage(fBaggageAmount)&&(KIA.checkExpiryDate(iExpiryYear)))
					System.out.println(sName+" is eligible to fly!");
				break;
		case 2: ChattrapatiShivajiInternationalAirport CSIA = new ChattrapatiShivajiInternationalAirport();
				if(CSIA.checkedInBaggage(fBaggageAmount)&&(CSIA.checkExpiryDate(iExpiryYear)))
					System.out.println(sName+" is eligible to fly!");
				break;
		case 3: RajivGandhiInternationalAirport RGIA = new RajivGandhiInternationalAirport();
		if(RGIA.checkedInBaggage(fBaggageAmount)&&(RGIA.checkExpiryDate(iExpiryYear)))
			System.out.println(sName+" is eligible to fly!");
		}
	}
}