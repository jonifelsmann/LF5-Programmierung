
public class Inttest {

	
	int a = 2, b = 4, c = 0;

	if(a > b || a < c)
	{
	  if(a - b == -2)
	    System.out.print("A");
	  else
	    System.out.print("B");
	}
	else
	{
	  if(a > c && b - a == 2)
	    System.out.print("C");
	  else
	    System.out.print("D");
	}
}
