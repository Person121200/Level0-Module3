package _01_else_if._4_are_you_happy;
import javax.swing.JOptionPane;


public class AreYouHappy {
	public static void  main(String[] args) {
		
		String happy = JOptionPane.showInputDialog("Are you happy?");
		
		if (happy.equals("yes")){
		JOptionPane.showMessageDialog(null, "Keep doing whatever your doing! ");
		}
			if (happy.equals("no")) {
				String hello = JOptionPane.showInputDialog("Do you wanna be happy?");
			
		
			if (hello.equals("yes")) {
				JOptionPane.showMessageDialog(null, "Change Something!");
			}
				if (hello.equals("no")) {
					JOptionPane.showMessageDialog(null, "Keep doing whatever your doing!");
				
				}
			}
	}
}
