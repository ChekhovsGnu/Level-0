import javax.swing.JOptionPane;

public class Prime {

	public static void main(String[] args) {
		boolean prime = false;
	 String number = (JOptionPane.showInputDialog("Pick a number."));
		int numberInt = Integer.parseInt(number, 10);
		for (int i = 2; i<numberInt; i++){
			if (numberInt % i == 0){
				prime = true;
			}
		}
			if (prime == true){
				JOptionPane.showMessageDialog(null, numberInt + " is not prime.");
			}
			else{
				JOptionPane.showMessageDialog(null, numberInt + " is prime.");
			}
		}
}

