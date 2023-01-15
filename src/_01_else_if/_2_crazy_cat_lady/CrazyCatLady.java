
package _01_else_if._2_crazy_cat_lady;

import java.net.URI;

import javax.swing.JOptionPane;
import javax.xml.bind.ParseConversionEvent;

public class CrazyCatLady {
	public static void main(String[] args) {
		
		// 1. Ask the user how many cats they have
		String question = JOptionPane.showInputDialog("How many cats do you have?");
		// 2. Convert their answer into an int
				int questionAsint = Integer.parseInt(question);
		// 3. If they have 3 or more cats, tell them they are a crazy cat lady
				if (questionAsint >= 3) {
					JOptionPane.showMessageDialog(null, "You are a crazy cat lady!");
				}
		// 4. If they have less than 3 cats AND more than 0 cats, call the method below to show them a cat video
				else if(questionAsint < 3) {
					
				}
		//    Hint: You can use the && operator 
		// 5. If they have 0 cats, show them a video of A Frog Sitting on a Bench Like a Human
		
		
		
		
		
		
	}

	static void playVideo(String videoURL) {
		try {
			URI uri = new URI(videoURL);
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

