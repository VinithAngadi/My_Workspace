package bank;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Customer name:\n");
		String sName = sc.next();
		System.out.println("Enter Account number:\n");
		String Acc_no = sc.next();
		System.out.println("Enter Balence:\n");
		long Acc_Bal = sc.nextLong();
		System.out.println("Enter choice\n1. Provident Fund Account\n2. Savings Account\n");
		int choice = sc.nextInt();
		Accounts Ac = new Accounts(choice,Acc_Bal,sName,Acc_no);
		Ac.Calculate();
		
		}
	}