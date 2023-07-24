package org.example;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;


public class TictacGameSave {
	public static int[] loadFieldFromFile(String file) throws IOException {
		int[] field = new int[9];
		try (FileInputStream inputStream = new FileInputStream(file)) {
			for (int i = 0; i < field.length; i++) {
				int value = inputStream.read();
				field[i] = Character.getNumericValue(value);
			}
		}
		System.out.println(Arrays.toString(field));
		return field;
	}
	
	public static void printGameField(int[] field) {
		char[] symbols = {' ', 'x', 'o', '.'};
		for (int i = 0; i < field.length; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println();
			}
			System.out.print(symbols[field[i]]);
			System.out.print(' ');
		}
	}
}