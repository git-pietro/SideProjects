package Fly;

public class FlugEigenschaften {
	
	private String name;
	private double geschwindigkeit;
	private double gewicht;
	
	
	public FlugEigenschaften(String name, double geschwindigkeit, double gewicht) {
		super();
		this.name = name;
		this.geschwindigkeit = geschwindigkeit;
		this.gewicht = gewicht;
	}
	
	public double zeit(int strecke) {
		double zeit=0;
		
		return zeit = (strecke/this.geschwindigkeit);
	}


	public String getName() {
		return name;
	}


	public double getGeschwindigkeit() {
		return geschwindigkeit;
	}


	public double getGewicht() {
		return gewicht;
	}
	
	


}
