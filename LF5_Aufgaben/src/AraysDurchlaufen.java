
public class AraysDurchlaufen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] zahlen = {1, 6, 3, 7, 2, 2, 4, 8};
		

		for (int i=2; i<=3; i++) {						// es fängt bei 3 an und wenn kleiner gleich 3 dann eins mehr geben, 7 ist größer als 3 also aufhören und mit komma trennen

		     System.out.print(zahlen[i] + ", ");

		}



		for (int i=0;  i<=zahlen.length;  i++) {		// es fängt bei 1 an und solange i gleich kleiner 7 (länge) ist (also alles)

		      System.out.print (zahlen[i] + ", ");

		}




		for (int i=1; i<=zahlen.length-1; i=i+2) {		// es fängt bei 6 an und index immer +2 werden 6,7,2,8

		      System.out.print(zahlen[i] + ", ");

		}
		
		
		
	}

}
