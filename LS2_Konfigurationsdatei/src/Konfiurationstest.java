import java.util.Scanner;
public class Konfiurationstest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int cent;
		double komma;
		boolean richtig;
		short minuszahl;
		float kommaklein;
		char zeichen;
		byte zahlklein;
		long groß;
		String buchstaben;
		final int CHECK_NR;
	 
		cent = 70;
		cent = 80;
		komma = 95.50;
		richtig = true;
		minuszahl = -1000;
		kommaklein = 1.255F;
		zeichen = '#';
		zahlklein = 8;
		groß = 2147483648L;
		buchstaben = "Hallo cooler Typ!";
		CHECK_NR = 8765;
		
		//Datentypen sind sinnvoll, da man die einzelnen Teile des Programms z.B. Eingaben gut unterteilen und einkliedern kann
		//es ist sehr übersichtlich und man weiß direkt, was zu was gehört
		
		//außerdem kann man den möglichst kleinsten Speicherplatz verwenden (unter beachtung des korrekten Datentypes
		
		byte ergebnis;
		
		ergebnis = 4 + 8 * 9 - 1;
				
		System.out.println(ergebnis);
			
		
		byte zaeler;
		zaeler = 1;
		zaeler++;
				System.out.println(zaeler++);
				
		byte division;
		division = 22 / 6;		
				System.out.println(division);
				
		byte schalter;
		schalter = 10;
		
				System.out.println(7 < schalter && schalter < 12);
				System.out.println(schalter != 10 || schalter == 12);
				
		String zeichenkette = "Meine Oma " + "fährt im " + "Hühnerstall Motorrad";
				System.out.println(zeichenkette);
				
	}

}
