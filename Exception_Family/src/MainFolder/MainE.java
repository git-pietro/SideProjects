package MainFolder;

import java.util.Scanner;
import Calculator.Taschenrechner; 
//Klasse importieren, dann muss kein neues Objekt erstellt 

public class MainE {

	public static void main(String[] args) {
		
		//Beispiele
		
		int arr[] = {1,2,3}; //BSP1
		
		Scanner input = new Scanner(System.in);
		System.out.println("Gebe eine Zahl ein: "); //BSP2
		
		
		//BSP1 
		try { //Dies wird versucht
		System.out.println(arr[3]); 
		}
		catch(ArrayIndexOutOfBoundsException e) { 
			//Falls TRY fehlschl‰gt dann CATCH diesen Fehler code:
			//ArrayIndexOutOfBoundsException / NullPointerException / Exception 
	 
			System.out.println("Diese Postion ist auﬂerhalb des Arrays.");
			//Dies wird stattdessen ausgegeben
		}
		
		//BSP2
		try {
			int zahl = input.nextInt();
			System.out.println(zahl);
		}
		catch(Exception e) {
			System.out.println("Bitte eine ZAHL eingeben.");
		}
		
		//Taschenrechner:
		
		Taschenrechner.addieren(5, 4);
	
        try {
        	Taschenrechner.dividieren(54, 0);
        }
        catch(Exception e) {
        	System.out.println("Man kann nicht durch 0 teilen.");
        }
		
        
	}

}
