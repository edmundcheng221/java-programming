package homework;

import java.util.Arrays;

public class homework_3 {

	public static void main(String[] args) {
		// Test displayMatrix method
		int[][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
		displayMatrix(matrix);
		// Test buildMatrix
		int[] arr = {1,2,3,4,5,6,7,8,9};
		displayMatrix(buildMatrix(arr));
		// Test buildRandomMatrix
		displayMatrix(buildRandomMatrix());
		// Test buildVectorMatrix
		int[] a = {10,20,30};
		int[] b = {11,21,31};
		int[] c = {12,22,32};
		displayMatrix(buildVectorMatrix(a,b,c));
		// Test compare Matrices
		int m[][] = {{1,2,3},{4,2,6},{7,8,9}};
		int n[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(compareMatrices(m,n));
		// Test add matrix
		int mat1[][] = {{1,2,3},{4,2,6},{7,8,9}};
		int mat2[][] = {{1,2,3},{4,5,6},{7,8,9}};
		displayMatrix(addMatrices(mat1,mat2));
		// Test subtract matrix
		int matrix1[][] = {{9,8,7},{6,2,4},{3,2,1}};
		int matrix2[][] = {{1,2,3},{4,5,6},{7,8,9}};
		displayMatrix(subtractMatrices(matrix1,matrix2));
		// Test scalar product matrix
		int x[][] = {{9,8,7},{6,2,4},{3,2,1}};
		int y = 4;
		displayMatrix(scalarProductMatrix(x,y));
		// Test multiply matrices
		int m1[][] = {{1,2,3},{4,5,6},{7,8,9}};
		int m2[][] = {{5,2,4},{4,6,6},{7,2,9}};
		displayMatrix(multiplyMatrices(m1,m2));
		// Test transpose matrix
		int mm[][] = {{1,2,3},{4,5,6},{7,8,9}};
		displayMatrix(transposeMatrix(mm));
		// Test is matrices are symmetric
		int mtrue[][] = {{1,7,3},{7,4,5},{3,5,6}};
		int mfalse[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(isSymmetricMatrix(mtrue));
		System.out.println(isSymmetricMatrix(mfalse));
		// Test is trace matrix
		int tracematrix[][] = {{1,7,3},{7,4,5},{3,5,6}};
		System.out.println(traceMatrix(tracematrix));
		// Test determinant
		int dmatrix[][] = {{1,2,3},{4,5,6},{7,8,9}};
		System.out.println(determinant3x3Matrix(dmatrix));
		// Test powerNMatrix
		int N[][] = {{1,2,3},{4,5,6},{7,8,9}};
		displayMatrix(powerNMatrix(N,3));
	}
	
	public static void displayMatrix(int[][] matrix) {
		for (int i[]: matrix) {
			System.out.println(Arrays.toString(i));
		}
	}
	
	public static int[][] buildMatrix(int[] arr){
		int[][] matrix = new int[3][3];
		matrix[0][0] = arr[0];
		matrix[0][1] = arr[1];
		matrix[0][2] = arr[2];
		matrix[1][0] = arr[3];
		matrix[1][1] = arr[4];
		matrix[1][2] = arr[5];
		matrix[2][0] = arr[6];
		matrix[2][1] = arr[7];
		matrix[2][2] = arr[8];
		return matrix;
	}
	
	// convert the double to integer
	public static int toInteger(double num) {
		int value = (int) num;
		return value;
	}
	
	public static int[][] buildRandomMatrix(){
		int[][] matrix = new int[3][3];
		matrix[0][0] = toInteger(Math.round(Math.random()*10));
		matrix[0][1] = toInteger(Math.round(Math.random()*10));
		matrix[0][2] = toInteger(Math.round(Math.random()*10));
		matrix[1][0] = toInteger(Math.round(Math.random()*10));
		matrix[1][1] = toInteger(Math.round(Math.random()*10));
		matrix[1][2] = toInteger(Math.round(Math.random()*10));
		matrix[2][0] = toInteger(Math.round(Math.random()*10));
		matrix[2][1] = toInteger(Math.round(Math.random()*10));
		matrix[2][2] = toInteger(Math.round(Math.random()*10));
		return matrix;
	}
	
	public static int[][] buildVectorMatrix(int[] a, int[] b, int[] c){
		int[][] matrix = new int[3][3];
		int count = 0;
		for(int i: a) {
			matrix[0][count] = i;
			count++;
		}
		count = 0;
		for(int i: b) {
			matrix[1][count] = i;
			count++;
		}
		count = 0;
		for(int i: c) {
			matrix[2][count] = i;
			count++;
		}
		return matrix;
	}
	
	public static boolean compareMatrices(int[][] matrix1, int[][] matrix2) {
		boolean flag = true;
		for (int i = 0; i < matrix1.length; i++) {
			for (int j = 0; j < matrix2.length; j++) {
				if (matrix1[i][j] != matrix2[i][j]) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	
	public static int[][] addMatrices(int[][] a, int[][] b){
		int[][] summedMatrix = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				summedMatrix[i][j] = a[i][j];
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				summedMatrix[i][j] += b[i][j];
			}
		}
		return summedMatrix;
	}
	
	public static int[][] subtractMatrices(int[][] a, int[][] b){
		int[][] subtractedMatrix = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				subtractedMatrix[i][j] = a[i][j];
			}
		}
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < b[i].length; j++) {
				subtractedMatrix[i][j] -= b[i][j];
				if (subtractedMatrix[i][j] < 0) {
					subtractedMatrix[i][j] *= -1;
				}
			}
		}
		return subtractedMatrix;
	}
	
	public static int[][] scalarProductMatrix(int[][] a, int value){
		int[][] Matrix = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				Matrix[i][j] = a[i][j];
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				Matrix[i][j] *= value;
			}
		}
		

		return Matrix;
	}
	
	public static int[][] multiplyMatrices(int[][] m1, int[][] m2){
		int[][] Matrix = new int[3][3];
		Matrix[0][0] = m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0] + m1[0][2] * m2[2][0];
		Matrix[1][0] = m1[1][0] * m2[0][0] + m1[1][1] * m2[1][0] + m1[1][2] * m2[2][0];
		Matrix[2][0] = m1[2][0] * m2[0][0] + m1[2][1] * m2[1][0] + m1[2][2] * m2[2][0];
		Matrix[0][1] = m1[0][0] * m2[0][1] + m1[0][1] * m2[1][1] + m1[0][2] * m2[2][1];
		Matrix[1][1] = m1[1][0] * m2[0][1] + m1[1][1] * m2[1][1] + m1[1][2] * m2[2][1];
		Matrix[2][1] = m1[2][0] * m2[0][1] + m1[2][1] * m2[1][1] + m1[2][2] * m2[2][1];
		Matrix[0][2] = m1[0][0] * m2[0][2] + m1[0][1] * m2[1][2] + m1[0][2] * m2[2][2];
		Matrix[1][2] = m1[1][0] * m2[0][2] + m1[1][1] * m2[1][2] + m1[1][2] * m2[2][2];
		Matrix[2][2] = m1[2][0] * m2[0][2] + m1[2][1] * m2[1][2] + m1[2][2] * m2[2][2];
		return Matrix;
	}
	
	public static int[][] transposeMatrix(int[][] m){
		int[][] Matrix = new int[3][3];
		Matrix[0][0] = m[0][0];
		Matrix[0][1] = m[1][0];
		Matrix[0][2] = m[2][0];
		
		Matrix[1][0] = m[0][1];
		Matrix[1][1] = m[1][1];
		Matrix[1][2] = m[2][1];
		
		Matrix[2][0] = m[0][2];
		Matrix[2][1] = m[1][2];
		Matrix[2][2] = m[2][2];
		
		return Matrix;
	}
	
	public static boolean isSymmetricMatrix(int[][] testmatrix) {
		int[][] a = transposeMatrix(testmatrix);
		return compareMatrices(testmatrix, a);
		
	}
	
	public static int traceMatrix(int[][] matrix) {
		int val = 0;
		val = matrix[0][0] + matrix[1][1] + matrix[2][2];
		return val;
	}
	
	public static int determinant3x3Matrix(int[][] m) {
		int determinant = 0;
		determinant = m[0][0]*m[1][1]*m[2][2] + m[0][1]*m[1][2]*m[2][0] + m[0][2]*m[1][0]*m[2][1] - 
				m[0][2]*m[1][1]*m[2][0] - m[0][1]*m[1][0]*m[2][2] - m[0][0]*m[1][2]*m[2][1];
		return determinant;
	}
	
	public static int[][] powerNMatrix(int[][] N, int val){
		int[][] Matrix = new int[3][3];
		for (int i = 0; i < N.length; i++) {
			for (int j = 0; j < N[i].length; j++) {
				Matrix[i][j] = (int) Math.pow(N[i][j], val);
			}
		}
		return Matrix;
	}
}
