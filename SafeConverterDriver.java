/*
 * author: Michael Wang
 * date created:March 22 2016
 * classname: SafeConverterDriver.java
 * function: To create a GUI for a Converter for temperature. 
 */

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SafeConverterDriver {
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Temperature Converter");
		SafeConverter converter = new SafeConverter();
		
		frame.getContentPane().add(converter.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}

}
