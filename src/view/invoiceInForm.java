/**
 * Program Name: invoiceInForm.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 2, 2020
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javafx.application.Application;

/**
 * @author Libo
 *
 */
public class InvoiceInForm extends Application
{
	private JLabel titleLbl, companyNameLbl,productNameLbl,productDimensionLbl,priceLbl,totalPriceLbl;
	private JTextField titleFld, companyNameFld,productNameFld,productDimensionFld,priceFld,totalPriceFld;
	private JButton addBtn, clearBtn;
	
	public void start(Stage myStage)
	{
		titleFld=new JTextField();


		rootPane.setCenter(titleFld);

		Scene myScene = new Scene(rootPane, 400, 200);

		myStage.setScene(myScene);
    myStage.setTitle("Bookkeeping");
    
    myStage.show();	
	}

}
