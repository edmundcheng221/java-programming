package classwork;

public class Hello_world {

	  public static void main(String[] args) {

	    int value = 0;

	    int[] numbers = new int[1];

	    numbers[0] = 0;

	    m(value, numbers);

	    System.out.println("value is " + value

	            + " and numbers[0] is " + numbers[0]);

	  }

	  public static void m(int x, int[] y) {

	    x = 3;

	    y[0] = 3;

	  }

	}
//import java.util.Scanner;
//
//public class Hello_world {
//
//
//	public static void main(String[] args) {
//		int n, k, max; 
//	    max = 5;     /* read value for max */
//	    for (n = 0; n < max; n++)
//	    {
//	        for (k = 0; k < max; k++)
//	        {
//	            if (n > k)
//	                System.out.print(" G ");
//	            else if (n < k)
//	                System.out.print(" L ");
//	            else
//	                System.out.print(" E ");
//	        }
//	        System.out.println();
//	    }
//	    scanner();
//	    System.out.println("The Euclidean Distance is "+ distance());
//	    System.out.println(conditionals.lessThanEqual());
//	    
//	    
//
//	}
//	
//	public static void scanner() {
//        Scanner sc = new Scanner(System.in);
//        String scanned = sc.next();
//        System.out.println(scanned);
//	}
//	
//
//	public static int xdistance() {
//		int[] locationRed = {5, 3};
//		int [] locationBlue = {7, 8};
//		int xdiff = locationBlue[0] - locationRed[0];
//		return xdiff;
//		
//	}
//	
//	public static int ydistance(){
//		int[] locationRed = {5, 3};
//		int [] locationBlue = {7, 8};
//		int ydiff = locationBlue[1] - locationRed[1]; 
//		return ydiff;
//		
//	}
//	
//	public static double distance() {
//		return (Math.sqrt(Math.pow(xdistance(), 2) + Math.pow(ydistance(), 2)));
//	}
//	
//
//}
