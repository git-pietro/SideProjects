package domain;

import java.io.Serializable;

//Nur mit Girokonto sind überweisungen möglich
public class Girokonto extends Konto implements Serializable {

	private int dispo;
	

	public Girokonto(String inhaber, int kontozähler, int dispo) {
		super(inhaber, kontozähler);
		this.dispo = (dispo * -1);
	}

	public Girokonto(String inhaber, int kontozähler) {
		super(inhaber, kontozähler);
		this.dispo = 0;

	}

	public boolean überweise(Girokonto ziel, long betrag, String zweck) {
		if (super.getKontostand() - betrag >= 0) {
			this.auszahlen(betrag, zweck, "Überweisungsausgang", super.getInhaber());
			ziel.einzahlen(betrag, zweck, "Überweisungseingang", super.getInhaber());

			return true;
		} else if (Math.abs(super.getKontostand() - betrag) <= dispo) {
			this.auszahlen(betrag, zweck, "Überweisungsausgang", super.getInhaber());
			ziel.einzahlen(betrag, zweck, "Überweisungseingang", super.getInhaber());
			return true;
		} else {
			return false;
		}

	}

	@Override
	public boolean auszahlen(long betrag, String zweck, String art, String auftraggeber) {
     
		if (stand - betrag >= 0) {
			stand -= betrag;

			kontobewegungen.add(new Kontobewegung(betrag * -1, zweck, art, auftraggeber));

			return true;
		}
		else if(dispo != 0) {
			
			if(stand - betrag >= dispo) {
				stand -=betrag;
				kontobewegungen.add(new Kontobewegung(betrag * -1, zweck, art, auftraggeber));
			     return true;
			}
			return false;
			
		}

		return false;

	}

	// Nimmt die ToString von Konto und fügt davor "Giro-" hinzu
	@Override
	public String toString() {
		return "Giro-" + super.toString();
	}

}
