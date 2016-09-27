package bank;

import java.util.Scanner;

public class Accounts extends SBI
{
	int choice;
    long Balance;
	String sName;
	String Acc_no;
	Scanner sc = new Scanner(System.in);
	public Accounts(int choice, Long balance, String sName, String acc_no) {
		super();
		this.choice = choice;
		this.Balance = balance;
		this.sName = sName;
		this.Acc_no = acc_no;
	}
	
	public void Calculate()
	{
		if(choice == 1)
			this.providentFund();
		else
			this.savingsAccount();
	}
	public void providentFund()
	{
		System.out.println("Balence in ");
	}
	public void savingsAccount() 
	{
			System.out.println("Enter choice\n1. Withdraw\n2. Deposit\n3. Transfer");
			choice = sc.nextInt();
			switch(choice)
			{
			case 1: System.out.println("Enter amount to be withdrawn:");
					long withdrawAmt = sc.nextLong();
					Balance = withdrawal(withdrawAmt,Balance);
					System.out.println("Balence after withdrawal = "+Balance);
					break;
			case 2: System.out.println("Enter amount to be deposited:");
					long Deposit = sc.nextLong();
					Balance = deposit(Deposit,Balance);
					System.out.println("Balance after deposition = "+Balance);
					break;
			case 3: System.out.println("Enter Target Account Number :\n");
			     	String Acc_no2 = sc.next();
			     	System.out.println("Enter Amount to be transferrred :\n");
			     	long Transfer = sc.nextLong();
			     	if(transfer(Acc_no,Acc_no2,Transfer,Balance))
			     		System.out.println("Transaction Succesfull!");
			     	else
			     		System.out.println("Transaction Unsuccessful!");
			     	break;
			default: System.out.println("Enter valid input!");
		}
	}
}
