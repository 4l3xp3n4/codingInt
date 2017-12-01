package TreesGraphs;

import java.util.ArrayList;
import java.util.List;

import TreesGraphs.Graph.GraphNodeState;

public class GraphNode {
	
	private Integer value;
	private List<GraphNode> childNodes;
	private GraphNodeState state;
	
	public GraphNode(int value){
		this.value = value;
		this.childNodes = new ArrayList<GraphNode>();
	}
	
	public GraphNode addNode(GraphNode graphNode){
		this.childNodes.add(graphNode);
		return this;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public GraphNodeState getState() {
		return state;
	}

	public void setState(GraphNodeState state) {
		this.state = state;
	}
	
	
	public List<GraphNode> getAdjacentNodes(){
		return this.childNodes;
	}
	

}
