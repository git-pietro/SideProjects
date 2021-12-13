package Interfaces;

public interface ITelefon {
	
	  //Nur static und werte nicht änderbar (Konstanten) , darf nicht leer sein
	  public static final String TOUCH = "Touchpad";
	 
	  
	  //Methoden sind vorgegeben aber müssen in der Klasse selber verarbeitet werden
	  abstract double aufladenZeit();
	  abstract void start();
	  void sound();
	  
	  
}
