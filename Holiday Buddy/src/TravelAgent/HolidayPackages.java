package TravelAgent;

import java.util.Scanner;

public class HolidayPackages implements HolidayBuddy
{
	private double SuitePrice = 25000;
	private double StudioPrice = 20000;
	private double VillaPrice = 35000;
	private int Suite = 18;
	private int Studio = 22;
	private int Villa = 9;
	Scanner sc = new Scanner(System.in);
	private int NoofPeople;
	private int NoofRoom;
	private String date;
	private int NoofDays;
	private double discount;
	public HolidayPackages(boolean female,boolean member) 
	{
		if(female)
			discount = 0.02;
		else if(member)
			discount = 0.1;
		else if(member && female)
			discount = 0.12;
	}
	@Override
	public void info()
	{
		System.out.println("Enter No. of people");
		NoofPeople = sc.nextInt();
		NoofRoom = (NoofPeople/2)+1;
		System.out.println("Enter the number of days \n");
		NoofDays = sc.nextInt();
		System.out.println("Enter Date of stay:(DD/MM/YYYY)");
		date = sc.next();
		System.out.println("Choose Packages:\n1.Maldives\n2.Coorg\n3.Pondicherry\n4.Ooty\n");
		int choice = sc.nextInt();
		SuitePrice = SuitePrice + (SuitePrice*discount);
		StudioPrice = StudioPrice + (StudioPrice*discount);
		VillaPrice = VillaPrice + (VillaPrice*discount);
		this.menu(choice);
	}
	@Override
	public void menu(int choice)
	{

		boolean flag = true;
		switch(choice)
		{
		case 1: while(flag)
		{
			System.out.println("Choose Resort:\n1.Windflower Resorts\n2.Sea View Resorts\n3.Bay View Resorts\n");
			int hotel = sc.nextInt();
			if(hotel == 1)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
			}
			else if(hotel == 2)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else
					{
						flag = false;
					}
				}
			}

			else if(hotel == 3)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
			}

		}
		break;
		case 2:  while(flag)
		{
			System.out.println("Choose Resort:\n1.Windflower Resorts\n2.Sea View Resorts\n3.Bay View Resorts\n");
			int hotel = sc.nextInt();
			if(hotel == 1)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
			}
			else if(hotel == 2)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
			}

			else if(hotel == 3)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else
					{
						flag = false;
					}
				}
			}

		}
		break;
		
		case 3: while(flag)
		{
			System.out.println("Choose Resort:\n1.Windflower Resorts\n2.Sea View Resorts\n3.Bay View Resorts\n");
			int hotel = sc.nextInt();
			if(hotel == 1)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN ==1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
			}
			else if(hotel == 2)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else
					{
						flag = false;
					}
				}
			}

			else if(hotel == 3)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();					
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
			}

		}
		break;
		
		case 4:  while(flag)
		{
			System.out.println("Choose Resort:\n1.Windflower Resorts\n2.Sea View Resorts\n3.Bay View Resorts\n");
			int hotel = sc.nextInt();
			if(hotel == 1)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else
					{
						flag = false;
					}
				}
			}
			else if(hotel == 2)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
			}

			else if(hotel == 3)
			{
				System.out.println("Choose type of accomodation:\n1.Suite\n2.Studio\n3.Villa");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println(Suite+" Suites are available.");
					System.out.println("You should book "+NoofRoom+" Suite for "+NoofPeople+" people.");
					System.out.println("Cost of Suite per day is Rs."+SuitePrice);
					System.out.println("Total Price = "+(SuitePrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Suites for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Suite--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}
				else if(ch == 2)
				{
					System.out.println(Studio+" Studio are available.");
					System.out.println("You should book "+NoofRoom+" Studio for "+NoofPeople+" people.");
					System.out.println("Cost of studio per day is Rs."+StudioPrice);
					System.out.println("Total Price = "+(StudioPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Studio for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Studio--;
						System.out.println("Thank you! Visit Again");
					}
					else 
					{
						flag = false;
					}
				}

				else if(ch == 3)
				{
					System.out.println(Villa+" villas are available.");
					System.out.println("You should book "+NoofRoom+" villa for "+NoofPeople+" people.");
					System.out.println("Cost of villa per day is Rs."+VillaPrice);
					System.out.println("Total Price = "+(VillaPrice*NoofRoom*NoofDays));
					System.out.println("Would you like to book?(1 for Yes , 2 for No)");
					int YorN = sc.nextInt();
					if(YorN == 1)
					{
						System.out.println("You have booked "+NoofRoom+" Villa for "+NoofPeople+" people for "+NoofDays+" on "+date);
						Villa--;
						System.out.println("Thank you! Visit Again");
					}
					else
					{
						flag = false;
					}
				}
			}

		}
		break;
		default: System.out.println("Enter valid input!");
		}
	}
}