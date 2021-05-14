package cheng.MAIN;

import java.io.IOException;

import java.util.ArrayList;

import cheng.PART1.Assaulttrooper;
import cheng.PART1.Scouttrooper;
import cheng.PART2.Part2;

public class ChengFinal {

	public static void main(String[] args) throws IOException {
		Assaulttrooper A = new Assaulttrooper("ASLT-1","A-001");
		A.displayTrooper();
		A.move();
		ArrayList<Scouttrooper> S = Part2.buildScouts(3);
		Part2.compareTroopers(S.get(0), S.get(1));
		Part2.writeScoutDataToFile(S);
		System.out.println();
		String s = "/Users/edmundcheng/eclipse-workspace/Cheng_FinalS2021_V1/src/cheng/PART2/STData";
		Part2.writeScoutDataToConsole(s);
	}

}
