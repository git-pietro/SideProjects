package domain;

import java.io.Serializable;
import java.util.Date;

public class Kontobewegung implements Serializable {
	private long betrag;
	private Date datum;
	private String betreff;
	private String art;
	private String auftraggeber;
	
    /**
     * 
     * Kontobewegungen für Kontoauszüge, jedes Konto hat eine eigene Kontobewegung damit auch ArrayList
     */
	public Kontobewegung(long betrag, String betreff, String art, String auftraggeber) {
		this.betrag = betrag;
		this.betreff = betreff;
		this.art = art;
		this.auftraggeber = auftraggeber;
		
		this.datum = new Date();
	}
	

	

	@Override
	public String toString() {
		return "Kontobewegung [betrag=" + betrag + ", datum=" + datum + ", betreff=" + betreff + ", art=" + art
				+ ", auftraggeber=" + auftraggeber + "]";
	}
	
}
