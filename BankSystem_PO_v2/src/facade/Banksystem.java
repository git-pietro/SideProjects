package facade;

import java.util.Collection;

import domain.*;
import infrastructure.*;

public class Banksystem {
	private Bank bank;

	public Banksystem(String bankname) throws Exception {
		if (Persistenz.sindDatenGespeichert(bankname))
			this.bank = (Bank) Persistenz.ladeBankDaten(bankname);
		else
			this.bank = new Bank(bankname);
	}
   
	public int kontoAnlegen(String name, int auswahl, int dispo) throws Exception {
		int kontonummer = bank.addKonto(name, auswahl, dispo);
		
		Persistenz.speichereBankDaten(this.bank, bank.getName());

		return kontonummer;
	}
	
	public int kontoAnlegen(String name, int auswahl) throws Exception {
		int kontonummer = bank.addKonto(name, auswahl);
		
		Persistenz.speichereBankDaten(this.bank, bank.getName());

		return kontonummer;
	}

	public String[] getKontenliste() {
		Collection<Konto> konten = bank.getKontenliste();
		String[] liste = new String[konten.size()];

		int i = 0;
		for (Konto k : konten) {
			liste[i++] = k.toString(); 
		}

		return liste;
	}

	public String getBankname() {
		return bank.getName();
	}
	
	

	public long geldEinzahlen(int kontonummer, long betrag) throws Exception {
		Konto konto = bank.findeKonto(kontonummer);
		konto.einzahlen(betrag, "Einzahlung am Schalter", "Einzahlung", konto.getInhaber());

		Persistenz.speichereBankDaten(this.bank, bank.getName());
		
		
		return konto.getKontostand();
	}

	public boolean geldAuszahlen(int kontonummer, long betrag) throws Exception {
		Konto konto = bank.findeKonto(kontonummer);
		
		Persistenz.speichereBankDaten(this.bank, bank.getName());

		return konto.auszahlen(betrag, "Auszahlung am Schalter", "Auszahlung", konto.getInhaber());
	}

	public String[] erstelleKontoauszug(int kontonummer) {
		Konto konto = bank.findeKonto(kontonummer);

		return konto.getKontobewegungen();
	}

	public boolean überweisungBeauftragen(int startkonto, int zielkonto, long betrag, String verwendungszweck) {
		Konto start = bank.findeKonto(startkonto);
		Konto ziel = bank.findeKonto(zielkonto);

		if (start instanceof Girokonto && ziel instanceof Girokonto) {
			return ((Girokonto)start).überweise((Girokonto)ziel, betrag, verwendungszweck);
		}

		return false;
	}

	public long getKontostand(int kontonummer) {
		Konto konto = bank.findeKonto(kontonummer);

		return konto.getKontostand();
	}

}
