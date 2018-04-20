import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class EvilPolygonsChallenge {

	public static void main(String[] args) {
		// 1. Create a robot
		Robot robot = new Robot();
		// 2. Set the speed to 100
		robot.setSpeed(100);
		int colorChoice = JOptionPane.showOptionDialog(null, "Choose a color.", "Color Chooser",
				JOptionPane.INFORMATION_MESSAGE, JOptionPane.DEFAULT_OPTION, null,
				new String[] { "Red", "Green", "Blue" }, 0);

		// 3. Set the pen color of the robot according to the value of the colorChoise
		// variable
		if (colorChoice == 0) {
			robot.setPenColor(175, 0, 0);
		} else if (colorChoice == 1) {
			robot.setPenColor(0, 175, 0);
		} else if (colorChoice == 2) {
			robot.setPenColor(0, 0, 175);
		}
		// 4. Ask the use how many polygons they want to be drawn.
		String poly = JOptionPane.showInputDialog("How many polygons do you want to be drawn?");
		int polyNum = Integer.parseInt(poly);
		// 5. Use the robot to draw the number of polygons the user requested.
		for (int i = 0; i < polyNum; i++) {
			robot.hide();
			robot.penDown();
			drawPoly(robot);
			robot.penUp();
			robot.move(55);
		}
		// 6. Make it so your shapes do not overlap

		// 7. Challenge: add more colors to the Option Dialog.
	}

	static void drawPoly(Robot robot) {
		robot.move(50);
		robot.turn(90);
		robot.move(50);
		robot.turn(90);
		robot.move(50);
		robot.turn(90);
		robot.move(50);
		robot.turn(90);
	}
}
