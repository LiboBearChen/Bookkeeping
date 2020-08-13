/**
 * Program Name: stockOutForm.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 2, 2020
 */
package view;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

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
public class StockForm extends JFrame
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