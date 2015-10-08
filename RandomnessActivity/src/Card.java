import java.util.Random;
public class Card {

	
	Random ran = new Random();
	public int shuffleIt() {
		int choice =  ran.nextInt(3);
		return choice;
	}
}
