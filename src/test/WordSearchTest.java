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
}
