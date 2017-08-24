package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.WordSearch;

public class WordSearchTest {

	@Test
	public void findForward() {
		WordSearch underTest = new WordSearch();
		String searchWord = underTest.LeftToRight("LUKE");
		assertEquals("LUKE", searchWord);
	}

	@Test
	public void findBackward() {
		WordSearch underTest = new WordSearch();
		String searchWord = underTest.RightToLeft("LEIA");
		assertEquals("LEIA", searchWord);
	}

	@Test
	public void findDown() {
		WordSearch underTest = new WordSearch();
		String searchWord = underTest.Down("HAN");
		assertEquals("HAN", searchWord);
	}

	@Test
	public void findUp() {
		WordSearch underTest = new WordSearch();
		String searchWord = underTest.Up("OBIWAN");
		assertEquals("OBIWAN", searchWord);
	}

	@Test
	public void findDownRight() {
		WordSearch underTest = new WordSearch();
		String searchWord = underTest.DownRight("BAT");
		assertEquals("BAT", searchWord);
	}

	@Test
	public void findDownLeft() {
		WordSearch underTest = new WordSearch();
		String searchWord = underTest.DownLeft("MAN");
		assertEquals("MAN", searchWord);
	}

	@Test
	public void findUpRight() {
		WordSearch underTest = new WordSearch();
		String searchWord = underTest.UpRight("ALFRED");
		assertEquals("ALFRED", searchWord);
	}
	
	@Test
	public void findUpLeft() {
		WordSearch underTest = new WordSearch();
		String searchWord = underTest.UpLeft("ROBIN");
		assertEquals("ROBIN", searchWord);
	}
}
