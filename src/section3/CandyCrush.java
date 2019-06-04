package section3;

import javax.swing.JOptionPane;

public class CandyCrush {

	public static void main(String[] args) {
		// 1. Using a pop-up, ask the user who they don't like
		String bobby = JOptionPane.showInputDialog(null, "who do you hate");
		// 2. Change the next line so that the pop-up will tell them they have a crush on that person
		JOptionPane.showMessageDialog(null, "You totally have a crush on Java!");
		// 3. Ask the user for the name of their best friend

		String joe = JOptionPane.showInputDialog(null, "who is ya bestie");
		// 4. Tell them their best friend is as sweet as candy
String kid = JOptionPane.showInputDialog(null, "joes bestie is as sweet as a sugar free gluten free grass cake in the form of candy");
	} 
}



