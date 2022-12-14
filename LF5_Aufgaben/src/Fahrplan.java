import java.util.Scanner;// Um die Scanner-Klasse zu verwenden, muss diese importiert werden

public class Fahrplan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        // Weichenstellungen
		        int fahrzeit = 0;
		        char haltInSpandau = 'n';
		        char richtungHamburg = 'n';
		        char haltInStendal = 'j';
		        char bisWolfsburg = 'j';
		        char bisBraunschweig = 'j';
		        char endetIn = 'h'; //h=Hannover, b=Braunschweig, w=Wolfsburg

		        fahrzeit = fahrzeit + 8; // Fahrzeit Hbf -> Spandau
		        
		        Scanner tastatur = new Scanner(System.in); // Erzeugen eines Objekts der Klasse Scanner

		        System.out.println("Möchten Sie in Spandau halten?");
		        haltInSpandau = tastatur.next().charAt(0);
		       
		        
		        if (haltInSpandau == 'j') {
		            fahrzeit = fahrzeit + 2; // Halt in Spandau
		           System.out.println("Sie halten in Spandau und Ihre neue Fahrzeit beträgt " + fahrzeit);
		        }
		        else {
		        	fahrzeit = fahrzeit;
		        	System.out.println("Sie halten nicht in Spandau und Ihre neue Fahrzeit beträgt " + fahrzeit + " Minuten\"");
		        	
		        }
		        
		        System.out.println("Möchten Sie weiter nach Hamburg?");
		        richtungHamburg = tastatur.next().charAt(0);
		        
		        if (richtungHamburg == 'j') {
		            fahrzeit = fahrzeit + 96; // Weiterfahrt richtung Hamburg
		           System.out.println("Sie haben Hamburg " + fahrzeit + " Minuten erreicht");
		        }
		        
		        else {
		        	fahrzeit = fahrzeit + 34;
		        	System.out.println("Sie fahren weiter richtung Wolfsburg, Hannover etc. und Ihre neue Fahrzeit beträgt " + fahrzeit + " Minuten");
		        	
		        
		        
		        System.out.println("Möchten Sie über Stendal fahren?");
		        haltInStendal = tastatur.next().charAt(0);
		        
		        if (haltInStendal == 'j') {
		            fahrzeit = fahrzeit + 16; // Halten in Stendal
		           System.out.println("Sie fahren über Stendal und Ihre neue Fahrzeit beträgt " + fahrzeit + " Minuten");
		        }
		        else {
		        	fahrzeit = fahrzeit + 6; // Nicht halten in Stendal
		        	System.out.println("Sie fahren weiter richtung Wolfsburg, Braunschweig und Hannover");
		        	
		        }
		        
		        System.out.println("Möchten Sie nach Wolfsburg fahren?");
		        bisWolfsburg = tastatur.next().charAt(0);
		        
		        if (bisWolfsburg == 'j') {
		            fahrzeit = fahrzeit + 29; // Bis Wolfsburg fahren
		           System.out.println("Sie haben nach " + fahrzeit + " Minuten Wolfsburg erreicht");
		        }
		        else {
		            
		        	fahrzeit = fahrzeit; // Weiter nach Braunschweig und co.
		        	System.out.println("Sie fahren weiter richtung Braunschweig und Hannover");
		        	
		        
		        
		        System.out.println("Möchten Sie nach Braunschweig fahren?");
		        bisBraunschweig = tastatur.next().charAt(0);
		        
		        if (bisBraunschweig == 'j') {
		            fahrzeit = fahrzeit + 50; // Bis Wolfsburg fahren
		           System.out.println("Sie haben nach " + fahrzeit + " Minuten Braunschweig erreicht");
		        }
		        else {
			        
		        	fahrzeit = fahrzeit + 62; // Weiter nach Braunschweig und co.
		        	System.out.print("Sie haben Hannover nach " + fahrzeit + " Minuten erreicht");
		        	
		        }
		        
		        }
		        }
		        
		        
		    }
	
		
	}
