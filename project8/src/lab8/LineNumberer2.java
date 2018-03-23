package lab8;

import java.io.*;
import java.util.*;

public class LineNumberer2 {

	public static void numberLines(File file) throws FileNotFoundException {

		Scanner scanner = new Scanner(file);
		int lineCount = 1;

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			System.out.print(lineCount + " ");
			System.out.println(line);
			lineCount += 1;
		}
		scanner.close();
	}

	public static void countWords(File file) throws FileNotFoundException {
		Scanner scanner = new Scanner(file);

		while (scanner.hasNextLine()) {
			String line = scanner.nextLine();
			String[] words = line.split(" ");
			System.out.print(words.length + " ");
			System.out.println(line);
		}
		scanner.close();
	}

	public static void removeDuplicates(ArrayList<String> words) {
		ArrayList<String> test = new ArrayList<String>();

		for (int i = 0; i < words.size(); i++) {
			if (!test.contains(words.get(i))) {
				test.add(words.get(i));
			}
		}

		words.clear();
		words.addAll(test);

		System.out.println(words.toString());
	}

	public static void main(String[] args) throws FileNotFoundException {
		// Uncomment each block of code for Checkpoints 1 and 2
		
		// Checkpoint 1
		/*
		File file = new File("..\\project7\\src\\lab7\\Deck.java");
		numberLines(file);
		
		File file1 = new File("story.txt");
		countWords(file1);
		*/
		
		
		// Checkpoint 2
		// For this checkpoint type the string of text you would like to check against in the console
		/*
		ArrayList<String> words = new ArrayList<String>();
		Scanner in = new Scanner(System.in);
		String[] temp = in.nextLine().split(" ");
		for (String word : temp)
			words.add(word);

		removeDuplicates(words);
		*/
	}
}
