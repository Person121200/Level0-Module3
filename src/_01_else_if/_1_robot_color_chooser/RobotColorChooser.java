
package _01_else_if._1_robot_color_chooser;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

import java.awt.Color;
import java.util.Random;



public class RobotColorChooser {
	public static void main(String[] args) {
		
		//1. Create a new Robot
		Robot Bob = new Robot();
		Random r = new Random();
	    //2. Make the robot draw a shape (this will take more than one line of code)
		for (int i = 0; i<= 100; i++){
		String a = JOptionPane.showInputDialog( "Which color pen would you like to draw with?");
		if (a.equals("red")) {
			Bob.setPenColor(Color.red);
		}
		else if (a.equals("blue")) {
			Bob.setPenColor(Color.blue);
		}
		else if (a.equals("green")) {
			Bob.setPenColor(Color.green);
		}
		else if (a.equals("black")) {
			Bob.setPenColor(Color.black);
		}
		else if (a.equals("pink")) {
			Bob.setPenColor(Color.pink);
		}
		else if (a.equals("purple")) {
			Bob.setPenColor(Color.magenta);
		}
		else if (a.equals("yellow")) {
			Bob.setPenColor(Color.yellow);
		}
		else if (a.equals("")) {
			Bob.setPenColor(r.nextInt(256),r.nextInt(256),r.nextInt(256));
		}
		else {
			JOptionPane.showMessageDialog(null, "sorry your color is invalid");
			break;
		}
		
		Bob.penDown();
		Bob.setPenWidth(10);
		Bob.setSpeed(25);
		Bob.move(200);
		Bob.turn(90);
		Bob.move(200);
		Bob.turn(90);
		Bob.move(200);
		Bob.turn(90);
		Bob.move(200);
		

		//3. Set the pen width to 10
		//4. Ask the user what color pen they would like the robot to draw with
		//5. Use an if/else statement to set the pen color that the user requested
        //6. If the user doesn't enter anything, choose a random color
        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		

		


		}
	}
}
