import javax.swing.JOptionPane;

import org.teachingextensions.logo.Tortoise;

public class dizzyTortoise {

	public static void main(String[] args) {
		/*
		 * 1. Use the dance method to make the Tortoise spin.
		 * 
		 * 2. Ask the user how dizzy you want the tortoise from 1-10, then spin
		 * that number of times.
		 */
		String dizzyString = JOptionPane.showInputDialog("How dizzy do you want your tortoise from 1-10?");
		int dizzyInt = Integer.parseInt(dizzyString);
		dance(dizzyInt);

	}

	static void dance(int numberOfSpins) {
		for (int i = 0; i < numberOfSpins; i++) {
			Tortoise.turn(360);
		}
	}
}
