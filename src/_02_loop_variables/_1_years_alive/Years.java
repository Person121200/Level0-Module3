package _02_loop_variables._1_years_alive;
import javax.swing.JOptionPane;

public class Years {
public static void main(String[] args) {
	
	String age = JOptionPane.showInputDialog("How old are you?");
	int ageAsint = Integer.parseInt(age);
	System.out.println("original: "+ageAsint);
	
	for (int i = ageAsint; i >= 0; i--) {
		System.out.println("before --: "+ageAsint);
		int a = 2022-i;
		System.out.println("after --: "+ageAsint);

		JOptionPane.showMessageDialog(null, a);

	}
}
}
