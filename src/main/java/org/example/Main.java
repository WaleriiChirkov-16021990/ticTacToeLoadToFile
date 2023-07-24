package org.example;

import java.io.IOException;

import static org.example.TictacGameSave.loadFieldFromFile;
import static org.example.TictacGameSave.printGameField;

public class Main {
	public static void main(String[] args) {
		String file = "src/main/java/org/example/fileSave/file.txt";
		try {
			int[] field = loadFieldFromFile(file);
			printGameField(field);
		} catch (IOException e) {
			System.out.println("Error loading game field from file: " + e.getMessage());
		}
	}
}