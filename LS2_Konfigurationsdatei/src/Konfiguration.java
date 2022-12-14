
public class Konfiguration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
			int muenzenEuro = 130;
			int euro;
			int cent;
			double prozent;
			String bezeichnung = "Q2021_FAB_A";
			char sprachModul = 'd';
			boolean status; 
			String name;
			String typ = "Automat AVR";
			final byte PRUEFNR = 4;
			double patrone = 46.24;
			double maximum = 100.00;
			int summe;
			int muenzenCent = 1280;
			
		
			name = typ + " " + bezeichnung;			
			prozent = maximum - patrone;
			summe = muenzenCent + muenzenEuro * 100;
			
			euro = summe / 100;
			cent = summe % 100;
			
			status = (euro <= 150) 	
					&& (prozent >= 50.00)
					&&  (!(PRUEFNR == 5 || PRUEFNR == 6))
					&& (euro >= 50)&& (cent != 0)
					&& (sprachModul == 'd');
	
			System.out.println("Name: " + name);
			System.out.println("Sprache: " + sprachModul);
			System.out.println("Prüfnummer : " + PRUEFNR);
			System.out.println("Füllstand Patrone: " + prozent + " %");
			System.out.println("Summe Euro: " + euro +  " Euro");
			System.out.println("Summe Rest: " + cent +  " Cent");       
			System.out.println("Status: " + status);
		
		
		
	}

}
