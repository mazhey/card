import java.util.Random;
import java.util.Scanner;

public class CardApp {
	public static void main(String[] args) {

		String continuePlay = "";
		int response;
		int num, realnum;
		// String seeHistory;

		Scanner keyboard = new Scanner(System.in);
		System.out
				.println("Welcome to play the card game. Are you ready? (Y/N)");
		String yorn = keyboard.nextLine();
		Card theCard = new Card();
		while (yorn.toUpperCase().equals("Y")) {
			System.out.println("Which one is the ace?");
			System.out.println("##  ##  ##");
			System.out.println("##  ##  ##");
			System.out.println("1   2   3");
			num = keyboard.nextInt();
			realnum = num - 1;
			response = theCard.shuffleIt();
			System.out.println("The card you choose is " + num);
			if (realnum == response) {
				if (realnum == 0) {
					System.out.println("AA  ##  ##");
					System.out.println("AA  ##  ##");
					System.out.println("1   2   3");
					System.out
							.print("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
				} else if (realnum == 1) {
					System.out.println("##  AA  ##");
					System.out.println("##  AA  ##");
					System.out.println("1   2   3");
					System.out
							.print("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
				} else {
					System.out.println("##  ##  AA");
					System.out.println("##  ##  AA");
					System.out.println("1   2   3");
					System.out
							.print("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");
				}

			} else {
				if (response == 0) {
					System.out.println("AA  ##  ##");
					System.out.println("AA  ##  ##");
					System.out.println("1   2   3");
					System.out
							.print("Ha! Fast Eddie wins again! The ace was card number "
									+ (response + 1));
				} else if (response == 1) {
					System.out.println("##  AA  ##");
					System.out.println("##  AA  ##");
					System.out.println("1   2   3");
					System.out
							.print("Ha! Fast Eddie wins again! The ace was card number "
									+ (response + 1));

				} else {
					System.out.println("##  ##  AA");
					System.out.println("##  ##  AA");
					System.out.println("1   2   3");
					System.out
							.print("Ha! Fast Eddie wins again! The ace was card number "
									+ (response + 1));

				}
			}
			System.out.println();
			System.out.println("Would you like to continue? (Y/N)");
			yorn = keyboard.next();
		}

	}
}
