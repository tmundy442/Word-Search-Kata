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
	
}
