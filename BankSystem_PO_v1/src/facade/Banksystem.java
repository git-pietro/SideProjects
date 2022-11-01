package facade;

import java.util.Collection;
import java.util.HashMap;

import domain.*;

public class Banksystem {
	private Bank bank;
	

	public Banksystem(String bankname) {
		this.bank = new Bank(bankname);
	}
	

	public int kontoAnlegen(String name) {
		Konto k = new Konto(name);
		bank.addKonto(k);

		return k.getKontonummer();
	}
	
	public long standAufruf(int nummer) {
		Konto konto = this.bank.konten.get(nummer);
		return konto.getStand();
	}

	public Konto getKonto(int nummer) {
		return bank.konten.get(nummer);
	}

	public void geldEinzahlen(long betrag, Konto konto) {
		konto.log.addLast(konto.date+"  + "+betrag);
		konto.setStand(betrag + konto.getStand());

	}
	
	public void geldAuszahlen(long betrag, Konto konto) {
		konto.setStand(konto.getKontonummer()-betrag);
		konto.log.addLast(konto.date+"  - "+betrag);
	}
	
	public void deleteKonto(Konto konto) {
		konto=null;
	}
	
	public void printKontoauszug(Konto konto) {
		System.out.println(konto.log);
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
}
