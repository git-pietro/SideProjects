package BankMain;

import domain.Bank;
import domain.Konto;
import facade.Banksystem;
import ui.UI;

public class Main {

	public static void main(String[] args) {
		Banksystem bs = new Banksystem("Spaßkasse Mannheim");
	    UI ui = new UI(bs);
		
		
		
		
	}

}