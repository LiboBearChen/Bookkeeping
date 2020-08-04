/**
 * Program Name: mainView.java
 * Purpose: put something here
 * Coder: Libo Chen
 * Date: Aug. 2, 2020
 */
package view;

import java.awt.Dimension;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.JFrame;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


/**
 * @author Libo
 *
 */
public class mainView extends JFrame
{
	public mainView()
	{
		super("BookKeeping");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(1000, 500);
		this.setLocationRelativeTo(null);
		setResizable(false);

		this.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		new mainView();
	}
}
