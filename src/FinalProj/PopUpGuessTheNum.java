package FinalProj;

import java.util.Random;

import javax.swing.JOptionPane;

public class PopUpGuessTheNum {
	public static void main(String[] args) {
		Random randomNumber = new Random();
		int correctNum = randomNumber.nextInt(100);
		boolean win = false;
		String input;
		int guessedNum;
		int maxTries = 5;
		

		JOptionPane.showMessageDialog(null,
				"Hello, smartie. Welcome to your destiny."
						+ "\nYou will have 5 tries to guess the correct number within 1 to 100 inclusive."
						+ "\nWe are nice enough to tell you if the number you enter is too big or too small. "
						+ "\nHowever, if you do not figure out the number within 5 tries, YOU WILL NEED TO EXERCISE!");

		while (!win) {
			input = JOptionPane.showInputDialog("Please enter a number between 1 and 100 inclusive.");
			guessedNum = Integer.parseInt(input);
			maxTries--;

			if (guessedNum == correctNum) {
				JOptionPane.showMessageDialog(null,
						"Lucky you, you get to skip exercise today. Go home and rest and be unhealthy.");
				win = true;

			} else if (guessedNum < correctNum) {
				JOptionPane.showMessageDialog(null,
						"Too small, Try again" + " " + "You have " + maxTries + " tries left.");
			} else {
				JOptionPane.showMessageDialog(null,
						"Too big, Try again." + " " + "You have " + maxTries + " tries left.");
			}
			if (maxTries == 0) {
				break;
			}
		}
		
		// random word
		if (maxTries == 0 && !win) {
			/**
			 * String[] subject = { "I", "I", "I", "I", "I", "I", "The person to your left",
			 * "I", "I", "I", "I", "I", "I", "The person to your right", "I", "I", "I", "I",
			 * "I", "I", };
			 */
			String[] punishment = { "Push-up", "Spin around", "Run track", "Rope jumping", "High kick", "Sit-up",
					"Burpees" };
			int number = (int) (Math.random() * 50);
			
			if (number == 0) {
				number = number + (int) (Math.random() * 50);
			}
						
			Random r = new Random();
			int pickPunishment = r.nextInt(punishment.length);

			JOptionPane.showMessageDialog(null,
					"YES! Time for you to get up and exercise. Do the following or you DO NOT have dinner today!");

			JOptionPane.showMessageDialog(null,
					punishment[pickPunishment] + " " + "for" + " " + number + " " + "times");
			JOptionPane.showMessageDialog(null, "-------------DO THE EXERCISE BEFORE YOU EXIT-------------"
					+ "\nI will know if you have just exited without completing your exercise!");
		}

		System.exit(0);
	}

}
