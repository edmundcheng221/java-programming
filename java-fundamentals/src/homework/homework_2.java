package homework;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Arrays;


public class homework_2 {


	public static void main(String[] args) {
		System.out.println();
		System.out.println("TASK 1");
		System.out.println();
		//Task 1
		int[][] v1 = {{1,2,3},{4,5,6},{7,8,9}};
		int value = sumEvenValues(v1);
		System.out.println(value);
				
		System.out.println();
		System.out.println("TASK 2");
		System.out.println();
		
		//Task 2
		int[][] v2A = {{11,2,36},{41,50,6},{7,18,9}};
		int[][] v2B = {{11,36},{41,50,6},{7,18,9}};
		int countA = countOddValues(v2A);
		System.out.println(countA);
		int countB = countOddValues(v2B);		
		System.out.println(countB);
		
		System.out.println();
		System.out.println("TASK 3");
		System.out.println();
		
		//Task 3
		int[][] v3 = {{1,2,3},{4,51,6},{7,8,9}};
		int[] minMax = arrayMinMax(v3);
		System.out.println(Arrays.toString(minMax));
		
		System.out.println();
		System.out.println("TASK 4");
		System.out.println();
		
		//Task 4
		int[][] v4 = {{1,2,3},{4,5,6},{7,8,9}};
		int[] cd = changeArrayDimensions(v4);
		System.out.println(Arrays.toString(cd));
		
		System.out.println();
		System.out.println("TASK 5");
		System.out.println();
		
		//Task 5
		int[][] v5 = mainDiagonal1();
		System.out.println(Arrays.deepToString(v5));
		
		System.out.println();
		System.out.println("TASK 6");
		System.out.println();
		
		//Task 6
		double[][] v6A = {{1000,2000,3000},{4000.86,5000,6000},{7000,8000.4,9000}};
		double[][] v6B = {{1000.7,2000,3000},{40,5000,6000},{7000,8000.92,9000}};
		String[][] A6A = formattedArray(v6A);
		String[][] A6B = formattedArray(v6B);
		System.out.println(Arrays.deepToString(A6A));
		System.out.println(Arrays.deepToString(A6B));
		
		System.out.println();
		System.out.println("TASK 7");
		System.out.println();
		
		//Task 7
		int a = sumProduct(1,2,3,4,5);
		System.out.println(a);
		int b = sumProduct(1,2,3,4,5,6,7,8,9);		
		System.out.println(b);
		
		System.out.println();
		System.out.println("TASK 8");
		System.out.println();
		
		//Task 8
		int[][] v8A = {{11,12,13},{14,15,16},{17,18,19}};
		int[][] v8B = {{1,12,13},{14,15,16},{17,18,19}};
		String[][] c8A = not5Inverses(v8A);
		String[][] c8B = not5Inverses(v8B);
		System.out.println(Arrays.deepToString(c8A));
		System.out.println(Arrays.deepToString(c8B));	

		
	}
	
	// task 00
	
	public static boolean checkForSquare(int[][] arr) {
		int count = 0; 
		int count2 = 0;
		for (int i[]: arr) {
			count += 1;
			for (int ele: i) {
				count2 += 1;		
			}
		}
		count2 /= count;
		if (count == count2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean checkForSquare(double[][] arr) {
		int count = 0; 
		int count2 = 0;
		for (double i[]: arr) {
			count += 1;
			for (double ele: i) {
				count2 += 1;		
			}
		}
		count2 /= count;
		if (count == count2) {
			return true;
		}
		else {
			return false;
		}
		
	}
	
	public static boolean checkForSquare(String[][] arr) {
		int count = 0; 
		int count2 = 0;
		for (String i[]: arr) {
			count += 1;
			for (String ele: i) {
				count2 += 1;		
			}
		}
		count2 /= count;
		if (count == count2) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// Task 1
	
	public static int sumEvenValues(int[][] arr) {
		int total = 0;
		for (int i[]: arr) {
			for (int j: i) {
				int x = j;
				switch (x%2) {
					case 0:
						total += x;
					case 1:
						total += 0;			
				}
			}
		}
		return total;
	}
	
	
	// Task 2
	
	public static int countOddValues(int[][] arr) {
		boolean isValid = checkForSquare(arr);
		int total = 0;
		if (isValid == false) {
			System.out.println("Input Is Not Square");
			return 0;
		}
		else {
			for (int i[]: arr) {
				for (int j: i) {
					if (j%2 == 0) {
						total += 0;
					}
					else {
						total += 1;
					}
		
				}
			}
			return total;
		}
			
			
	}
		
	
	// Task 3
	
	public static int[] arrayMinMax(int[][] arr) {
		int min = arr[0][0];
		int max = arr[0][0];
		for(int i[]: arr) {
			for(int j: i) {
				if (j < min) {
					min = j;
				}
			}
		}
		for(int i[]: arr) {
			for(int j: i) {
				if (j > max) {
					max = j;
				}
			}
		}
		
		int[] minMax = {min,max};
		return minMax;
	}
	
	// Task 4
	
	public static int[] changeArrayDimensions(int[][] arr) {
		int count = 0;
		for(int i[]: arr) {
			for(int j: i) {
				count += 1;
			}
		}
		
		int[] array = new int[count];
		int pos = 0;
		for(int i[]: arr) {
			for(int j: i) {
				array[pos] = j;
				pos += 1;
			}
		}
		
		return array;

	}
	
	// Task 5
	
	public static int[][] mainDiagonal1() {
		int[][] arrayZeros = {{0,0,0}, {0,0,0}, {0,0,0}};
		int pos = 0;
		for(int i = 0; i < arrayZeros.length; i++) {
			for (int j = 0; j < arrayZeros[i].length; j++) {
				if (i == pos && j == pos) {
					arrayZeros[pos][pos] = 1;
					pos += 1;
				}
			}
		}

		return arrayZeros;
	}
	
	// Task 6
	
	public static String[][] formattedArray(double[][] arr) {


		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < 1000) {
					String[][] array = {{"SW","SW","SW"},{"SW","SW","SW"},{"SW","SW","SW"}};
					return array;
				}



			}
			
		}
		
		String[][] array = new String[3][3];
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if (Math.floor(arr[i][j]) < arr[i][j]) {

					array[i][j] = String.format("%,.1f", arr[i][j]);
					
				}
				else {
					array[i][j] = String.format("%,.2f", arr[i][j]);

					
				}

				}
			}
		return array;
		}

	
	// Task 7

	public static int sumProduct(int... arg) {
		int sum = 0;
		int product = 1;
		int[] arguments = arg;
		System.out.println(Arrays.toString(arguments));
		for (int i = 0; i < arguments.length; i++) {
			sum += arguments[i];
			product *= arguments[i];
		}
		
		return sum*product;
		
	}

	
	// Task 8
	
	public static String[][] not5Inverses(int[][] arr) {
    
		NumberFormat formatterTwo = new DecimalFormat(".00");

		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] < 5) {
					String[][] array = {{"X","X","X"},{"X","X","X"},{"X","X","X"}};
					return array;
				}



			}
			
		}
		
		String[][] array = new String[3][3];
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				String val = String.valueOf((0.1/arr[i][j])*10);
				double d = Double.parseDouble(val);
				array[i][j] = formatterTwo.format(d);
				}
			}
		return array;
		
		}
		
	
	
	

}
