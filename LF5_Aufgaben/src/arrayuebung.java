
public class arrayuebung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] zahlen = {1, 6, 3, 7, 2};

		int i = 4;
		
	//	System.out.println(zahlen[1]); 				// 6 weil 0,1,2,3,4
		
	//	System.out.println(zahlen[5]); 				// error

	//	System.out.println(zahlen[3]);				// 7 weil 0,1,2,3,4

	//	System.out.println(zahlen[i]); 				// 2 weil i=4 und er die 4. stelle nimmt

	//	System.out.println(zahlen[i-2]); 			// 3 weil i=4 -2 ist 2 und der 2. Wert vom Array
		
		System.out.println(zahlen[zahlen[4]]);		// 3 weil zaheln [2] und dann der 2. Wert vom Array
		
	}

}
