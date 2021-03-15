package HW6;

import static org.junit.Assert.*;

import org.junit.Test;

public class orderDieTest {

	@Test
	public void test() {
		DiceBag db = new DiceBag();
		db.addToken(new OrderDie("An order die", "blue"));
		String output = db.toString();
		assertEquals(" Dice left: 1\nAn order die\n", output);
	}

}
