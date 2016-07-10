import javax.swing.JOptionPane;

public class AreYouHappy {

	public static void main(String[] args) {
		int ans1 = JOptionPane.showConfirmDialog(null, "Are you happy?");
		if (ans1 == 0) {
			JOptionPane.showMessageDialog(null, "Keep doing whatever you're doing.");
		} else {
			int ans2 = JOptionPane.showConfirmDialog(null, "Do you want to be happy?");
			if (ans2 == 0){
				JOptionPane.showMessageDialog(null, "Change something.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Keep doing what you're doing");
			}
		}
	}
}
