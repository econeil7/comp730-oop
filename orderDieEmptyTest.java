package HW6;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class orderDieEmptyTest {

	@Test
	public void test() {
		DiceBag db = new DiceBag();
		db.addToken(new OrderDie("An order die", "blue"));
		assertEquals(false, db.isEmpty());
	}

}
