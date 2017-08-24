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

} // end class WordSearch