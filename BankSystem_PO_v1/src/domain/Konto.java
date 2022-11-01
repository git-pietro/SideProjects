package domain;

import java.util.LinkedList;
import java.time.LocalDate;

public class Konto {
	private static int kontozähler = 0;

	private int nummer;
	private long stand = 0;
	private String inhaber;
	public LinkedList<String> log = new LinkedList<String>();
	public LocalDate date = LocalDate.now();

	public Konto(String inhaber) {
		nummer = 1000 + kontozähler++;
		this.inhaber = inhaber;

	}

	public int getKontonummer() {
		return this.nummer;
	}
	
	public int getKontozähler() {
		return kontozähler;
	}

	@Override
	public String toString() {
		return "Konto [nummer=" + this.nummer + ", inhaber=" + this.inhaber + " stand=" + this.stand + "]";
	}

	public long getStand() {
		return this.stand;
	}
	
	public String getInhaber() {
		return this.inhaber;
	}
	
	public void setInhaber(String inhaber) {
		this.inhaber = inhaber;
	}

	public void setStand(long stand) {
		this.stand = stand;
	}
}
