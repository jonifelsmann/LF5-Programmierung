import java.util.Scanner;

public class Test {

	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		// Deklaration der Variablen
		int dividend;
		int divisor;
		int zahl;

		// Einlesen der notwendigen Werte
		System.out.println("Bitte geben Sie den Dividend ein: ");
		dividend = tastatur.nextInt();

		System.out.println("Bitte geben Sie den Divisor ein: ");
		divisor = tastatur.nextInt();

		// Überprüfung

			    
			    if (dividend % divisor == 0) {
			      System.out.println(dividend + " ist durch " + divisor + " teilbar.");
			    } else {
			      System.out.println(dividend + " ist nicht durch " + divisor + " teilbar.");
			    }
		
		tastatur.close();
	}

}