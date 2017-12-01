package sortingSearching;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortRotatedArrayTest {

	@Test
	public void shouldSortARotatedSortedArray() {
		int[] testCase = new int[]{5,6,7,8,9,1,2,3,4,5};
		
		RotatedSortedArraySorter sorter = new RotatedSortedArraySorterImplementation();
		
		boolean result = sorter.search(testCase, 7);
	}

}
