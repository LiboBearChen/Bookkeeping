/**
 * Program Name: cutomerModel.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Jul. 31, 2020
 */
package customerModel;

import java.util.ArrayList;

import moneyModel.DebtModel;
public class CutomerModel
{

	private String companyName;
	private ArrayList<DebtModel> debtList;
	
	public CutomerModel(String cn, ArrayList<DebtModel> dl)
	{
		companyName=cn;
		debtList=dl;
	}

	public void setCompanyName(String cn)
	{
		companyName=cn;
	}
	public void setDebtList(ArrayList<DebtModel> dl)
	{
		debtList=dl;
	}
	
	public String getCompanyName()
	{
		return companyName;
	}
	public ArrayList<DebtModel> getDebtList()
	{
		return debtList;
	}
}
