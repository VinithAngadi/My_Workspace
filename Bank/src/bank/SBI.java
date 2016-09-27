package bank;

public class SBI implements Bank
{

	@Override
	public long withdrawal(long withdraw,long Balance) 
	{	
		if(withdraw <= Balance)
			return (Balance - withdraw);
		else
		{
			System.out.println("Withdrawal limit exceeded!");
			return Balance;
		}
	}

	@Override
	public long deposit(long Deposit,long Balance) 
	{
		return (Balance + Deposit);
	}

	@Override
	public boolean transfer(String Acc_no1,String Acc_no2,long Amt,long Balance)
	{
		if(Amt <= Balance)
		{
			System.out.println("Rs."+Amt+" transferred to Account "+Acc_no2);
			Balance = Balance - Amt;
			System.out.println("Remaining Balance = Rs."+Balance);
			return true;
		}
		else
			return false;
	}
	
}
