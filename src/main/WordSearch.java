package main;

import java.util.ArrayList;

public class WordSearch {

	static char puzzle[][] = { { 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
			{ 'L', 'U', 'K', 'E', 'X', 'X', 'N', 'X', 'X' }, { 'A', 'I', 'E', 'L', 'X', 'X', 'A', 'X', 'X' },
			{ 'X', 'X', 'X', 'X', 'X', 'X', 'W', 'X', 'X' }, { 'H', 'X', 'X', 'X', 'X', 'X', 'I', 'X', 'X' },
			{ 'A', 'X', 'X', 'X', 'X', 'X', 'B', 'X', 'X' }, { 'N', 'X', 'X', 'X', 'X', 'X', 'O', 'X', 'X' },
			{ 'N', 'X', 'X', 'X', 'X', 'X', 'X', 'X', 'X' }, { 'X', 'I', 'X', 'X', 'X', 'X', 'X', 'X', 'X' },
			{ 'X', 'X', 'B', 'X', 'X', 'X', 'D', 'X', 'X' }, { 'X', 'X', 'X', 'O', 'X', 'E', 'B', 'X', 'M' },
			{ 'X', 'X', 'X', 'X', 'R', 'X', 'X', 'A', 'X' }, { 'X', 'X', 'X', 'F', 'X', 'X', 'N', 'X', 'T' },
			{ 'X', 'X', 'L', 'X', 'X', 'X', 'X', 'X', 'X' }, { 'X', 'A', 'X', 'X', 'X', 'X', 'X', 'X', 'X' } };

	public static void main(String[] args) {

		System.out.println("LUKE, LEIA, HAN, OBIWAN, BAT, MAN, ALFRED, ROBIN");
		display(puzzle);
		System.out.println("");
	}

	public static void display(char dis[][]) { // displays puzzle after header
		for (int x = 0; x < dis.length; x++) {
			for (int c = 0; c < dis[x].length; c++) {
				System.out.print(dis[x][c] + "  ");
			}
			System.out.println("");
		}
	}

	public static String LeftToRight(String searchWord) { // searches
															// horizontally left
															// to right
		int k = 0;
		String found = ""; // variable used for jUnit test
		for (int y = 0; y < puzzle.length; y++) {
			for (int x = 0; x < puzzle[y].length; x++) {
				if (searchWord.charAt(k) == puzzle[y][x]) {
					k++;
				} else {
					k = 0;
				}
				if (k == searchWord.length()) {
					System.out.print(searchWord + ":" + "\t");
					for (int col = x - k + 1; col <= x; col++) {
						System.out.print(" " + "(" + col + "," + y + ")");
						k = 0;
					}
					System.out.println("");
					found = searchWord;
				}
			}
		}
		return found;
	}

	public static String RightToLeft(String searchWord) { // searches
															// horizontally
															// right to left
		int k = 0;
		String found = ""; // variable used for jUnit test
		for (int y = 0; y < puzzle.length; y++) {
			for (int x = puzzle[y].length - 1; x >= 0; x--) {
				if (searchWord.charAt(k) == puzzle[y][x]) {
					k++;
				} else {
					k = 0;
				}
				if (k == searchWord.length()) {
					System.out.print(searchWord + ":" + "\t");
					for (int col = x + k - 1; col >= x; col--) {
						System.out.print(" " + "(" + col + "," + y + ")");
						k = 0;
					}
					System.out.println("");
					found = searchWord;
				}
			}
		}
		return found;
	}

	public static String Down(String searchWord) { // searches vertically down

		int k = 0;
		int j = 0;
		String found = ""; // variable used for jUnit test
		for (int x = 0; x < puzzle[j].length; x++) {
			for (int y = 0; y < puzzle.length; y++) {
				if (searchWord.charAt(k) == puzzle[y][x]) {
					k++;
				} else {
					k = 0;
				}
				if (k == searchWord.length()) {
					System.out.print(searchWord + ":" + "\t");
					for (int row = y - k + 1; row <= y; row++) {
						System.out.print(" " + "(" + x + "," + row + ")");
						k = 0;
					}
					System.out.println("");
					found = searchWord;
				}
			}
			j++;
		}
		return found;
	}

	public static String Up(String searchWord) { // searches vertically up

		int k = 0;
		int j = 0;
		String found = "";// variable used for jUnit test
		for (int x = 0; x < puzzle[j].length; x++) {
			for (int y = puzzle[x].length - 1; y > 0; y--) {
				if (searchWord.charAt(k) == puzzle[y][x]) {
					k++;
				} else {
					k = 0;
				}
				if (k == searchWord.length()) {
					System.out.print(searchWord + ":" + "\t");
					for (int row = y + k - 1; row >= y; row--) {
						System.out.print(" " + "(" + x + "," + row + ")");
						k = 0;
					}
					System.out.println("");
					found = searchWord;
				}
			}
			j++;
		}
		return found;
	}

	public static String DownRight(String searchWord) { // searches diagonally
														// down and right
		int k = 0;
		int j = 0;
		String found = "";// variable used for jUnit test
		for (int y = 0; y < puzzle.length; y++) {
			j = y;
			for (int x = 0; x < puzzle[y].length; x++) {
				if (searchWord.charAt(k) == puzzle[j][x]) {
					k++;
					j++;
				} else {
					k = 0;
					j = y;
				}
				if (k == searchWord.length()) {
					System.out.print(searchWord + ":" + "\t");
					j = y;
					for (int col = x - k + 1; col <= x; col++) {
						System.out.print(" " + "(" + col + "," + j + ")");
						k = 0;
						j++;
					}
					j = 0;
					System.out.println("");
					found = searchWord; 
				}
			}
		}
		return found;
	}

	public static String DownLeft(String searchWord) { // searches diagonally
		// down and left
		int k = 0;
		int j = 0;
		String found = "";// variable used for jUnit test
		for (int y = 0; y < puzzle.length; y++) {
			j = y;
			for (int x = puzzle[y].length - 1; x > 0; x--) {
				if (searchWord.charAt(k) == puzzle[j][x]) {
					k++;
					j++;
				} else {
					k = 0;
					j = y;
				}
				if (k == searchWord.length()) {
					System.out.print(searchWord + ":" + "\t");
					j = y;
					for (int col = x + k - 1; col >= x; col--) {
						System.out.print(" " + "(" + col + "," + j + ")");
						k = 0;
						j++;
					}
					j = 0;
					System.out.println("");
					found = searchWord;
				}
			}
		}
		return found;
	}

	public static String UpRight(String searchWord) { // searches diagonally up
		// and right
		int k = 0;
		int j = 0;
		String found = "";// variable used for jUnit test
		for (int y = 0; y < puzzle.length; y++) {
			j = y;
			for (int x = 0; x < puzzle[y].length; x++) {
				if (searchWord.charAt(k) == puzzle[j][x]) {
					k++;
					j--;
				} else {
					k = 0;
					j = y;
				}
				if (k == searchWord.length()) {
					System.out.print(searchWord + ":" + "\t");
					j = y;
					for (int col = x - k + 1; col <= x; col++) {
						System.out.print(" " + "(" + col + "," + j + ")");
						k = 0;
						j--;
					}
					j = 0;
					System.out.println("");
					found = searchWord;
				}
			}
		}
		return found;
	}

	public static String UpLeft(String searchWord) { // searches diagonally
		// up and left

		int k = 0;
		int j = 0;
		String found = "";// variable used for jUnit test
		for (int y = 0; y < puzzle.length; y++) {
			j = y;
			for (int x = puzzle[y].length - 1; x >= 0; x--) {
				if (searchWord.charAt(k) == puzzle[j][x]) {
					k++;
					j--;
				} else {
					k = 0;
					j = y;
				}
				if (k == searchWord.length()) {
					System.out.print(searchWord + ":" + "\t");
					j = y;
					for (int col = x + k - 1; col >= x; col--) {
						System.out.print(" " + "(" + col + "," + j + ")");
						k = 0;
						j--;
					}
					j = 0;
					System.out.println("");
					found = searchWord;
				}
			}
		}
		return found;
	}
} // end class WordSearch