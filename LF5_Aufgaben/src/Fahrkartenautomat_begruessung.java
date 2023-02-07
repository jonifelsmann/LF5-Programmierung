import java.util.Scanner;

class Fahrkartenautomat_begruessung {
	
		// Begrüßung
		
		
	static void begruessung() {
		String begruessung="Herzlich Willkommen!";
		
		System.out.println(begruessung);
		
		}
	
	//static void verabschiedung() {
	//	String begruessung="Ciao!";
	//	
	//	System.out.print(begruessung);
	//	
	//	}
		
	
	
	public static void main(String[] args) {

		Scanner tastatur = new Scanner(System.in);

		double zuZahlenderBetrag = 0;
		double eingezahlterGesamtbetrag;
		double eingeworfeneMuenze;
		double rueckgabebetrag;
		double nochZuZahlen;
		double anzahlTickets = 0;  
		int ticketWahl = 0;
		 
		begruessung();	
	//verabschiedung();
		
		
		// Ticketpreis eingeben
       
		
		System.out.println("\nFahrkartenbestellvorgang:\n"
        		+ "=========================\n"
        		+ "\n"
        		+ "Wählen Sie ihre Wunschfahrkarte für Berlin AB aus:\n"
        		+ "  Kurzstrecke AB [2,00 EUR] (1)\n"
        		+ "  Einzelfahrschein AB [3,00 EUR] (2)\n"
        		+ "  Tageskarte AB [8,80 EUR] (3)\n"
        		+ "  4-Fahrten-Karte AB [9,40 EUR] (4)");

        System.out.println("Ihre Wahl: ");
        ticketWahl = tastatur.nextInt();
        
   //     while (ticketWahl > 4 || ticketWahl < 1){
  //     	 System.out.println("Keine Tickets zu dieser Kategorie verfügbar");
       	 
  //     	 System.out.println("Ihre Wahl: "); 
 //        ticketWahl = tastatur.nextInt();
  //     }
        
        
        if (ticketWahl==1) {
        	zuZahlenderBetrag=2.0;
        }
        if(ticketWahl==2){
        	zuZahlenderBetrag=3.0;
        }
        if(ticketWahl==3){
        	zuZahlenderBetrag=8.8;
        }
        if(ticketWahl==4){
        	zuZahlenderBetrag=9.4;
        }
        
        
        
        if (zuZahlenderBetrag < 0) {
            zuZahlenderBetrag = 1;
            System.out.println("Fehlerhafte Eingabe - Ticketpreis wird auf 1 gesetzt");
        }	
        
        // Anzahl der Tickets eingeben
        
        
        while (anzahlTickets < 1 || anzahlTickets > 10) {
        	System.out.println("Anzahl der Tickets: ");
            anzahlTickets = tastatur.nextInt();
            
         if (anzahlTickets < 1 || anzahlTickets > 10) {
        	 System.out.println("Die Anzahl der Tickets muss zwischen 1 und 10 sein ");
         }
        }
        
        zuZahlenderBetrag = zuZahlenderBetrag * anzahlTickets;

		
		// Geldeinwurf
		eingezahlterGesamtbetrag = 0.0;
		nochZuZahlen = 0.0;
		while (eingezahlterGesamtbetrag < zuZahlenderBetrag) {
			nochZuZahlen = zuZahlenderBetrag - eingezahlterGesamtbetrag;
			System.out.print("Noch zu zahlen: ");
			System.out.printf("%.2f ", nochZuZahlen);
			System.out.print("Euro");
			System.out.print("\nEingabe (mind. 5 Cent, höchstens 2 Euro): ");
			eingeworfeneMuenze = tastatur.nextDouble();
			eingezahlterGesamtbetrag = eingezahlterGesamtbetrag + eingeworfeneMuenze;
		}
		
		// Fahrscheinausgabe
		System.out.println("\nFahrschein wird ausgegeben");
		for (int i = 0; i < 8; i++) {
			System.out.print("=");
			try {
				Thread.sleep(200);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("\n\n");
		
		// Rückgeldberechnung und -ausgabe
		rueckgabebetrag = eingezahlterGesamtbetrag - zuZahlenderBetrag;
		if (rueckgabebetrag > 0.0) {
			System.out.println("Der Rückgabebetrag in Höhe von ");
			System.out.printf("%.2f ", rueckgabebetrag);
			System.out.println("Euro ");
			System.out.println(" wird in folgenden Münzen ausgezahlt:"); 

			while (rueckgabebetrag >= 2.0) { // 2-Euro-Münzen
				System.out.println("2 Euro");
				rueckgabebetrag = rueckgabebetrag - 2.00;
			} 
			while (rueckgabebetrag >= 1.0) { // 1-Euro-Münzen
				System.out.println("1 Euro"); 
				rueckgabebetrag = rueckgabebetrag - 1.00;
			}
			while (rueckgabebetrag >= 0.5) { // 50-Cent-Münzen
				System.out.println("50 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.5;
			}
			while (rueckgabebetrag >= 0.2) { // 20-Cent-Münzen
				System.out.println("20 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.2;
			}
			while (rueckgabebetrag >= 0.1) { // 10-Cent-Münzen
				System.out.println("10 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.1;
			}
			while (rueckgabebetrag >= 0.05) { // 5-Cent-Münzen
				System.out.println("5 Cent");
				rueckgabebetrag = rueckgabebetrag - 0.05;
			}
		}

		System.out.println("\nVergessen Sie nicht, den Fahrschein\n" + "vor Fahrtantritt entwerten zu lassen!\n"
				+ "Wir wünschen Ihnen eine gute Fahrt.");

		tastatur.close();
	}
	
}