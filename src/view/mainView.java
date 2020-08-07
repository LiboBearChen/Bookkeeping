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


/**
 * @author Libo
 *
 */



public class MainView extends Application
{
	private InvoiceInForm invoiceInForm;
	private Button btn;
	
	public void start(Stage myStage)
	{
		btn = new Button("InvoiceInForm");
		btn.setOnAction(e-> buttonClicked() );
		

		BorderPane rootPane = new BorderPane();

		rootPane.setCenter(btn);

		Scene myScene = new Scene(rootPane, 400, 200);

		myStage.setScene(myScene);
    myStage.setTitle("Bookkeeping");
    
    myStage.show();	
		
	}
	
	public void buttonClicked()
	{
		
		launch();
	
	}

	
	
	public static void main(String[] args)
	{
		launch();
	}
}
