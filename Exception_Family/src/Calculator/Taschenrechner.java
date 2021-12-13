package Calculator;

public class Taschenrechner {
	
	public static void addieren(double zahl1, double zahl2) {
		double result = zahl1+zahl2;
		
		System.out.println(result);
	}
	
	public static void subtrahieren(double zahl1, double zahl2) {
		double result = zahl1-zahl2;
		
		System.out.println(result);
	}

	public static void dividieren(double zahl1, double zahl2)throws Exception {
		
		if(zahl2 == 0) {
			throw new Exception("Man kann nicht durch 0 teilen."); 
			//Richtiger Exception code und dann die Fehlermeldung dazu
		}
		else {
		
		double result = zahl1/zahl2;
		
		System.out.println(result);
		}
	}
	
	



}
