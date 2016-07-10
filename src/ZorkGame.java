import javax.swing.JOptionPane;

public class ZorkGame {

	public static void main(String[] args) {
		boolean fridgeOpen = false;
		boolean pantryOpen = false;
		boolean breadTaken = false;
		String Answer = JOptionPane.showInputDialog(null,
				"You have woken up in the middle of the night and are extremely hungry. \n You walk to your kitchen, and decide you need to make something to eat. \n Perhaps a sandwich. Yes, a glorious sandwich. \n In the kitchen you have a microwave, an oven, a toaster, a fridge, a sink, and a pantry.");
		for (int i = 1; i > 0; i++) {
			if (Answer.equalsIgnoreCase("open fridge")) {
				fridgeOpen = true;
				JOptionPane.showMessageDialog(null, "The fridge is now open.");
			} else if (Answer.equalsIgnoreCase("open pantry")) {
				pantryOpen = true;
				JOptionPane.showMessageDialog(null, "The pantry is now open.");
			} else if (Answer.equalsIgnoreCase("take bread")) {
				if (fridgeOpen == true) {
					JOptionPane.showMessageDialog(null, "You take the moldy loaf of bread out of the fridge.");
				} else {
					JOptionPane.showMessageDialog(null, "What?");
				}

			} else if (Answer.equalsIgnoreCase("Do this")) {
			} else if (Answer.equalsIgnoreCase("Examine fridge")) {
				if (fridgeOpen == true){
					JOptionPane.showMessageDialog(null, "The fridge has a jar of pickles and a loaf of moldy bread inside. Appetizing.");
				} else {
					JOptionPane.showMessageDialog(null, "A completely normal and average fridge. It is utterly uninteresting, \n and your lack of x-ray vision means you do not know what is inside.");
					}
				}
			 else {
				JOptionPane.showMessageDialog(null, "I do not understand.");
			}
			Answer = JOptionPane.showInputDialog("Now what?");
		}

	}
}
