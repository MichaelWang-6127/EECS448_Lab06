/*
 * author: Michael Wang
 * date created:March 21 2016
 * classname: DiceDriver.java
 * function: To create a GUI for rolling a dice with user input. 
 */
import javax.swing.JFrame;
import javax.swing.JLabel;


public class DiceDriver {
	private static void createAndShowGUI() {
		JFrame frame = new JFrame("Dice Roller");
		Dice theDice = new Dice();
		
		frame.getContentPane().add(theDice.getContent());
		frame.pack();
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
        createAndShowGUI();
	}
	
}
