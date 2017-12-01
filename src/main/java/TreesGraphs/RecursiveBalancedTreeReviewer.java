package TreesGraphs;

public class RecursiveBalancedTreeReviewer implements BalancedTreeReviewerInterface {

	public boolean isBalanced(TreeNode tree) {
		return (getMaxDepth(tree) - getMinDepth(tree)) < 2;
	}
	
	public int getMaxDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		
		return 1 + Math.max(getMaxDepth(root.getLeftNode()), getMaxDepth(root.getRightNode()));
		
	}
	
	public int getMinDepth(TreeNode root){
		if(root == null){
			return 0;
		}
		
		return 1 + Math.max(getMaxDepth(root.getLeftNode()), getMaxDepth(root.getRightNode()));
	}

}
