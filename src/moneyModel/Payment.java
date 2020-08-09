/**
 * Program Name: Payment.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 8, 2020
 */
package moneyModel;

import java.util.ArrayList;

/**
 * @author Libo
 *
 */
public class Payment
{
	private double money;
	private String note;
	
	public Payment(double m, String n)
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
