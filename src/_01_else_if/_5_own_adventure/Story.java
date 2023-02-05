package _01_else_if._5_own_adventure;
import javax.swing.JOptionPane;

public class Story {
public static void main(String[] args) {
JOptionPane.showMessageDialog(null, "You are hiking a mountain");
String a = JOptionPane.showInputDialog("You can jump off the mountain or you can continue hiking, which one will you pick?");
if (a.equals("jump off the mountain")) {
	JOptionPane.showMessageDialog(null, "You jump of the mountain and you die!");
	JOptionPane.showMessageDialog(null, "You wake up and see god in fromt of you, he is angry and you are placed in eternal torture!");
	JOptionPane.showMessageDialog(null, "You wake up and your hiking a mountain...");
}
if (a.equals("continue hiking")) {
	JOptionPane.showMessageDialog(null, "You reach the top of the mountain");
	JOptionPane.showMessageDialog(null, "You are lifted by a light breeze and you fall off the mountain, YOU LOSE!");
	JOptionPane.showMessageDialog(null, "You wake up in heaven and see god, he is angry and places you in eternal torture!");
	JOptionPane.showMessageDialog(null, "You wake up and its all just a dream!!!");
}
}
}