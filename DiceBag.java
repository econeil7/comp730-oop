package HW6;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

// This class holds the dice(or tokens) to be drawn.
//
public class DiceBag {
	private List<Token> bag = new ArrayList<Token>();
	
	public void addToken(Token t) {
		bag.add(t);
	}

	public Token drawToken() {
		int upperRange = bag.size();
		Token t = null;
		int die = ThreadLocalRandom.current().nextInt(1, upperRange);
		if (upperRange > 1 ) {
			t = bag.remove(die);
		}
		return t;
	}
	
	public String toString() {
		String ret = " Dice left: " + bag.size() + "\n";
		
		for (Token t:bag) {
			ret += t.toString() + "\n";
		}
		
		return ret;
	}
	
	// New method for testing
	public boolean isEmpty() {
		if (bag.isEmpty()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Another new method for testing
	public String getColorsInBag() {
		int red = 0;
		int blue = 0;
		for (int i=0; i<bag.size(); i++) {
			if (bag.get(i) instanceof OrderDie) {
				OrderDie od = (OrderDie) bag.get(i);
				if (od.getColor().equals("blue")) {
					blue++;
				}
				else if (od.getColor().equals("red")) {
					red++;
				}
			}
		}
		return "Blue: " + blue + "\nRed: " + red;
	}
}
