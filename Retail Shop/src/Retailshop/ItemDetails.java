package Retailshop;

public class ItemDetails 
{
	private int iItemID;
	private double dItemPrice;
	public double getdItemPrice() {
		return dItemPrice;
	}
	public void setiItemID(int iItemID) {
		this.iItemID = iItemID;
	}
	public void setdItemPrice(double dItemPrice) {
		this.dItemPrice = dItemPrice;
	}

	public boolean validateItemID()
	{
		if(iItemID <= 1001 && iItemID >=1005 && dItemPrice >= 5)
			return true;
			else
			 return false;
	}
	public void displayDetails()
	{
		System.out.println("ID = "+iItemID);
		System.out.println("Price = "+dItemPrice);
	}
}