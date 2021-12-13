package Interfaces;

public interface ITelefon {
	
	  //Nur static und werte nicht �nderbar (Konstanten) , darf nicht leer sein
	  public static final String TOUCH = "Touchpad";
	 
	  
	  //Methoden sind vorgegeben aber m�ssen in der Klasse selber verarbeitet werden
	  abstract double aufladenZeit();
	  abstract void start();
	  void sound();
	  
	  
}
