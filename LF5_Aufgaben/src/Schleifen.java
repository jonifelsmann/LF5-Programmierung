import java.util.Scanner;

public class Schleifen {

	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		// Deklaration der Variablen
		int i;
		int n;
		int summe=0;
		
		
		// Einlesen der notwendigen Werte
		System.out.print("Bitte geben Sie eine Zahl ein: ");
		n = tastatur.nextInt();
		
		
		for (i=0; i<=n; i++) {
		System.out.println(i);
		
		summe = summe + i;
		}
		
		System.out.println("\nDie Summe beträgt: " + summe);
	}

}
