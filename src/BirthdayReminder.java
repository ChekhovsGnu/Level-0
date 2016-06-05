import javax.swing.JOptionPane;

public class BirthdayReminder {

	public static void main(String[] args) {
	
		// 1. correct the birthdays for your family below
		String momsBirthday = "July 25th";
		String dadsBirthday = "January 9th";
		String myBirthday = "May 10th";

		// 2. Find out which birthday the user wants and and store their response in a variable
		String request = JOptionPane.showInputDialog("Who's birthday do you want?");
	
		// 3. Print out what the user typed
		System.out.println(request);
		
		// 4. if user asked for "mom"
			//print mom's birthday
		if (request.equalsIgnoreCase("mom")){
		System.out.println(momsBirthday);
		// 5. if user asked for "dad"
			// print dad's birthday
		}
		else if (request.equalsIgnoreCase("dad")){
		System.out.println(dadsBirthday);
		}		
		else if (request.equalsIgnoreCase("loren")){
		System.out.println(myBirthday);
		}
		else{
		System.out.println("Sorry, I don't know that person's birthday");
		}
		}
	} 