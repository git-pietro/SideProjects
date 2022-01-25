package Things;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.Test;

class MainOneClass_TEST {

	
	@Test
	@Disabled //TestControlle deaktivieren
	void TestControle() {
		fail("Fehlgeschlagen");
	}
	
	@Test
	void MainTest() {
		
		MainOne t = new MainOne();
		
	    
		assertFalse(t.isWhat(false));
		assertTrue(t.isWhat(true));
		assertFalse(t.alwaysFalse());
		assertNull(t.nullP(0));
		
		int testRes1 = t.plus(5, 4);
		//5+4=9
		assertEquals(9, testRes1);
		//Wird erwatert, bei der asuführung.
		
		int testRes2 = t.negativ(8, 5);
		int testRed3 = t.negativ(1, 3);
		assertEquals(3, testRes2);
		assertEquals(-2, testRed3);
		
		int testRed4 = t.negativNull(5, 10);
		assertEquals(0, testRed4);
		
		assertSame(t.identisch1(), t.identisch2());
		//assertNotEquals()
		//Geben das gleiche zurück
		
		
		
		
		
		
	}

}
