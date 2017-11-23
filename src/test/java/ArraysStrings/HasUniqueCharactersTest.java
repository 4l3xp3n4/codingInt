package ArraysStrings;

import static org.junit.Assert.*;

import org.junit.Test;

import ArraysStrings.ArrayMethodUniquenessReviewer;
import ArraysStrings.UniquenesReviewer;

public class HasUniqueCharactersTest {

	@Test
	public void shouldReturnTrueForStringWithOnlyUniqueCharacters() {
		String uniqueCharactersString = "abcdefg";
		UniquenesReviewer stringreviewer = new ArrayMethodUniquenessReviewer();
		Boolean result = stringreviewer.hasUniqueCharacters(uniqueCharactersString);
		
		assertEquals(Boolean.TRUE, result);
	}
	
	@Test
	public void shouldReturnFalseWhenStringContainsADuplicatedCharacter(){
		String notUniqueCharactersString = "abccdeff";
		UniquenesReviewer stringreviewer = new ArrayMethodUniquenessReviewer();
		Boolean result = stringreviewer.hasUniqueCharacters(notUniqueCharactersString);
		assertNotEquals(Boolean.TRUE, result);
	}

}
