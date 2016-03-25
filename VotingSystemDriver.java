/*
 * author: Michael Wang
 * date created:March 24 2016
 * classname: VotingSystemDriver.java
 * function: To create a GUI gor voting system for choosing between 4 canidates. 
 */

import javax.swing.JFrame;

public class VotingSystemDriver {
	private static void createAndDisplayGUI()
	{
		JFrame frame = new JFrame("Voting System");
		VotingSystem voter = new VotingSystem();
		
		frame.getContentPane().add(voter.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args)
	{
		createAndDisplayGUI();
	}


}
