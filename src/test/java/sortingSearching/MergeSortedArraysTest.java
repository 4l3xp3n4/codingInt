package sortingSearching;

import static org.junit.Assert.*;

import org.junit.Test;

public class MergeSortedArraysTest {

	@Test
	public void shouldReturnMergedArraysInFirstArray () {
		Integer [] testCaseFirstArray = new Integer[12];
		testCaseFirstArray[0] = 1;
		testCaseFirstArray[1] = 3;
		testCaseFirstArray[2] = 7;
		testCaseFirstArray[3] = 9;
		testCaseFirstArray[4] = 10;
		testCaseFirstArray[5] = 11;
		
		Integer[] testCaseSecondArray = new Integer[]{2,3,5,6,9,12};
		
		Integer[] expectedResult = new Integer[]{1,2,3,3,5,6,7,9,9,10,11,12};
		SortedArraysMerger merger = new SortedArraysMergerImplementation();
		
		Integer[] result = merger.merge(testCaseFirstArray, testCaseSecondArray);
		
		assertArrayEquals(result, expectedResult);
	}
	

}
