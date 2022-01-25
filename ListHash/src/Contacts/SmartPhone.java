package Contacts;

import java.util.ArrayList;

public class SmartPhone {
	
	private ArrayList<Kontakte> meineKontakte;
	
	
	public SmartPhone() {
		meineKontakte = new ArrayList<>();
		//Wenn Objekt erstellt wird, wird auch direkt eine Liste erstellt.
	}
	
	public boolean addKontakt(Kontakte kontakt) {
		
		for (Kontakte kontaktCheck : meineKontakte) {
			if(kontakt.getName().equals(kontaktCheck.getName())) { //Dank getter methode kann man vergleichen.
				System.out.println("Name exsistiert bereits.");
				return false;
			}
		}
		
		meineKontakte.add(kontakt);
		System.out.println(kontakt.getName()+" mit der Nummer: "+kontakt.getTelefonNummer()+" erfolgreich hinzugefügt.");
		return false;
	}
	
	public boolean findKontakt(String nameCheck) {
		
		for (Kontakte kontakt : meineKontakte) {
			
			if(kontakt.getName().equals(nameCheck)) {
				System.out.println("Stimmt überein, dies ist ihre Nummer: "+kontakt.getTelefonNummer());
				return true;
			}
			
		}
		System.out.println("Nicht gefunden 404");
		
		return false;
	}
	
	public void ausgabe() {
		
		//Ausage in dieser Folge
		
		for(int i=0; i<meineKontakte.size(); i++) {
			System.out.println(meineKontakte.get(i).getName()+" / "+meineKontakte.get(i).getTelefonNummer());
		}
	}
	
}
			
	


