package BankMain;

import static org.hamcrest.CoreMatchers.instanceOf;

import domain.Girokonto;
import facade.*;
import ui.*;

public class Main {

	public static void main(String[] args) throws Exception {
		Banksystem bs = new Banksystem("Spaßkasse Mannheim");
		UI ui = new UI(bs);
		
		
	    
	}

}