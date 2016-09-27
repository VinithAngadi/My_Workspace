package Retailshop;

public class PurchaseBill 
{
	private int iQty;
	private double dDiscount = 0;
	private double dBillAmt;
	
	public void setiQty(int iQty) {
		this.iQty = iQty;
	}
	public void setdBillAmt(double dBillAmt) {
		this.dBillAmt = dBillAmt;
	}
	public double calculateBill()
	{
		double dTotalBill;
		if(iQty >= 0 && iQty <= 5)
		{	if(dBillAmt >= 500 && dBillAmt <=999 )
				dDiscount = 0.05;
			else if(dBillAmt >=1000)
				dDiscount = 0.1;
		}
		dTotalBill = dBillAmt + dBillAmt * dDiscount;
		return dTotalBill;
	}
	public void displayDetails()
	{
		System.out.println("Bill Amount = "+dBillAmt);
		System.out.println("Discount = "+dDiscount);
		System.out.println("Final Bill = "+calculateBill());
	}
}
