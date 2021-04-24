package homework;

public class homework_4 {

	public static String[][] Players_Phase1 = {
			{"Alpha-1", "100", "48", "2", "10"},
			{"Beta-1", "60", "87", "3", "8"},
			{"Gamma-1", "70", "76", "4", "6"},
			{"Tau-1", "30", "100", "20", "10"},
			{"AI-1", "145", "4", "1", "12"}};
	
	public static String[][] Players_Phase2 = {
			{"Alpha-2", "42", "50", "5", "10"},
			{"Beta-2", "39", "51", "7", "9"},
			{"Gamma-2", "48", "40", "9", "5"},
			{"Tau-2", "26", "61", "10", "10"},
			{"AI-2", "96", "1", "0", "1"}};
	
	public static void main(String[] args) {
		displayAllPlayerStatistics();

	}
	
	// Task 1
	public static double convertToDouble(String v) {
		double val = Double.parseDouble(v);
		return val;
	}
	


	// Task 2
	public static int convertToInteger(String v) {
		int val = Integer.valueOf(v);
		return val;
	}
	
	// Task 3
	public static double getAverage(String v1, String v2) {
		double val1 = convertToDouble(v1);
		double val2 = convertToDouble(v2);
		double average = (val1 + val2)/2;
		return average;
	}
	
	// Helper
	public static int toInteger(double num) {
		int value = (int) num;
		return value;
	}
	
	// Task 4
	public static String winPercentage(String[] player) {
		double wins = 0;
		double loss = 0;
		double tie = 0;
		double count = 0;
		for (String ele: player) {
			if (count == 1) {
				wins += convertToInteger(ele);
			}
			else if (count == 2){
				loss += convertToInteger(ele);
			}
			else if (count == 3){
				tie += convertToInteger(ele);
			}
			count += 1;
		}
		double win_percent = (wins*100) / (wins + loss + tie);
		String val = String.valueOf(win_percent);
		if (Math.round(win_percent) == win_percent) {
			val = String.format("%,.0f", win_percent);
		}
		else {
			val = String.format("%,.2f", win_percent);
		}
		
		return val;
	}
	
	// Task 5
	public static String lostPercentage(String[] player) {
		double wins = 0;
		double loss = 0;
		double tie = 0;
		double count = 0;
		for (String ele: player) {
			if (count == 1) {
				wins += convertToInteger(ele);
			}
			else if (count == 2){
				loss += convertToInteger(ele);
			}
			else if (count == 3){
				tie += convertToInteger(ele);
			}
			count += 1;
		}

		double loss_percent = ((loss+tie)*100) / (wins + loss + tie);
		String val = String.valueOf(loss_percent);
		if (Math.round(loss_percent) == loss_percent) {
			val = String.format("%,.0f", loss_percent);
		}
		else {
			val = String.format("%,.2f", loss_percent);
		}
		
		return val;
	}
	
	// Task 6
	public static String tieLossPercentage(String[] player) {
		double wins = 0;
		double loss = 0;
		double tie = 0;
		double count = 0;
		for (String ele: player) {
			if (count == 1) {
				wins += convertToInteger(ele);
			}
			else if (count == 2){
				loss += convertToInteger(ele);
			}
			else if (count == 3){
				tie += convertToInteger(ele);
			}
			count += 1;
		}
		double tieLoss_percent = (tie*100) / (loss);
		String val = String.valueOf(tieLoss_percent);
		if (Math.round(tieLoss_percent) == tieLoss_percent) {
			val = String.format("%,.0f", tieLoss_percent);
		}
		else {
			val = String.format("%,.2f", tieLoss_percent);
		}
		
		return val;
	}
	
	
	// Task 7
	public static void displayAllPlayerStatistics() {
		System.out.println("                           ALL PLAYERS STATISTICS");
		System.out.println("Player          Wins                 Losses          Ties          Win%          Loss%          TieLoss%          Current Level");
		System.out.print("\n");
		System.out.println("          PHASE I");
		double sum1 = 0;
		double loss1 = 0;
		double tie1 = 0;
		for (String[] ele: Players_Phase1) {
			System.out.print(ele[0]);
			System.out.print("        ");
			System.out.print(ele[1]);
			System.out.print("             ");
			System.out.print(ele[2]);
			System.out.print("                ");
			System.out.print(ele[3]);
			System.out.print("             ");
			System.out.print(winPercentage(ele));
			System.out.print("             ");
			System.out.print(lostPercentage(ele));
			System.out.print("                 ");
			System.out.print(tieLossPercentage(ele));
			System.out.print("                      ");
			System.out.print(ele[4]);
			System.out.print("                    ");
			System.out.print("\n");
			sum1 += Double.parseDouble(ele[1]);
			
			loss1 += Double.parseDouble(ele[2]);
			
			tie1 += Double.parseDouble(ele[3]);
			
		}

		System.out.println("                                                     " + "Agregated Wins: " + (int) sum1 + " Agregated Losses: " + (int) loss1 + " Agregated Ties: " + (int) tie1);
		System.out.println("PHASE II");
		double sum2 = 0;
		double loss2 = 0;
		double tie2 = 0;
		for (String[] ele: Players_Phase2) {
			System.out.print(ele[0]);
			System.out.print("        ");
			System.out.print(ele[1]);
			System.out.print("             ");
			System.out.print(ele[2]);
			System.out.print("                 ");
			System.out.print(ele[3]);
			System.out.print("             ");
			System.out.print(winPercentage(ele));
			System.out.print("             ");
			System.out.print(lostPercentage(ele));
			System.out.print("             ");
			System.out.print(tieLossPercentage(ele));
			System.out.print("                   ");
			System.out.print(ele[4]);
			System.out.print("                    ");
			System.out.print("\n");
			sum2 += Double.parseDouble(ele[1]);
			
			loss2 += Double.parseDouble(ele[2]);
			
			tie2 += Double.parseDouble(ele[3]);
		}
		System.out.println("                                                     " + "Agregated Wins: " + (int) sum2 + " Agregated Losses: " + (int) loss2 + " Agregated Ties: " + (int) tie2);
		System.out.print("\n");
		System.out.println("_________________________________________________________________");
		System.out.println("                  Chart Prepared by Edmund Cheng");

	}

}
