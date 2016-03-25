/*
 * author: Michael Wang
 * date created:March 21 2016
 * classname: Dice.java
 * function: To create a Dice with a given input size and roll it. 
 */
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import java.util.Random;

public class Dice {
	private JPanel panel;
	private JButton button;
	private JTextField text;
	private JLabel label;
	
	public Dice()
	{
		panel = new JPanel();
		button = new JButton("Roll");
		text = new JTextField(3);//3 cols, not 20 chars
		label = new JLabel("Input a number for the number of sides for a dice.");
		
		button.addActionListener(buttonListener());	
		
		panel.add(text);
		panel.add(button);
		panel.add(label);
	}
	
	public Component getContent()
	{
		return (panel);
	}

	private ActionListener buttonListener()
	{
		ActionListener listener = new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String input = text.getText();
				int numberSidesInt = 1;
				String newText = "";
				try
				{
					numberSidesInt = Integer.parseInt(input);//convert String to int
					Random rand = new Random();
					int  roll = rand.nextInt(numberSidesInt) + 1;
					newText = "The die has "+ numberSidesInt + " sides. Rolled a: " + roll;
				}
				catch(Exception a)
				{
					newText = "The input was not a positive integer!";
				}
				
				
				label.setText(newText);
				System.out.println(newText);
			}
		};
		
		return listener;
	}	
	
}
