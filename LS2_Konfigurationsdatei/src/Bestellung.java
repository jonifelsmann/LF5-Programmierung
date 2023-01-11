import java.util.Scanner;

public class Bestellung {

	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		// Deklaration und Initialisierung 

		int schrauben;
		int preisschrauben;
		int muttern;
		int preismuttern;
		int unterlegscheiben;
		int preisunterlegscheiben;
		int gesamt = 0;
		
		
		// Begrüßungstext
		System.out.println("Bobs Schrauben Discount");
		System.out.println("Bitte geben Sie folgende Mengen ein: ");
		
		// Eingabe (Tipp: tastatur.nextInt())
		System.out.print("Anzahl der Schrauben: ");
		schrauben = tastatur.nextInt();
		
		System.out.print("Anzahl der Muttern: ");
		muttern = tastatur.nextInt();
		
		System.out.print("Anzahl der Unterlegscheiben: ");
		unterlegscheiben = tastatur.nextInt();

		// Verarbeitung
		
		if ( )
		preisschrauben = (schrauben * 5) / 100;
		preismuttern = (muttern * 3 ) / 100;
		preisunterlegscheiben = (unterlegscheiben * 1) / 100;
		
		gesamt = preisschrauben + preismuttern + preisunterlegscheiben;
		
		// Ausgabe
		
		System.out.println("Kontrollieren Sie Ihre Bestellung! ");
		System.out.println("Gesamtbetrag: " + gesamt);	


		tastatur.close();

	}
}