package homework;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class homework_1 {

	public static void main(String[] args) {
		// print out the title and the headings
		String heading = "Stormtrooper Movement Calculations Chart";
		System.out.println("                                                "
				+ "          " + heading);
		System.out.println("                  "
				+ "                                             " + "Chart Prepared By Edmund Cheng");
		System.out.print("\n");
		System.out.println("Hour" + "     " + "Current Location" + "     " + "Current Speed" + 
				"     " + "Distance (Hour)" + "     " + "Total Distance (Hour)" + "     " + "Distance Remaining" +
				"     " + "Water Consumed" + "     " + "Water Remaining");
		System.out.println("__________________________________________________________________________"
				+ "_______________________________________________________________________________");
		
		// format to integer
		NumberFormat formatterInt = new DecimalFormat("#0");
		// format to one decimal place
		NumberFormat formatterOne = new DecimalFormat("#0.0");     
		// two decimal places
		NumberFormat formatterTwo = new DecimalFormat("#0.00"); 
		double waterSupply = 18;
		double waterConsumed = 0;
		final double consumptionRate = 1.5;
		// starts at hour 0
		int hour = 0;
		double currentLocationX = 10;
		double currentLocationY = 10;
		double finalLocationX = 30;
		double finalLocationY = 30;
		double distance = 0;
		double currentSpeed = distance;
		double totalDistanceTraveled = 0;
		// total diagonal distance
		double totalDistance = Math.sqrt((Math.pow((finalLocationX - currentLocationX),2) + Math.pow((finalLocationY - currentLocationY),2)));
		double distanceRemaining = totalDistance - totalDistanceTraveled;
		//ratio of the 2 legs
		double ratio = 1;
		boolean flag = true;
		
		while (flag) {
			if (distanceRemaining <= 0) {
				
				flag = false;
				distance = 1;
				currentSpeed = distance;
				currentLocationX += distance / Math.sqrt(ratio + 1);
				currentLocationY = currentLocationX;
				totalDistanceTraveled = totalDistance;
				distanceRemaining = 0;
				if(waterConsumed >= 18) {
					waterConsumed = 0;
					waterSupply = 0;
				}
				if (currentLocationX > finalLocationX) {
					currentLocationX =  finalLocationX;
				}
				if (currentLocationY > finalLocationY) {
					currentLocationY =  finalLocationY;
				}
				
				
			} 

			
			if (hour < 4) {
				if (currentLocationX == Math.floor(currentLocationX)) {
					System.out.println(hour + "        " + formatterInt.format(currentLocationX) + "," + formatterInt.format(currentLocationY) + "     "
							+ "           " + currentSpeed + " kph           " + distance + " km" + "              " + 
							formatterInt.format(totalDistanceTraveled) + " km           "
									+ "           " + formatterTwo.format(distanceRemaining) + " km               " + waterConsumed + " l   "
											+ "           " + waterSupply + " l");
					distance = 4;
					currentSpeed = distance;
					currentLocationX += distance / Math.sqrt(ratio + 1);
					currentLocationY = currentLocationX;
					waterConsumed += consumptionRate;
					totalDistanceTraveled += distance;
					distanceRemaining -= distance;
				}
				else {
					System.out.println(hour + "        " + formatterOne.format(currentLocationX) + "," + formatterOne.format(currentLocationY) + "     "
							+ "       " + currentSpeed + " kph           " + distance + " km" + "              " + 
							formatterInt.format(totalDistanceTraveled) + " km                 "
									+ "     " + formatterTwo.format(distanceRemaining) + " km               " + waterConsumed + " l        "
											+ "      " + waterSupply + " l");
					distance = 4;
					currentSpeed = distance;
					currentLocationX += distance / Math.sqrt(ratio + 1);
					currentLocationY = currentLocationX;
					waterConsumed += consumptionRate;
					totalDistanceTraveled += distance;
					distanceRemaining -= distance;
				}
				
			}
			else if (hour < 8) {
				if (currentLocationX == Math.floor(currentLocationX)) {
					System.out.println(hour + "        " + formatterInt.format(currentLocationX) + "," + formatterInt.format(currentLocationY) + "     "
							+ "       " + currentSpeed + " kph           " + distance + " km"  + "              " + 
							formatterInt.format(totalDistanceTraveled) + " km     " + formatterTwo.format(distanceRemaining) + " km " + waterConsumed + " l       "
									+ "     " + waterSupply + " l");
					distance = 2;
					currentSpeed = distance;
					currentLocationX += distance / Math.sqrt(ratio + 1);
					currentLocationY = currentLocationX;
					waterConsumed += consumptionRate;
					totalDistanceTraveled += distance;
					distanceRemaining -= distance;
				}
				else {
					System.out.println(hour + "        " + formatterOne.format(currentLocationX) + "," + formatterOne.format(currentLocationY) + "     "
							+ "       " + currentSpeed + " kph           " + distance + " km"  + "              " + 
							formatterInt.format(totalDistanceTraveled) + " km              "
									+ "       " + formatterTwo.format(distanceRemaining) + " km                " + waterConsumed + " l     "
											+ "        " + waterSupply + " l");
					distance = 2;
					currentSpeed = distance;
					currentLocationX += distance / Math.sqrt(ratio + 1);
					currentLocationY = currentLocationX;
					waterConsumed += consumptionRate;
					totalDistanceTraveled += distance;
					distanceRemaining -= distance;
				}
				
				
			}
			else {
				// for proper formatting
				if (hour < 10) {
					if(currentLocationX == Math.floor(currentLocationX)) {
						System.out.println(hour + "   " + formatterInt.format(currentLocationX) + "," + formatterInt.format(currentLocationY) + "     "
								+ "           " + currentSpeed + " kph           " + distance + " km"  + "              " + 
								formatterInt.format(totalDistanceTraveled) + " km           "
										+ " " + formatterTwo.format(distanceRemaining) + " km         " + waterConsumed + " l         "
												+ " " + waterSupply + " l");
					}
					else {
						System.out.println(hour + "        " + formatterOne.format(currentLocationX) + "," + formatterOne.format(currentLocationY) + " "
								+ "           " + currentSpeed + " kph           " + distance + " km"  + "              " + 
								formatterInt.format(totalDistanceTraveled) + " km              "
										+ "       " + formatterTwo.format(distanceRemaining) + " km                " + waterConsumed + " l       "
												+ "      " + waterSupply + " l");
					}
					
				}
				else {
					if(currentLocationX == Math.floor(currentLocationX)) {
						System.out.println(hour + "       " + formatterInt.format(currentLocationX) + "," + formatterInt.format(currentLocationY) + "     "
								+ "           " + currentSpeed + " kph           " + distance + " km"  + "              " + 
								formatterOne.format(totalDistanceTraveled) + " km                  "
										+ " " + formatterInt.format(distanceRemaining) + " km                   " + waterConsumed + " l    "
												+ "          " + waterSupply + " l");
						System.out.print("\n");
						System.out.println("The Stormtrooper Squad arrived in " + (hour-1) + " hours and travelled " + 
						formatterTwo.format(totalDistance) + " kilometers");
						System.out.println("The Stormtrooper Squad's average speed was " + formatterTwo.format(totalDistance/(hour-1)) + " kph");
					}

					else {
						System.out.println(hour + "       " + formatterOne.format(currentLocationX) + "," + formatterOne.format(currentLocationY) + "     "
								+ "       " + currentSpeed + " kph           " + distance + " km"  + "              " + 
								formatterInt.format(totalDistanceTraveled) + " km                     " + formatterTwo.format(distanceRemaining) + " km"
										+ "                " + waterConsumed + " l             " + waterSupply + " l");
						
					}
				}
				distance = 1;
				currentSpeed = distance;
				currentLocationX += distance / Math.sqrt(ratio + 1);
				currentLocationY = currentLocationX;
				waterConsumed += consumptionRate;
				totalDistanceTraveled += distance;
				distanceRemaining -= distance;
				

			}
			waterSupply -= consumptionRate;
			hour += 1;
		}
		
		
	}

}
	
