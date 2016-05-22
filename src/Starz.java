
// Copyright Wintriss Technical Schools 2014
import org.teachingextensions.logo.Tortoise;

/*** Teacher's note ***/
/*
 * Start by reviewing the 3 pieces of a for loop (initialization, condition, increment). Do not give the students the
 * answer to the challenge.
 */

public class Starz {

	public static void main(String[] args) {

		// 1. Set the X position of the Tortoise so that it starts on the left. You also need to show the Tortoise to
		// see the result of this line.
		Tortoise.setX(100);
		Tortoise.show();
		// 2. Make the Tortoise draw a star shape. Hint: 144.
		for (int o = 0; o < 100; o++) {
			for (int i = 0; i < 5; i++) {
				Tortoise.move(30);
				Tortoise.turn(144);
			}
			Tortoise.penUp();
			Tortoise.turn(90);
			Tortoise.move(50);
			Tortoise.turn(-90);
			Tortoise.penDown();
		}

		/** THE CHALLENGE: **/
		/*
		 * Make the Tortoise draw a line of stars like this: http://bit.ly/walk-of-fame
		 * 
		 * Hint: The distance between stars is 50.
		 */

	}
}
