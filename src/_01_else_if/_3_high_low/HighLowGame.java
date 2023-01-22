
package _01_else_if._3_high_low;

import java.awt.print.Printable;
import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
	
		int random = new Random().nextInt(100);
		
		for (int i = 0; i <= 10; i++) {
			String response = JOptionPane.showInputDialog("Guess a number!");
		
				// 1. Ask the user for a guess using a pop-up window, and save their response 
				// 2. Print out the random variable above
	
				// 3. Change this line to give you a random number between 1 - 100. 
		int responseAsint = Integer.parseInt(response);
				// 4. Convert the users’ answer to an int (Integer.parseInt(string))
					
					// 5. if the guess is correct
		if (responseAsint == random) {
			JOptionPane.showMessageDialog(null, "You Win!!!");
			System.exit(0);
		}
		if (responseAsint > random) {
			JOptionPane.showMessageDialog(null, "Your guess is too high.");
		}
		if (responseAsint < random) {
			JOptionPane.showMessageDialog(null, "Your guess is too low.");
		}

// 6. Win

			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		// 7. if the guess is high
			// 8. Tell them it's too high
		// 9. if the guess is low
			// 10. Tell them it's too low
	// 11. Repeat steps 1 to 10 ten times
	// 13. Tell them they lose
	
		}
JOptionPane.showMessageDialog(null, "You lose");
	}

}
