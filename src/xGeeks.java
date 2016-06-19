import javax.swing.JOptionPane;

/*
 * Everyone has a superpower. Mine is writing recipes. This program will store
 * the superpowers of all the people in the classroom. E.g. When I type "June",
 * your program should say "June's superpower is writing recipies".
 */
public class xGeeks {
public static void main(String[] args) {

String powerLoren = "Apathy";		// 1. Save the superpower for each person in a variable.

		// 2. Ask the user to enter a name. Store their answer in a variable.
String enterName = JOptionPane.showInputDialog("Enter a name.");
		// 3. Show the superpower in a pop-up, depending on the name entered. 
if (enterName.equals("Loren")){
	JOptionPane.showMessageDialog(null, powerLoren);;
}
	}
}

