
public class arrayuebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] zahlen = {1, 6, 3, 7, 2};

	//	int i = 4;
		
	//	System.out.println(zahlen[1]); 				// 6 weil 0,1,2,3,4
		
	//	System.out.println(zahlen[5]); 				// error

	//	System.out.println(zahlen[3]);				// 7 weil 0,1,2,3,4

	//	System.out.println(zahlen[i]); 				// 2 weil i=4 und er die 4. stelle nimmt

	//	System.out.println(zahlen[i-2]); 			// 3 weil i=4 -2 ist 2 und der 2. Wert vom Array
		
	//	System.out.println(zahlen[zahlen[4]]);		// 3 weil zaheln [2] und dann der 2. Wert vom Array
		
	
	
	
	
	// 1. Deklaration eines Arrays für ganze Zahlen.
	
	int[] GanzeZahlen;

    // 2. Initialisierung des Arrays mit 100 Elementen.
	
	GanzeZahlen = new int [100];

    // 3. Durchlaufen des gesamten Arrays und Ausgabe des Inhalts.
	
	for (int i = 1; i<=GanzeZahlen.length-1; i++) {
		
		System.out.println(GanzeZahlen[i]);
	}

    // 4. Das Array mit allen ganzen Zahlen von 1 bis 100 befüllen.
	
	for (int i = 1; i<=GanzeZahlen.length-1; i++) {
		
		GanzeZahlen [i] = i+1;
	}

    // 5. Geben Sie den Wert an der 89. Position des Arrays aus.    
	
	System.out.println(GanzeZahlen[88]);

    // 6. Ändern Sie den Wert des Arrayelements mit dem Index 49 zu 1060.
	
	GanzeZahlen [49] = 1060;

    // Außerdem ändern Sie den Wert an der ersten und der letzte Stelle des Arrays zu 2023.
			
	GanzeZahlen [0] = 2023;
	GanzeZahlen [99] = 2023;

    // 7. Erneutes Ausgeben des Arrayinhalts.  Darstellung: Index und zugehöriger Inhalt (z.B. Index 6 - Inhalt: 7)
	
	

    // 8. Berechnung des Durchschnitts aller Arrayelemente
	
	int summe=0;
	for (int i = 0; i<=GanzeZahlen.length-1; i++) {
		
		
		summe += GanzeZahlen [i];
	}
	System.out.println(summe/GanzeZahlen.length);
	
	
	}
}
