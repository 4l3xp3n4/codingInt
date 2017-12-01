package TreesGraphs;

import java.util.LinkedList;

import TreesGraphs.Graph.GraphNodeState;

public class GraphPathFinderStackSolution implements GraphPathFinder {

	public boolean isThereAPath(GraphNode  start, GraphNode end, Graph graph) {
		LinkedList<GraphNode> q = new LinkedList<GraphNode>();
		
		for(GraphNode nodeElement : graph.getNodes()){
			nodeElement.setState(GraphNodeState.UNVISITED);
		}
		
		start.setState(GraphNodeState.VISITING);
		q.add(start);
		
		GraphNode u;
		while(!q.isEmpty()){
			u = q.removeFirst();
			if(u != null){
				for(GraphNode node : u.getAdjacentNodes()){
					if(node.getState() == GraphNodeState.UNVISITED){
						if(node == end){
							return true;
						}else{
							u.setState(GraphNodeState.VISITING);
							q.add(node);
						}
					}
				}
				u.setState(GraphNodeState.VISITED);
			}
		}
		return false;
	}

}
