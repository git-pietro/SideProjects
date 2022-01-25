package Contacts;

public class MeineKontaktlist {

	public static void main(String[] args) {
	
		SmartPhone SamsungS10plus = new SmartPhone();
		
		//Methode 1:
		SamsungS10plus.addKontakt(Kontakte.erstelleKontakt("Pietro", 491768449));
		SamsungS10plus.addKontakt(Kontakte.erstelleKontakt("John", 494568449));
		
		//Methode 2:
		Kontakte daniel = new Kontakte("Daniel", 54848);
		SamsungS10plus.addKontakt(daniel);
        
		SamsungS10plus.ausgabe();
	}

}
