package domain;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;

public class Bank implements Serializable {
	private String name;
	private HashMap<Integer, Konto> konten = new HashMap<>();
	private int kontozähler;
	
	public Bank(String name) {
		this.name = name;
		this.kontozähler = -1; // ?
	}
	
	/**
	 * 
	 * 
	 * @param name: Kontoinhaber / auswahl: 1=
	 * @return Kontonummer
	 */
	public int addKonto(String name, int auswahl, int dispo) { 
		Konto k;

		if (auswahl == 1) 
			k = new Konto(name, ++kontozähler);
		else 
			k = new Girokonto(name, ++kontozähler, dispo);
		
		konten.put(k.getKontonummer(), k);
		
		return k.getKontonummer();
	}
	
	public int addKonto(String name, int auswahl) { 
		Konto k;

		if (auswahl == 1) 
			k = new Konto(name, ++kontozähler);
		else 
			k = new Girokonto(name, ++kontozähler);
		
		konten.put(k.getKontonummer(), k);
		
		return k.getKontonummer();
	}
	
	public String getName() {
		return name;
	}
	
	/**
	 * Gibt alle values von den Konten zurück
	 */
	public Collection<Konto> getKontenliste() {
		return konten.values();
	}

	/**
	 * 
	 * @param kontonummer
	 * @return Konto 
	 */
	public Konto findeKonto(int kontonummer) {
		return konten.get(kontonummer);
	}
	
}
