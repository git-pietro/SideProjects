package JUN;

import static org.junit.Assert.*;

import org.junit.Test;

public class wordCounterTest {

	@Test
	public void test() {
		wordCounter test = new wordCounter();
		int output = test.counter("hello");
		int output2 = test.counter("lol");
		int output3 = test.counter("b");
		
		assertEquals(5, output);
		assertEquals(3, output2);
		assertEquals(1, output3);
	}

}
