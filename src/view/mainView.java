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
import javafx.stage.Stage;



public class MainView extends Application
{
	private InvoiceInForm invoiceInForm;
	private Button btn;
	Stage mainStage, stockFormStage, InvoiceFormStage;
	public void start(Stage mainStage)
	{
		btn = new Button("InvoiceInForm");
		btn.setOnAction(e-> buttonClicked() );
		

		BorderPane rootPane = new BorderPane();

		rootPane.setCenter(btn);

		Scene myScene = new Scene(rootPane, 400, 200);

		mainStage.setScene(myScene);
		mainStage.setTitle("Bookkeeping");
    
		mainStage.show();	
		
	}
	
	public void buttonClicked()
	{
		
		new StockForm();
	
	}

	
	
	public static void main(String[] args)
	{
		launch();
	}
}
