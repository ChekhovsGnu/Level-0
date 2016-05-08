//Copyright The League of Amazing Programmers 2014
import javax.swing.JOptionPane;

/*
* I have a pocket full of change. I hate doing math. Make me a program that
* will calculate how much money I have without me having to use my brain. Then
* make me a sandwich.
*/
public class Calculator {

	public static void main(String[] args) {
		String nickels = JOptionPane.showInputDialog("How many nickels do you have?");
		int nickels2 = Integer.parseInt(nickels);
		String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
		int dimes2 = Integer.parseInt(dimes);
		String quarters = JOptionPane.showInputDialog("How many quarters do you have?");
		int quarters2 = Integer.parseInt(quarters);
		double money = (nickels2*.05)+(dimes2*.10)+(quarters2*.25);
		JOptionPane.showMessageDialog(null, "You have $" + money + "!");
	}
}

