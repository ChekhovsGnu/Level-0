import javax.swing.JOptionPane;

public class Riddler {

		public static void main(String[] args) {
int score = 0;
String ans1 = "lass";
String ans2 = "eapot";
String ans3 = "hort";
String ans4 = "om";
String first = JOptionPane.showInputDialog("If a red house is made of red bricks, and a blue house is made of blue bricks, what is a green house made of?");
if (first.contains(ans1)){
JOptionPane.showMessageDialog(null, "Correct!");
score = score + 1;
}
else{
JOptionPane.showMessageDialog(null, "Wrong, the answer was 'Glass'.");
}
String second = JOptionPane.showInputDialog("What starts with the letter “t”, is filled with “t” and ends in “t”?");
if (second.contains(ans2)){
JOptionPane.showMessageDialog(null, "Correct!");
score = score + 1;
}
else{
	JOptionPane.showMessageDialog(null, "Wrong, the answer was 'A teapot'");
}
String third = JOptionPane.showInputDialog("What word becomes shorter when you add two letters?");
if (third.contains(ans3)){
JOptionPane.showMessageDialog(null, "Correct!");
score = score + 1;
}
else{
	JOptionPane.showMessageDialog(null, "Wrong, the answer was 'short'");
}
String fourth = JOptionPane.showInputDialog("A father and son have a car accident and are both badly hurt. They are both taken to separate hospitals. When the boy is taken in for an operation, the surgeon (doctor) says 'I can not do the surgery because this is my son'. How is this possible?");
if (fourth.contains(ans4)){
JOptionPane.showMessageDialog(null, "Correct!");
score = score + 1;
}
else{
	JOptionPane.showMessageDialog(null, "Wrong, the answer was that the doctor was his mom.");
}
			JOptionPane.showMessageDialog(null, "You got " + score + " riddles right out of 4!");
		}
	}
