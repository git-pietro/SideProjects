package Classes;

import Abstracts.Samsung;
import Interfaces.ITelefon;

public class GalaxyS10 extends Samsung implements ITelefon {

	public GalaxyS10(int herstellungsJahr, String produktTyp, double preis, int produktNummer) {
		super(herstellungsJahr, produktTyp, preis, produktNummer);
		
	}

	@Override
	public double aufladenZeit() {
		//Irgendeine Rechnung
		double ladeZeit = 100+2.4;
		return ladeZeit;
	}

	@Override
	public void start() {
		System.out.println("Knopf rechts open für 3s halten");
		
	}

	@Override
	public void sound() {
		System.out.println(TOUCH);
		
		
	}
	
	
	
	
	

}
