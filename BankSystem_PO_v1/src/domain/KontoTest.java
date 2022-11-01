package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class KontoTest {

	@Test
	void atribute() {
		Konto k1 = new Konto("John");
		Konto k2 = new Konto("Peter");
		
		assertEquals("John",k1.getInhaber());
		assertEquals("Peter",k2.getInhaber());
		
		k1.setInhaber("James");
		
		assertEquals("James",k1.getInhaber());
		
		assertNotNull(k1);
		assertNotNull(k2);
		
		assertEquals(1000,k1.getKontonummer());
		assertEquals(1001,k2.getKontonummer());
		
		assertEquals(2,k1.getKontozähler());
		assertEquals(2,k2.getKontozähler());
	}
	

}
