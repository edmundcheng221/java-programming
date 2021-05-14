package cheng.PART2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import cheng.PART1.Scouttrooper;
import cheng.PART1.Stormtrooper;

public class Part2 extends Scouttrooper{
	/**
	 * 
	 */
	String STID = "S-00";
	String IDNumber = "ST";
	private static final long serialVersionUID = 1L;

	public Part2(String STID, String IDNumber) {
		super(STID, IDNumber);
		// TODO Auto-generated constructor stub
	}
	public static ArrayList<Scouttrooper> buildScouts(int numTroops) {
		int count = 1;
		String STID = "S-00";
		String IDNumber = "ST";
		ArrayList<Scouttrooper> array = new ArrayList<Scouttrooper>(numTroops);
		for (int i = 0; i < numTroops; i++) {
			STID += count;
			IDNumber += count;
			STID = "S-00";
			IDNumber = "ST";
//			IDNumber += count;
//			STID += count;
//			if (i < 10) {
//				STID += i;
//			}
//			else {
//				STID = "S-0" + i;
//			}
			array.add(new Scouttrooper(STID,IDNumber));
			count++;
		}
		return array;
	}
	public static boolean compareTroopers(Object troop1, Object troop2) {
		String value1 = ((Stormtrooper) troop1).getSTID();
		String value2 = ((Stormtrooper) troop2).getSTID();
		if (value1.equals(value2)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void writeScoutDataToFile(ArrayList<Scouttrooper> arr) throws IOException {
		FileWriter writer = new FileWriter("/Users/edmundcheng/eclipse-workspace/Cheng_FinalS2021_V1/src/cheng/PART2/STData");
		int count = 1;
		for(Scouttrooper str:arr) {
			String a =str.getIDNumber() + count;
//			String b = str.getSTID() + count;
			String b = "S-00" + count;
			writer.write("Scout " + a + " " + b + "\n");
			count++;
		}
//		writer.write("Scout ST1 S-001\n");
//		writer.write("Scout ST2 S-002\n");
//		writer.write("Scout ST3 S-003\n");
		writer.close();
	}
	
	public static void writeScoutDataToConsole(String path) throws IOException {
		BufferedReader reader = new BufferedReader(new FileReader(path));
		String line = reader.readLine();

		while(line != null) {
			System.out.print(line + "...       ");
			line = reader.readLine();
		}
		reader.close();
	}
}
