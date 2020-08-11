/**
 * Program Name: Invoiceform.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 10, 2020
 */
package view;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * @author Libo
 *
 */
public class InvoiceForm
{
	private Label titleLbl, companyNameLbl,productNameLbl,productDimensionLbl,priceLbl,totalPriceLbl;
	private TextField titleFld, companyNameFld,productNameFld,productDimensionFld,priceFld,totalPriceFld;
	private Button addBtn, clearBtn, StockInBtn, StockOutBtn, ShowHistoryBtn;
	
	public void start(Stage myStage)
	{
		BorderPane rootPane = new BorderPane();
		titleFld=new TextField();
		rootPane.setCenter(titleFld);

		Scene myScene = new Scene(rootPane, 400, 200);

		myStage.setScene(myScene);
    myStage.setTitle("StockForm");
    
    myStage.show();
	}
}
