package ArraysStrings;

import static org.junit.Assert.*;

import org.junit.Test;

import ArraysStrings.DuplicateCharactersRemover;
import ArraysStrings.DuplicatesRemover;

public class DuplicatesRemoverTest {

	@Test
	public void shouldRemoveDuplicatedCharacters() {
		String testCase = "aaaaaaaaaaa";
		String expectedString = "a";
		
		DuplicateCharactersRemover remover = new DuplicatesRemover();
		String result = remover.remove(testCase);
		
		assertEquals(expectedString, result);
	}

}
