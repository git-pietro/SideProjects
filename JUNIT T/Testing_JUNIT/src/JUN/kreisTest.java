package JUN;

import static org.junit.Assert.*;

import org.junit.Test;

public class kreisTest {

	@Test
	public void test() {
		kreis test = new kreis();
		//Object der Klasse erstellen
		int output = test.kreisS(5);
		int output2 = test.kreisS(10);
		int output3 = test.kreisS(15);
		int output4 = test.kreisS(20);
		//Werte die berechnet werden
	
		assertEquals(25, output);
		assertEquals(100, output2);
		assertEquals(225, output3);
		assertEquals(400, output4);
		//Werte die raus kommen sollen
		
		assertTrue(test.begin ==5);
		assertFalse(test.begin !=5);
	}
	
	

}
