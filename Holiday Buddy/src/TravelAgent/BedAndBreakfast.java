package TravelAgent;

import java.util.Scanner;

public class BedAndBreakfast implements HolidayBuddy
{
	static private int Room = 24;
	private double Price = 22000;
	private int NoofDays;
	private int NoofPeople;
	private int NoofRoom;
	private String date;
	private double discount = 0;
	public BedAndBreakfast(boolean female,boolean member) 
	{
		if(female)
			discount = 0.02;
		else if(member)
			discount = 0.1;
		else if(member && female)
			discount = 0.12;
	}
	Scanner sc = new Scanner(System.in);
	@Override
	public void info()
	{
		System.out.println("Enter the number of days of stay\n");
		NoofDays = sc.nextInt();
		System.out.println("Enter No. of people");
		NoofPeople = sc.nextInt();
		NoofRoom = (NoofPeople/2)+1;
		System.out.println("Enter Date of stay:(DD/MM/YYYY)");
		date = sc.next();
		System.out.println("Choose Location:\n1.Bangalore\n2.Mumbai\n3.Delhi\n4.Chennai\n");
		int choice = sc.nextInt();
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
			System.out.println("Choose Hotel:\n1.JW Marriot\n2.Taj Vivanta\n3.ITC Gardenia\n");
			int hotel = sc.nextInt();
			if(hotel == 1)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("Your have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}
			else if(hotel == 2)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("You have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}

			else if(hotel == 3)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("Your have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}

		}
		break;
		case 2: while(flag)
		{
			System.out.println("Choose Hotel:\n1.Nirmal Oberoi\n2.Taj \n");
			int hotel = sc.nextInt();
			if(hotel == 1)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("Your have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}
			else if(hotel == 2)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("Your have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}
		}
		break;

		case 3: while(flag)
		{
			System.out.println("Choose Hotel:\n1.MoveN'Pick\n2.Taj\n3.ITC Italia\n");
			int hotel = sc.nextInt();
			if(hotel == 1)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("Your have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}
			else if(hotel == 2)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("Your have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}

			else if(hotel == 3)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("Your have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}

		}
		break;

		case 4: while(flag)
		{
			System.out.println("Choose Hotel:\n1.Taj\n2.BayView\n3.Windflower\n");
			int hotel = sc.nextInt();
			if(hotel == 1)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("Your have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}
			else if(hotel == 2)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("Your have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}

			else if(hotel == 3)
			{
				System.out.println(Room+" rooms Available");
				System.out.println("You should book "+NoofRoom+" for "+NoofPeople+" people.");
				System.out.println("Price per room per day= "+Price);
				System.out.println("Would you like to book a room here?(1 for yes , 2 for no)\n");
				int ch = sc.nextInt();
				if(ch == 1)
				{
					System.out.println("Your have booked "+NoofRoom+" rooms for "+NoofPeople+" on "+date);
					System.out.println("Service includes both breakfast and dinner buffet");
					Price = (Price*NoofRoom*NoofDays)+(Price*discount);
					System.out.println("Total Price = "+Price);
					Room--;
					System.out.println("Thank you! Visit Again");
				}
				else
				{
					flag = false;
				}
			}

		}
		break;
		default: System.out.println("Enter valid input!");
		}
	}
}
