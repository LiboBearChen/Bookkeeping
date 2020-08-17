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
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * @author Libo
 *
 */
public class InvoiceForm
{
	private Label titleLbl, companyNameLbl,productNameLbl,productDimensionLbl,priceLbl,totalPriceLbl;
	private TextField titleFld, companyNameFld,productNameFld,productDimensionFld,priceFld,totalPriceFld;
	private Button addBtn, clearBtn, InvoiceInBtn, InvoiceOutBtn, ShowHistoryBtn;
	
	public void start(Stage myStage)
	{
		addBtn = new Button("Add");
		addBtn.setOnAction(e-> buttonClicked() );
		clearBtn = new Button("Clear");
		clearBtn.setOnAction(e-> buttonClicked() );
		InvoiceInBtn = new Button("Invoice In");
		InvoiceInBtn.setOnAction(e-> buttonClicked() );
		InvoiceOutBtn = new Button("Invoice Out");
		InvoiceOutBtn.setOnAction(e-> buttonClicked() );
		ShowHistoryBtn = new Button("Show History");
		ShowHistoryBtn.setOnAction(e-> buttonClicked() );
		
		HBox hBox = new HBox();
		hBox.getChildren().add(addBtn);
		hBox.getChildren().add(clearBtn);
		hBox.getChildren().add(StockInBtn);
		hBox.getChildren().add(StockOutBtn);
		hBox.getChildren().add(ShowHistoryBtn);
		
		BorderPane rootPane = new BorderPane();
		rootPane.getStyleClass().add("rootPane");
		rootPane.setBottom(hBox);

		Scene myScene = new Scene(rootPane, 400, 200);
		myScene.getStylesheets().add("InvoiceForm.css");
		
		myStage.setScene(myScene);
		myStage.setTitle("Invoice Form");    
		myStage.show();	
	}
	
	public static void main(String[] args)
	{
		launch();
	}
}
