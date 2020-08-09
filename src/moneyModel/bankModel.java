/**
 * Program Name: bankModel.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 1, 2020
 */
package moneyModel;

import java.util.ArrayList;

/**
 * @author Libo
 *
 */
public class BankModel
{
	private double totalMoney;
	private ArrayList<Payment> payInList, payOutList;
	
	public BankModel(double tm, ArrayList<Payment> pil, ArrayList<Payment> pol)
	{
		totalMoney=tm;
		payInList=pil;
		payOutList=pol;
	}
	
	public void payIn(Payment p)
	{
		totalMoney+=p.getMoney();
		payInList.add(p);
	}

	public void payOut(Payment p)
	{
		totalMoney-=p.getMoney();
		payInList.add(p);
	}
}
