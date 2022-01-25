package Fly;

public class Drohne extends FlugEigenschaften implements Fliegen{

	public Drohne(String name, double geschwindigkeit, double gewicht) {
		super(name, geschwindigkeit, gewicht);
		
	}

	@Override
	public void starten() {
		System.out.println("Nach oben dann gerade");
		
	}

	@Override
	public void landen() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public String beschreibung() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
