package facade;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import domain.Bank;
import domain.Konto;

class BanksystemTest {
    
	Banksystem bs1 = new Banksystem("One"); 
	Banksystem bs2 = new Banksystem("Two"); 
	

	
	@BeforeEach
	public void setup() {
		
		bs1.kontoAnlegen("User1");
		bs1.kontoAnlegen("User2");
		
	}
	
	@Test
	void zahlung() {
	   
		Konto k1 = bs1.getKonto(1000);
	
		assertEquals("User1",bs1.getKonto(1000).getInhaber());
		assertEquals(k1,bs1.getKonto(1000));
		
		bs1.geldEinzahlen(100, k1);
		assertEquals(100,bs1.getKonto(1000).getStand());
		
		
	}

}
