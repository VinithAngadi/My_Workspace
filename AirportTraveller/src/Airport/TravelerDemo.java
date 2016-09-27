package Airport;

import java.util.Scanner;

public class TravelerDemo {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		String sName;
		int iID;
		long lNumber;
		int iWeight;
		int iExpire;
		boolean bNOC;
		int iflag = 0;
		Checks check = new Checks();
		System.out.println("Enter Traveler Details :\n");
		System.out.println("Enter ID :");
		iID = sc.nextInt();
		System.out.println("Enter Name :");
		sName = sc.next();
		System.out.println("Enter Contact Number :");
		lNumber = sc.nextLong();
		System.out.println("Enter Baggage weight in kgs :");
		iWeight = sc.nextInt();
		System.out.println("Enter Passport Year of Expire :");
		iExpire = sc.nextInt();
		System.out.println("Enter Traveler's NOC status :");
		bNOC = sc.nextBoolean();
		Traveler Passenger = new Traveler(iID,iExpire,sName,lNumber,iWeight,bNOC);
		Passenger.validateName();
		Passenger.validateContactNo();
		Passenger.displayInformation();
		if(check.checkBaggage(Passenger))
		{
			if(check.checkImmigration(Passenger))
			{
				if(check.checkSecurity(Passenger))
				{
					iflag  = 1;
				}
			}
		}
		if(iflag == 1)
			System.out.println("Allow Traveller	to fly!");
		else
			System.out.println("Detain Traveller for Rechecking!");
		
	}

}