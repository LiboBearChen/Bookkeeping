/**
 * Program Name: DebtModel.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 7, 2020
 */
package moneyModel;

/**
 * @author Libo
 *
 */
public class DebtModel
{
	private double money;
	private String note;
	
	public DebtModel(double m, String n)
	{
		money=m;
		note=n;
	}
	
	public void setMoney(double m)
	{
		money=m;
	}

	public void setNote(String n)
	{
		note=n;
	}
	
	public double getMoney()
	{
		return money;
	}
	
	public String getNote()
	{
		return note;
	}
}
