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

import database.DatabaseConnection;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import stockModel.ProductModel;
import stockModel.StockModel;


/**
 * @author Libo
 *
 */
public class StockForm extends Application
{
	private Label titleLbl, companyNameLbl,productNameLbl,productDimensionLbl,priceLbl,totalPriceLbl;
	private TextField titleFld, companyNameFld,productNameFld,productDimensionFld,priceFld,totalPriceFld;
	private Button addBtn, clearBtn, StockInBtn, StockOutBtn, ShowHistoryBtn;
	private DatabaseConnection dataConnect;
	private StockModel stockModel;
	private ProductModel productModel;
	
	public void init()
	{
		//opening a connection to a database, or populating a ComboBox
		dataConnect = new DatabaseConnection();
		stockModel=new StockModel();
		
	}
	
	public void start(Stage myStage)
	{
		ButtonListener buttonListener = new ButtonListener();
		
		addBtn = new Button("Add");
		addBtn.setOnAction(buttonListener);
		clearBtn = new Button("Clear");
		clearBtn.setOnAction(buttonListener);
		StockInBtn = new Button("Stock In");
		StockInBtn.setOnAction(buttonListener);
		StockOutBtn = new Button("Stock Out");
		StockOutBtn.setOnAction(buttonListener);
		ShowHistoryBtn = new Button("Show History");
		ShowHistoryBtn.setOnAction(buttonListener);
		
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
	
	private class ButtonListener implements EventHandler<ActionEvent>
  {
		@Override
		public void handle(ActionEvent ev)
		{

			if(ev.getSource()== addBtn)
			{
				productModel=new ProductModel();
				
				stockModel.addProduct(productModel);
			}
			else if(ev.getSource() == clearBtn)
			{

			}
			else if(ev.getSource() == StockInBtn)
			{

			}
			else if(ev.getSource() == StockOutBtn)
			{

			}
			else if(ev.getSource() == ShowHistoryBtn)
			{

			}
			
		}
  }
	
	public static void main(String[] args)
	{
		launch();
	}
}
