package Abstracts;

public abstract class Samsung {
	
	private int herstellungsJahr;
	private String produktTyp;
	private double preis;
	private int produktNummer;
	
	Samsung(){	//Standartkonstrukter erstellen um erreor zu vermeiden
	}
	
	public Samsung(int herstellungsJahr, String produktTyp, double preis, int produktNummer) {
		super();
		this.herstellungsJahr = herstellungsJahr;
		this.produktTyp = produktTyp;
		this.preis = preis;
		this.produktNummer = produktNummer;
	}
	
	public void getPreis(int produktNummer){
		if(produktNummer == this.produktNummer) {
			System.out.println(this.preis);
		}
		else {
			System.out.println("Produktnummer falsch.");
		}
	}
	
	public void setPreis(int rabatt) {
		this.preis -= rabatt;
		System.out.println("Neuer Preis: "+(this.preis));
	}
	
	
	
	
	
}
