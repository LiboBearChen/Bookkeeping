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
	public void start(Stage mainStage)
	{
		HBox hBox = new HBox();
		
		InvoiceBtn = new Button("InvoiceForm");
		InvoiceBtn.setOnAction(e-> buttonClicked() );
		StockBtn = new Button("StockForm");
		StockBtn.setOnAction(e-> buttonClicked() );
		
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

	
	
	public static void main(String[] args)
	{
		launch();
	}
}
