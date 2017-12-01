package TreesGraphs;

import static org.junit.Assert.*;

import org.junit.Test;

public class BalancedTreeReviewer {

	@Test
	public void test() {
		BalancedTreeReviewerInterface reviewer = new RecursiveBalancedTreeReviewer();
		TreeNode tree = new TreeNode(5);
		TreeNode treell1 = new TreeNode(5);
		TreeNode treerl1 = new TreeNode(5);
		TreeNode treell2fn = new TreeNode(5);
		TreeNode treerl2fn = new TreeNode(5);
		TreeNode treell2sn = new TreeNode(5);
		TreeNode treerl2sn = new TreeNode(5);
		
		tree.setLeftNode(treell1);
		tree.setRightNode(treerl1);
		
		treell1.setLeftNode(treell2fn);
		treell1.setRightNode(treerl2fn);
		
		treerl1.setLeftNode(treell2sn);
		treerl1 .setRightNode(treerl2sn);
		
		boolean result = reviewer.isBalanced(tree);
		
	}

}
