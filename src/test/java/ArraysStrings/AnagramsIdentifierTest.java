package ArraysStrings;

import static org.junit.Assert.*;

import org.junit.Test;

public class AnagramsIdentifierTest {

	@Test
	public void shouldReturnTrueWhentwoGivenStringsAreAnagrams() {
		String firstStringTestCase = "apple";
		String secondStringTestCase = "aleppp";
		
		AnagramIdentifier identifier = new AnagramIdentifierInstance();
		
		boolean result = identifier.areAnagrams(firstStringTestCase, secondStringTestCase);
		
		assertEquals(Boolean.TRUE, result);
		
	}

}
