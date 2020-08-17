/**
 * Program Name: mainView.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 2, 2020
 */
package view;


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class MainView extends Application
{
	private InvoiceInForm invoiceInForm;
	private Button InvoiceBtn, StockBtn;
	Stage mainStage, stockFormStage, InvoiceFormStage;
	
	public void init()
	{
		//opening a connection to a database, or populating a ComboBox
	}
	
	public void start(Stage mainStage)
	{
				
		InvoiceBtn = new Button("InvoiceForm");
		InvoiceBtn.setOnAction(e-> buttonClicked() );
		StockBtn = new Button("StockForm");
		StockBtn.setOnAction(e-> buttonClicked() );
		
		HBox hBox = new HBox();
		hBox.getChildren().add(InvoiceBtn);
		hBox.getChildren().add(StockBtn);

		BorderPane rootPane = new BorderPane();
		rootPane.getStyleClass().add("rootPane");
		rootPane.setBottom(hBox);

		Scene myScene = new Scene(rootPane, 400, 200);
		myScene.getStylesheets().add("MainView.css");
		
		mainStage.setScene(myScene);
		mainStage.setTitle("Bookkeeping");    
		mainStage.show();	
		
	}
	
	public void buttonClicked()
	{		
		new StockForm();	
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
