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

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Libo
 *
 */
public class StockForm extends Application
{
	private Label titleLbl, companyNameLbl,productNameLbl,productDimensionLbl,priceLbl,totalPriceLbl;
	private TextField titleFld, companyNameFld,productNameFld,productDimensionFld,priceFld,totalPriceFld;
	private Button addBtn, clearBtn, StockInBtn, StockOutBtn, ShowHistoryBtn;
	
	public void init()
	{
		//opening a connection to a database, or populating a ComboBox
	}
	
	public void start(Stage myStage)
	{
		addBtn = new Button("Add");
		addBtn.setOnAction(e-> buttonClicked() );
		clearBtn = new Button("Clear");
		clearBtn.setOnAction(e-> buttonClicked() );
		StockInBtn = new Button("Stock In");
		StockInBtn.setOnAction(e-> buttonClicked() );
		StockOutBtn = new Button("Stock Out");
		StockOutBtn.setOnAction(e-> buttonClicked() );
		ShowHistoryBtn = new Button("Show History");
		ShowHistoryBtn.setOnAction(e-> buttonClicked() );
		
		HBox hBox = new HBox();
		hBox.getChildren().addAll(addBtn, clearBtn, StockInBtn, StockOutBtn, ShowHistoryBtn);
		
		BorderPane rootPane = new BorderPane();
		rootPane.getStyleClass().add("rootPane");
		rootPane.setBottom(hBox);

		Scene myScene = new Scene(rootPane, 400, 200);
		myScene.getStylesheets().add("StockForm.css");
		
		myStage.setScene(myScene);
		myStage.setTitle("Stock Form");    
		myStage.show();	
	}
	
	public void stop()
	{
		//
	}//end stop
	
	public static void main(String[] args)
	{
		launch();
	}
}
