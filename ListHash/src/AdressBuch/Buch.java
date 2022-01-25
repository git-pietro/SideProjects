package AdressBuch;

import java.util.ArrayList;
import java.util.Scanner;

public class Buch {
	

	
	public static void main(String[] args) {
		
		
		
		eingabe();

	}

	public static void eingabe() {
		
		ArrayList<AdresseInfo> adressinfo = new ArrayList<>();

		String street;
		int housNumber;
		String city;
		String check;

		

		Scanner input = new Scanner(System.in);

		System.out.println("Straﬂe: ");
		street = input.next();
		System.out.println("Hausnummer: ");
		housNumber = input.nextInt();
		System.out.println("Stadt: ");
		city = input.next();

		AdresseInfo adresse = new AdresseInfo(street, housNumber, city);

		adressinfo.add(adresse);

		System.out.println("Noch eine Adresse? [y/n]");
		check = input.next();
		if (check.equals("y")) {
			eingabe();
		}

		else {
			
			for (AdresseInfo adresseInfo : adressinfo) {
				System.out.println();
			}
			
		

			
		}

	}
	
	 
}
