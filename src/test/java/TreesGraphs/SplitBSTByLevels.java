package TreesGraphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class SplitBSTByLevels {

	public List<LinkedList<TreeNode>> splittree(TreeNode head){
		List<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		int level = 0;
		LinkedList<TreeNode> levelElements = new LinkedList<TreeNode>();
		levelElements.add(head);
		result.add(level,levelElements);
		
		while(Boolean.TRUE){
			levelElements = new LinkedList<>();
			for(int i = 0; i < result.get(level).size(); i++){
				TreeNode node = result.get(level).get(i);
				
				if(node!= null){
					if(node.getLeftNode() != null){
						levelElements.add(node.getLeftNode());
					}
					if(node.getRightNode() != null){
						levelElements.add(node.getRightNode());
					}
				}
			}
			
			if(levelElements.size() > 0){
				result.add(level+1, levelElements);
			}
			level++;
		}
		
		return result;
	}
	
}
