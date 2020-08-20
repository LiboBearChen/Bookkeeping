/**
 * Program Name: invoiceOutForm.java
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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
public class InvoiceOutForm extends Application
{
	private Label titleLbl, companyNameLbl,productNameLbl,productDimensionLbl,priceLbl,totalPriceLbl;
	private TextField titleFld, companyNameFld,productNameFld,productDimensionFld,priceFld,totalPriceFld;
	private Button addBtn, clearBtn;
	
	public void init()
	{
		//opening a connection to a database, or populating a ComboBox
	}
	
	public void start(Stage myStage)
	{
		ButtonListener buttonListener = new ButtonListener();
		
		addBtn = new Button("Add");
		addBtn.setOnAction(buttonListener);
		clearBtn = new Button("Clear");
		clearBtn.setOnAction(buttonListener);

		
		HBox hBox = new HBox();
		hBox.getChildren().addAll(addBtn,clearBtn);
		
		BorderPane rootPane = new BorderPane();
		rootPane.getStyleClass().add("rootPane");
		rootPane.setBottom(hBox);

		Scene myScene = new Scene(rootPane, 400, 200);
		myScene.getStylesheets().add("InvoiceForm.css");
		
		myStage.setScene(myScene);
		myStage.setTitle("Invoice Out Form");    
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

			}
			else if(ev.getSource() == clearBtn)
			{

			}

		}
  }
	
	public static void main(String[] args)
	{
		launch();
	}

}
