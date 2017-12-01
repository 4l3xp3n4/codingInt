package TreesGraphs;

import static org.junit.Assert.*;

import org.junit.Test;

public class SortedArrayTreeConvertorTest {

	@Test
	public void shouldCreateABSTFfromSortedArray() {
		int[] testCase = new int[]{1,2,3,4,5,6,8,9,12,23,45,67,89,90};
		
		SortedArrayToBSTConverter converter = new SortedArrayTreeRcursiveConvertor();
		
		TreeNode treeHead = converter.createBST(testCase);
	}

}
