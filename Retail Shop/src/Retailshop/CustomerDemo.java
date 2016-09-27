package Retailshop;

import java.util.Scanner;

public class CustomerDemo {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) 
	{
		int flag = 0;
		ItemDetails Item = new ItemDetails();
		PurchaseBill Purchase = new PurchaseBill();
		System.out.println("Enter Customer Name :");
		String sName = sc.next();
		System.out.println("Enter Contact Number :");
		long lNumber = sc.nextLong();
		System.out.println("Enter ID :");
		int iID = sc.nextInt();
		System.out.println("Enter Address :");
		String sAddress = sc.next();
		Customer Cust = new Customer(lNumber,sName,iID,sAddress);
		if(Cust.validateCustName())
			if(Cust.validateTeleNo())
				flag = 1;
		System.out.println("Enter Item ID :");
		int iItemID = sc.nextInt();
		Item.setiItemID(iItemID);
		System.out.println("Enter Item Price :");
		double dPrice = sc.nextDouble();
		Item.setdItemPrice(dPrice);
		if(Item.validateItemID())
			flag = 1;
		System.out.println("Enter total Bill Amount :");
		double dTotal = sc.nextDouble();
		Purchase.setdBillAmt(dTotal);
		Purchase.setiQty(1);
		Purchase.calculateBill();
		if(flag == 1)
		{
			Cust.displayDetails();
			Item.displayDetails();
			Purchase.displayDetails();
		}
		else
			System.out.println("Enter Valid Details!");
	}
}