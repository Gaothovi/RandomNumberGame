import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class RandomNumberGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random rand = new Random();
		int randomNumber = rand.nextInt(101);
				
		Scanner input = new Scanner(System.in);
		
		int tryCount=0;
		while(true) {
			String numberPlayer1 = JOptionPane.showInputDialog(null, "Write a number between 0 and 100");
			int numberPlayer = Integer.parseInt(numberPlayer1);
			tryCount++;
			if(randomNumber == numberPlayer) {
				JOptionPane.showMessageDialog(null, "You guessed right! Good job!");
				break;
			}
			else if(randomNumber > numberPlayer) {
				JOptionPane.showMessageDialog(null, "Your guess is lower. Try again!");
				
			}
			else {
				JOptionPane.showMessageDialog(null, "Your guess is higher. Try again.");
				
			}
			
		}
		JOptionPane.showMessageDialog(null, "It took you " + tryCount + " guesses");
		input.close();
		
	}

}

