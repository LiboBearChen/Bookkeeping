/**
 * Program Name: mainView.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 2, 2020
 */
package view;


import database.DatabaseConnection;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
	private DatabaseConnection dataConnect;
	private BorderPane rootPane, dashPane, infoPane;
	
	public void init()
	{
		//opening a connection to a database, or populating a ComboBox
		dataConnect = new DatabaseConnection();
	}
	
	public void start(Stage mainStage)
	{
		ButtonListener buttonListener = new ButtonListener();
		
		InvoiceBtn = new Button("InvoiceForm");
		InvoiceBtn.setOnAction(buttonListener);
		StockBtn = new Button("StockForm");
		StockBtn.setOnAction(buttonListener);
		
		HBox hBox = new HBox();
		hBox.getChildren().addAll(InvoiceBtn, StockBtn);

		rootPane = new BorderPane();
		rootPane.getStyleClass().add("rootPane");
		rootPane.setBottom(hBox);

		Scene myScene = new Scene(rootPane, 400, 200);
		myScene.getStylesheets().add("MainView.css");
		
		mainStage.setScene(myScene);
		mainStage.setTitle("Bookkeeping");    
		mainStage.show();	
		
	}
	
	private class ButtonListener implements EventHandler<ActionEvent>
  {
		@Override
		public void handle(ActionEvent ev)
		{

			if(ev.getSource()== InvoiceBtn)
			{

			}
			else if(ev.getSource() == StockBtn)
			{

			}	
		}
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
