
public class Suche {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] zahlenArray = { 1, 5, 5, 7, 3, 11, 22, 23, 27 };
		
		int zahl = 5;
		boolean gefunden = false;
		
		for (int i = 0; i < zahlenArray.length; i++) {
			if (zahlenArray[i] == zahl) {
				gefunden = true;
				break;
			}
			
		}
		
		if(gefunden) {
			System.out.println("Die Zahl " + gefunden + " ist in dem Array vorhanden");
		}
		else {
			System.out.println("Die Zahl " + gefunden + " ist nicht in dem Array vorhanden");
		}
	}

}
