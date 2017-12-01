package TreesGraphs;

import java.util.Arrays;

public class SortedArrayTreeRcursiveConvertor implements SortedArrayToBSTConverter {

	@Override
	public TreeNode createBST(int[] values){
		if(values.length == 1){
			return new TreeNode(values[0]);
		}
		int pivotIndex = values.length/2;
		TreeNode head = new TreeNode(values[pivotIndex]);
		
		head.setLeftNode(this.createBST(Arrays.copyOfRange(values, 0, pivotIndex)));
		head.setRightNode(this.createBST(Arrays.copyOfRange(values, pivotIndex, values.length)));
		
		return head;
	}

}
