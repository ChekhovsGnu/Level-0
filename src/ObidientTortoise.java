import java.awt.Color;
import java.awt.print.Printable;

import javax.swing.JOptionPane;

import org.teachingextensions.logo.PenColors;
import org.teachingextensions.logo.Tortoise;

public class ObidientTortoise {
	public static void main(String[] args) {
String shape = JOptionPane.showInputDialog("What shape would you like?");
String userColor = JOptionPane.showInputDialog("What color do you want?");
String color = ("Color." + userColor);
Tortoise.setPenColor(Color.getColor(color));
Tortoise.setSpeed(10);
if (shape.equalsIgnoreCase("square")){
	drawSquare();
}
if (shape.equalsIgnoreCase("triangle")){
	drawTriangle();
}
if (shape.equalsIgnoreCase("circle")){
	drawCircle();
}
	}
static void drawSquare(){
	for (int i = 0; i<4; i++){
		Tortoise.move(100);
		Tortoise.turn(90);
	}
}
static void drawTriangle(){
	for (int u = 0; u<3; u++){
		Tortoise.move(100);
		Tortoise.turn(90);
	}
}
static void drawCircle(){
	for (int o = 0; o<360; o++){
		Tortoise.move(1);
		Tortoise.turn(1);
	}
}
}
