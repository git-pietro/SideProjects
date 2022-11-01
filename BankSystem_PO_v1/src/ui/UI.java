package ui;

import java.util.Scanner;

import domain.*;
import facade.Banksystem;

public class UI {
	private Banksystem bs;

	Scanner sc = new Scanner(System.in);

	public UI(Banksystem bs) {
		this.bs = bs;

		hauptmenü();
	}

	private void hauptmenü() {
		System.out.println("Willkommen bei der " + bs.getBankname() + "!");

		mainloop: while (true) {
			System.out.println();
			System.out.println("--------");
			System.out.println("Hauptmenü");
			System.out.println("1 -> Konten anzeigen");
			System.out.println("2 -> Konto anlegen");
			System.out.println("3 -> Kontostand per Nummer");
			System.out.println("8 -> Konto auswählen");
			System.out.println("9 -> Beenden");
			System.out.println();

			System.out.print("> ");
			int input = Integer.parseInt(sc.nextLine());
			System.out.println();

			switch (input) {
			case 1:
				kontenAnzeigen();
				break;
			case 2:
				kontoAnlegen();
				break;
			case 3:
				System.out.println("Kontonummer eingabe: ");
				int nummer = sc.nextInt();
				standPerNummer(nummer);
				break;
			case 8:
				sidemenu();
				break;
			case 9:
				break mainloop;
			}
		}

		System.out.println("Auf Wiedersehen!");

	} // hauptmenü

	private void kontenAnzeigen() {
		String[] konten = bs.getKontenliste();
		if (konten.length > 0) {
			System.out.println("Folgende Konten sind aktuell verfügbar:");
			for (String s : konten) {
				System.out.println(s);
			}
		} else {
			System.out.println("Bisher keine Konten angelegt.");
		}
	}

	private void kontoAnlegen() {
		System.out.println("Bitte den Namen des Kontoinhabers angeben: ");
		String name = sc.nextLine();

		int kontonummer = bs.kontoAnlegen(name);
		System.out.println("Konto mit der Nummer " + kontonummer + " neu angelegt.");
	}

	private void standPerNummer(int nummer) {
		System.out.println("Aktueller Kontostand: " + bs.standAufruf(nummer));
	}

	private void sidemenu() {
		kontenAnzeigen();
		System.out.println("Kontonummer: \n >");
		int nummer = Integer.parseInt(sc.nextLine());
		Konto selcKonto = bs.getKonto(nummer);

		sideloop: while (true) {
			System.out.println();
			System.out.println("Aktion auswählen");
			System.out.println("--------");
			System.out.println("1 -> Geld einzahlen");
			System.out.println("2 -> Geld auszahlen");
			System.out.println("3 -> Kontoauszug");
			System.out.println("8 -> Konto löschen");
			System.out.println("9 -> Hauptmenü");
			System.out.println();

			System.out.print("> ");
			int input = Integer.parseInt(sc.nextLine());
			System.out.println();

			switch (input) {
			case 1:
				geldEinzahlen(selcKonto);
				break;
			case 2:
				geldAuszahlen(selcKonto);
				break;
			case 3:
				kontoauszugDrucken(selcKonto);
			case 8:
				kontoLoeschen(selcKonto);
				break;
			case 9:
				break sideloop;
			}
		}
	}

	private void geldEinzahlen(Konto konto) {
		System.out.println("Betrag: ");
		long betrag = Long.parseLong(sc.nextLine());
		bs.geldEinzahlen(betrag, konto);
		System.out.println("Betrag erfolgreich eingezahlt!");

	}

	private void geldAuszahlen(Konto konto) {
		System.out.println("Betrag: ");
		long betrag = Long.parseLong(sc.nextLine());
		bs.geldEinzahlen(betrag, konto);
		System.out.println("Betrag erfolgreich ausgezahlt!");

	}

	private void kontoauszugDrucken(Konto konto) {
		bs.printKontoauszug(konto);
	}

	private void kontoLoeschen(Konto konto) {
		bs.deleteKonto(konto);
	}

}
