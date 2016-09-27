package TravelAgent;

import java.util.Scanner;

public class TravellerDemo 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		boolean secondTime = false;
		boolean female = false;
		boolean flag = true;
		System.out.println("Enter Traveller Name:");
		String sName = sc.next();
		System.out.println("Enter \n1. if traveller has membership card\n2. if not");
		int sMember = sc.nextInt();
		if(sMember == 1)
		{
			System.out.println("Enter membership card number:\n");
			secondTime = true;
			long lcardNo = sc.nextLong();
		}
		else if(sMember == 2)
		{
			System.out.println("Issue membership card for first time customer");
		}
		System.out.println("Enter \n1. for male\n2. for female");
		int sGender = sc.nextInt();
		if(sGender == 1)
		{
			female = true;
		}

			while(flag)
			{
				System.out.println("Enter choice:\n1.Travel Only\n2.Holiday Package\n3.Bed And Breakfast\n4.Exit");
				int choice = sc.nextInt();
				switch(choice)
				{
				case 1: TravelOnly TO = new TravelOnly(female,secondTime);
				TO.info();
				flag = false;
				break;
				case 2: HolidayPackages HP = new HolidayPackages(female,secondTime);
				HP.info();
				flag = false;
				break;
				case 3: BedAndBreakfast BAB = new BedAndBreakfast(female,secondTime);
				BAB.info();
				flag = false;
				break;
				case 4: flag = false;
				break;
				default: System.out.println("Enter valid choice!");
				}
			}
	}
}