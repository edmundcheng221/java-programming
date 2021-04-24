package homework;

public class extraCredit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	//Helper
	
	public static boolean checkIf2DArray(int[][] arr) {
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
	public static boolean checkIf2DArray(double[][] arr) {
		int count = 0; 
		int count2 = 0;
		for (double[] i: arr) {
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
	
	public static void display2DArray(int[][] arr) {
		boolean val = checkIf2DArray(arr);
		if (val == true) {
			for (int i[]:arr) {
				System.out.println(i);
			}
		}
		else {
			String string = "";
			for (int i[]:arr) {
				for (int ele:i) {
					string += Double.toString(ele);
					string += " ";
				}
			}
			StringBuilder sb = new StringBuilder(string);
			sb.reverse();
			System.out.print(sb.toString());
		}
		
	}
	
	public static void display2DArray(double[][] arr) {
		boolean val = checkIf2DArray(arr);
		if (val == true) {
			for (double i[]:arr) {
				System.out.println(i);
			}
		}
		else {
			String string = "";
			for (double i[]:arr) {
				for (double ele:i) {
					string += Double.toString(ele);
					string += " ";
				}
			}
			StringBuilder sb = new StringBuilder(string);
			sb.reverse();
			System.out.print(sb.toString());
		}
		
	}
	
	public static void linearSum() {
		
	}
	
	
	
	

}
