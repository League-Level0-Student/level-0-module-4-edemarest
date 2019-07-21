package _06_test_scores;

import javax.swing.JOptionPane;

public class Test_scores {

	public static void main(String[] args) {
		
		String written = JOptionPane.showInputDialog("What is your test score?");
		double score = Double.parseDouble(written);
		
		if (score > 89.5) {
			JOptionPane.showMessageDialog(null, "Good job! You got an A!");
		}
		if (score > 79.5 && score <89.5) {
			JOptionPane.showMessageDialog(null, "Good job! You got a B!");
		}
		if (score > 69.5 && score < 79.7) {
			JOptionPane.showMessageDialog(null, "You got a C. Study harder next time!");
		}
		if (score > 59.5 && score < 69.5) {
			JOptionPane.showMessageDialog(null, "You got a D. Try harder.");
		}
		if (score < 50) {
			JOptionPane.showMessageDialog(null, "You suck");
		}
	}
	
}
