package Interfaces;
import Abstracts.*;
import Classes.*;
import Interfaces.*;

public class TechStore_Main {

	public static void main(String[] args) {
		
		GalaxyS10 user1 = new GalaxyS10(2019, "Smartphone", 1100.99, 194946544);
		user1.start();
		user1.aufladenZeit();
		user1.getPreis(194946544);
		user1.setPreis(200);
		user1.getPreis(194946544);
		user1.sound();

	}

}
