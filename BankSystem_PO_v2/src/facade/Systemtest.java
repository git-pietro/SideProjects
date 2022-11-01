package facade;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class Systemtest {

	private static Banksystem bs;
	
	@BeforeAll
	static void bankSystemStart() throws Exception {
		 bs = new Banksystem("Testsystem");
		
	}
	
	
	@Test
	void smokeTest() throws Exception {
		
		assertNotNull(bs);
		assertEquals(0, bs.getKontenliste().length);
		assertEquals("Testsystem", bs.getBankname());
	}
	
	@Test
	void einUausZahlung() throws Exception {
		
		
		
       int kontonummer = bs.kontoAnlegen("Olaf", 1);
	    
	    assertEquals(0,bs.getKontostand(kontonummer));
	    
	    bs.geldEinzahlen(kontonummer, 500);	    
	    assertEquals(500,bs.getKontostand(kontonummer));
	    
	    bs.geldAuszahlen(kontonummer, 100);
	    assertEquals(400,bs.getKontostand(kontonummer));
	    
	   
	   assertFalse(bs.geldAuszahlen(kontonummer, 500));
	    
	    assertEquals(600,bs.geldEinzahlen(kontonummer, 200));
	    
	    bs.getBankname();
	    
	    //TODO Datei löschen
		
	}
	
	@Test
	void einUausZahlungDispo() throws Exception{
		
	
		
	    int kontonummer = bs.kontoAnlegen("Peter", 0,500);
	    
	    bs.geldEinzahlen(kontonummer,100);
	   assertEquals(100,bs.getKontostand(kontonummer));
	    
	   bs.geldAuszahlen(kontonummer, 200);
	   assertEquals(-100,bs.getKontostand(kontonummer));
	    
		
		
	}
	
	@AfterAll //Delete the File
	static void cleanup() {
		File file = new File("C:\\Users\\pietr\\git\\Uebung_BankSystem\\BankSystem_PO/Testsystem-bank-data.ser");
		file.delete();
	}
	
}
