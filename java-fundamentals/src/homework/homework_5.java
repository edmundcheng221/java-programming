package homework;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class homework_5 {
	
	public static String DIR = "/Users/edmundcheng/eclipse-workspace/java-fundamentals/src/homework/";
	public static String[] Letters = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"}; 
	public static String[] digits = {"0","1","2","3","4","5","6","7","8","9"}; 
	
	public static String generateFourCharacters() {
		String Code = "";
		for (int i = 0; i < 2; i++) {
			Random r = new Random();
			int low = 0;
			int high = 25;
			int result = r.nextInt(high-low) + low;
			Code += Letters[result];
		}
		for (int i = 0; i < 2; i++) {
			Random r = new Random();
			int low = 0;
			int high = 9;
			int result = r.nextInt(high-low) + low;
			Code += digits[result];
		}
		return Code;
	}
	
	public static void generateAlphaNumericCode(int numRows, int numCol, String filename) throws IOException {
		BufferedWriter outputWriter = null;
		File F = new File(DIR + filename); 
		
		String returnString = "";
		for (int j = 0; j < numRows; j++) {
			for (int i = 0; i < numCol; i++) {
				returnString += generateFourCharacters();
				returnString += " ";
			}
			returnString += "\n";
		}
		try {
			outputWriter = new BufferedWriter(new FileWriter(F));
			outputWriter.write(returnString);
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			outputWriter.close();
		}

	}
	
	public static void extractNumbersLettersToFile(String file, String AlphaNumbers, String AlphaLetters) throws IOException {
		
		BufferedReader inputReader = null;
		BufferedWriter outputWriterNum = null;
		BufferedWriter outputWriterLet = null;
		File inputFile = new File(DIR + file);
		File NumbersFile = new File(DIR + AlphaNumbers);
		File LettersFile = new File(DIR + AlphaLetters);
		String num = "";
		String let = "";
		try {
			inputReader = new BufferedReader(new FileReader(inputFile));
			outputWriterNum = new BufferedWriter(new FileWriter(NumbersFile));
			outputWriterLet = new BufferedWriter(new FileWriter(LettersFile));
			String text;
			String returnedString = "";
			int len = 0;
			
			while ((text = inputReader.readLine()) != null) {
				len = text.length();
				returnedString += text;
				returnedString += "\n";
			}
			Scanner s = new Scanner(returnedString);

			int countlet = 0;
			int countnum = 0;
			while (s.hasNext()) {
				if (countlet == 10 || countlet == 20 || countlet == 30 || countlet == 40 || countlet == 50) {
					let += "\n";
				}
				if (countnum == 10 || countnum == 20 || countnum == 30 || countnum == 40 || countnum == 50) {
					num += "\n";
				}
				let += s.next().charAt(0);
				countlet += 1;
				let += " ";
				let += s.next().charAt(1);
				countlet += 1;
				let += " ";
				num += Integer.toString(s.next().charAt(2));
				countnum += 1;
				num += " ";
				num += Integer.toString(s.next().charAt(3));
				countnum += 1;
				num += " ";
			}

			s.close();
			Scanner a = new Scanner(returnedString);
			int sum = 0;

			while (a.hasNext()) {
				sum += a.next().charAt(2);
				sum += a.next().charAt(3);
			}
			a.close();
			
			Scanner b = new Scanner(returnedString);
			int countH = 0;
			int countL = 0;
			int countG = 0;
			String allLetters = "";
			while (b.hasNext()) {
				allLetters += b.next().charAt(0);
				allLetters += b.next().charAt(1);
			}
			a.close();
			for (char ch : allLetters.toCharArray()) {
				if (ch == 'H') {
					countH += 1;
				}
				else if (ch == 'G') {
					countG += 1;
				}
				else if (ch == 'L') {
					countL += 1;
				}
				else {
					continue;
				}
			}
			outputWriterLet.write(let);
			outputWriterLet.write("\n");
			outputWriterLet.write("There are " + countH + " Hs in this file");
			outputWriterLet.write("\n");
			outputWriterLet.write("There are " + countG + " Gs in this file");
			outputWriterLet.write("\n");
			outputWriterLet.write("There are " + countL + " Ls in this file");
			outputWriterNum.write(num);
			outputWriterNum.write("\n");
			outputWriterNum.write("The sum of the numbers in this file is: " + sum);
			
		}

		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			outputWriterNum.close();
			outputWriterLet.close();
		}
	}
	
	
	public static void main(String[] args) throws IOException {
		generateAlphaNumericCode(10,10,"AlphaCode");
		extractNumbersLettersToFile("AlphaCode","AlphaNumbers","AlphaLetters");

	}
	
}
