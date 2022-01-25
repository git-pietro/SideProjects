package Contacts;

public class Kontakte {
	
	
	private String name;
	private int telefonNummer;
	
	Kontakte(){
	}
	
	
	public Kontakte(String name, int telefonNummer) {
		super();
		this.name = name;
		this.telefonNummer = telefonNummer;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTelefonNummer() {
		return telefonNummer;
	}
	public void setTelefonNummer(int telefonNummer) {
		this.telefonNummer = telefonNummer;
	}
	
	//Dies braucht static! Mit static kann man Methoden aufrufen ohne ein Object dafür zu erstellen,
	
	public static Kontakte erstelleKontakt(String name, int telefonNummer) {
		
		 Kontakte kontakt = new Kontakte(name,telefonNummer);
		 
		 return kontakt;
	}
}
