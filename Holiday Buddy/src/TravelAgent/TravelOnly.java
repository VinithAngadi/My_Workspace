package TravelAgent;
import java.util.Scanner;

public class TravelOnly implements HolidayBuddy 
{

	private int NoofPeople;
	private String date;
	private double TravelCost;
	private double Air = 50;
	private double Rail = 15;
	private double Road = 25;
	private boolean flag = true;
	Scanner sc = new Scanner(System.in);
	private double discount;
	public TravelOnly(boolean female,boolean member) 
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
		System.out.println("Enter Date of Travel:(DD/MM/YYYY)");
		date = sc.next();
		Air = Air + (Air*discount);
		Road = Road + (Road*discount);
		Rail = Rail + (Rail*discount);
		while(flag)
		{
			System.out.println("Choose mode of transport:\n1.Airways\n2.Railways\n3.Road\n");
			int choice = sc.nextInt();
			this.menu(choice);
		}
	}

	@Override
	public void menu(int choice) 
	{
		String Destination;
		int YorN;
		double Distance;
		switch (choice) 
		{
		case 1: System.out.println("Enter Destination:");
		Destination = sc.next();
		System.out.println("Enter Distance of travel:");
		Distance = sc.nextInt();
		TravelCost = Distance*Air;
		System.out.println("Cost of travel per head = Rs."+TravelCost);
		System.out.println("Would you like to book tickets?(1 for Yes , 2 for No)");
		YorN = sc.nextInt();
		if(YorN == 1)
		{
			System.out.println("You have booked a flight from Hubli to "+Destination+" on "+date);
			System.out.println("Travel cost = Rs."+TravelCost*NoofPeople);
			System.out.println("Thank You! Visit Again");
			flag = false;
		}
		else if(YorN == 2)
		{
			flag = true;
			return;
		}
		break;
		case 2:  System.out.println("Enter Destination:");
		Destination = sc.next();
		System.out.println("Enter Distance of travel:");
		Distance = sc.nextInt();
		TravelCost = Distance*Rail;
		System.out.println("Cost of travel per head = Rs."+TravelCost);
		System.out.println("Would you like to book tickets?(YorN)");
		YorN = sc.nextInt();
		if(YorN == 1)
		{
			System.out.println("You have booked a train from Hubli to "+Destination+" on "+date);
			System.out.println("Travel cost = Rs."+TravelCost*NoofPeople);
			System.out.println("Thank You! Visit Again");
			flag = false;
		}
		else if(YorN == 2)
		{
			flag = true;
			return;
		}
		break;

		case 3:  System.out.println("Enter Destination:");
		Destination = sc.next();
		System.out.println("Enter Distance of travel:");
		Distance = sc.nextInt();
		TravelCost = Distance*Road;
		System.out.println("Cost of travel per head = Rs."+TravelCost);
		System.out.println("Would you like to book tickets?(YorN)");
		YorN = sc.nextInt();
		if(YorN == 1)
		{
			System.out.println("You have booked a Bus from Hubli to "+Destination+" on "+date);
			System.out.println("Travel cost = Rs."+TravelCost*NoofPeople);
			System.out.println("Thank You! Visit Again");
			flag = false;
		}
		else if(YorN == 2)
		{
			flag = true;
			return;
		}
		break;

		default:System.out.println("Enter Valid choice!");
		break;
		}
	}

}
