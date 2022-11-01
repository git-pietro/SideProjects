package domain;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BankTest {

	@Test
	void atribute() {
		
		Bank b1 = new Bank("Bank One");
		Bank b2 = new Bank("World Bank");
		
		Konto k1 = new Konto("Peter");
		Konto k2 = new Konto("John");
		
		b1.addKonto(k1);
		b1.addKonto(k2);
		
		assertTrue(b1.konten.get(1000).equals(k1));
		assertTrue(b1.konten.get(1001).equals(k2));
		
		b1.konten.remove(k2);
		
		assertNull(b1.konten.get(k2));
		
		assertEquals(2,b1.konten.size());
		assertEquals(0,b2.konten.size());
		
	}

}
