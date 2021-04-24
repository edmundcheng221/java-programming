package homework;


public class midterm {
	
	public static void displayMatrix(int[][] m) {
		for(int[] i: m) {
			for(int j:i) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
	
	// Helper Method to check for square matrix
	
	public static boolean checkIfSquareArray(int[][] arr) {
		int count = 0; 
		int count2 = 0;
		for (int[] i: arr) {
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
	
	
	// Task 1
	public static int[][] orderedMatrixRow(int[][] arr) {
		boolean squareOrNot = checkIfSquareArray(arr);
		if (squareOrNot == false) {
			int[][] newArr = {{0,0,0},{0,0,0},{0,0,0}};
			System.out.println("Matrix not square");
			return newArr;
		}
		else {
			int[] total = new int[arr.length];
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr[i].length; j++) {
					sum += arr[i][j];
				}
				total[i] = sum;
				sum = 0;
			}
			
			int smallestPos = 0;
			int smallest = total[0];
			int largestPos = 0;
			int largest = total[0];
			for (int i = 0; i < total.length; i++) {
				if (total[i] < smallest) {
					smallest = total[i];
					smallestPos = i;
				}
			}
			for (int i = 0; i < total.length; i++) {
				if (total[i] > largest) {
					largest = total[i];
					largestPos = i;
				}
			}
			
			int[][] newArr = new int[arr.length][arr[0].length];
			int[] zeros = new int[arr[0].length]; 	
			
			for (int i = 0; i < newArr.length; i++) {
				if (i == 0) {
					newArr[i] = arr[largestPos];
				}
				else if (i == 1) {
					newArr[i] = arr[smallestPos];
				}
				else {
					newArr[i] = zeros;
				}
			}
	
			return newArr;
		}
		
	}
	
	// Task 2
	public static int[][] orderedMatrixColumn(int[][] arr) {
		boolean squareOrNot = checkIfSquareArray(arr);
		if (squareOrNot == false) {
			int[][] newArr = {{0,0,0},{0,0,0},{0,0,0}};
			System.out.println("Matrix not square");
			return newArr;
		}
		else {
			int[] total = new int[arr.length];
			int sum = 0;
			int len = arr.length;
			int count = 0;
			
			while (len > 0) {
				for (int i = 0; i < arr.length; i++) {
					sum += arr[i][count];

				}
				total[count] = sum;
				len -= 1;
				count += 1;
				sum = 0;
			}
			
			int smallestPos = 0;
			int smallest = total[0];
			int largestPos = 0;
			int largest = total[0];
			for (int i = 0; i < total.length; i++) {
				if (total[i] < smallest) {
					smallest = total[i];
					smallestPos = i;
				}
			}
			for (int i = 0; i < total.length; i++) {
				if (total[i] > largest) {
					largest = total[i];
					largestPos = i;
				}
			}


			
			int[][] newArr = new int[arr.length][arr[0].length];

			for (int i = 0; i < newArr.length; i++) {
				for (int j = 0; j < newArr[i].length; j++) {
					if (j == largestPos-2) {
						newArr[i][j] = arr[i][largestPos];
					}
					else if (j == smallestPos) {
						newArr[i][j] = arr[i][smallestPos];
					}
				}

			}
			
			return newArr;
		}

		
	}
	
	// Task 3
	public static int[][] orderedMatrixMinMax(int[][] arr) {
		boolean squareOrNot = checkIfSquareArray(arr);
		if (squareOrNot == false) {
			int[][] newArr = {{0,0,0},{0,0,0},{0,0,0}};
			System.out.println("Matrix not square");
			return newArr;
		}
		else {
			int[] col = new int[arr.length];
			int count = 0;
			int[] smallestCol = new int[arr[0].length];
			int[] largestCol = new int[arr[0].length];
			
			
			while (count < arr.length) {
				for (int i = 0; i < arr.length; i++) {
					col[i] = arr[i][count];
				}
				int smallest = col[0];

				int largest = col[0];

				for (int a = 0; a < col.length; a++) {
					if (col[a] < smallest) {
						smallest = col[a];

					}
					if (col[a] > largest) {
						largest = col[a];

					}
				}


				smallestCol[count] = smallest;
				largestCol[count] = largest;
				count += 1;
				

			}

	
			int[][] newArr = new int[arr.length][arr[0].length];
			int idxFirst = 0;
			int idxLast = arr.length - 1;
			for (int i = 0; i < newArr.length;i++) {
				for (int j = 0; j < newArr[i].length; j++) {
					if (i == idxFirst) {
						newArr[i][j] = largestCol[j];
					}
					else if (i == idxLast) {
						newArr[i][j] = smallestCol[j];
					}
				}
				
			}
			
			return newArr;
			
		}

	}

	public static void main(String[] args) {
		int[][] M = {{1,2,3,6,9}, {8,3,2,6,1},{4,4,1,4,4},{2,7,9,0,1},{8,3,4,5,6}};
		int[][] N = {{1,2,3},{8,3,2},{4,4,1}};
		displayMatrix(orderedMatrixRow(M));
		System.out.println();
		displayMatrix(orderedMatrixRow(N));
		System.out.println();
		int[][] P = {{1,2,3,6,9}, {8,3,2,6,1},{4,4,9,6,4},{2,7,9,0,1},{8,3,4,5,6}};
		int[][] Q = {{1,2,3},{8,3,9},{4,4,2}};
		displayMatrix(orderedMatrixColumn(P));
		System.out.println();
		displayMatrix(orderedMatrixColumn(Q));
		System.out.println();
		displayMatrix(orderedMatrixMinMax(P));
		System.out.println();
		displayMatrix(orderedMatrixMinMax(Q));
	}
	
	

}
