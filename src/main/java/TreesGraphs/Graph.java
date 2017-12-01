package TreesGraphs;

import java.util.ArrayList;
import java.util.List;


public class Graph {
	

	private List<GraphNode> nodes;

	public Graph(List<GraphNode> nodes){
		this.nodes = nodes;
	}
	
	public Graph(){
		this.nodes = new ArrayList<GraphNode>();
	}
	
	public Graph addNode(GraphNode node){
		this.nodes.add(node);
		return this;
	}
	
	public enum GraphNodeState{
		UNVISITED,VISITED,VISITING;
	}	
	
	
	public List<GraphNode> getNodes(){
		return this.nodes;
	}
}

