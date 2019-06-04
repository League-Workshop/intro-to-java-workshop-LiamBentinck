package section3;

import javax.swing.JOptionPane;

public class WorldDomination {
	
	public static void main(String[] args) {
		// 1. Ask the user if they know how to write code.
String bobby = JOptionPane.showInputDialog(null,"do you write code");
		// 2. If they say "yes", tell them they will rule the world.
if(bobby.equals("yes")){
	  JOptionPane.showMessageDialog(null, "good luck on world domination");
}
		// 3. Otherwise, wish them good luck washing dishes.
if(bobby.equals("no"));{
	JOptionPane.showMessageDialog(null, "good luck washing dishes");
}

if(bobby.equals("i am liam"));{
	JOptionPane.showMessageDialog(null, " wait, sorry, my fault, wow your EPIC");
}
	}
}

