import java.util.Scanner;

public class Volumen {
	
	public static double volumenberechnung(double volumengesamt) {
		double laenge;
		
		Scanner tastatur = new Scanner(System.in);
		
	 System.out.print("Wie viel cm beträgt die Länge der Würfelseite?: ");
	        laenge = tastatur.nextDouble();
		
		volumengesamt = Math.pow(laenge,3);
		
		return volumengesamt;
		
	}

	public static void main(String[] args) {
		
		double volumengesamt=0;
		
		volumengesamt = volumenberechnung(volumengesamt);
		System.out.println(volumengesamt);
	}
	
}
