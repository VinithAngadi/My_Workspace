package bank;

public interface Bank 
{
	public long withdrawal(long withdraw,long Balance);
	public long deposit(long Deposit,long Balance);
	public boolean transfer(String Acc_no1,String Acc_no2,long Amt,long Balance);
}