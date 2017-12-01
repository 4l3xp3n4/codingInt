package TreesGraphs;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;

public class GraphPathFinderTest {
	
	Graph g = new Graph();
	 GraphNode n1 = new GraphNode(1);
	 GraphNode n2 = new GraphNode(2);
	 GraphNode n3 = new GraphNode(3);
	 GraphNode n4 = new GraphNode(4);
	 GraphNode n5 = new GraphNode(5);
	 GraphNode n6 = new GraphNode(6);
	 GraphNode n7 = new GraphNode(7);
	 GraphNode n8 = new GraphNode(8);
	 GraphNode n9 = new GraphNode(9);
	 GraphNode n10 = new GraphNode(10);
	
	@Before
	public void setUpGraph(){
		

		 
		 n1.addNode(n2).addNode(n3);
		 n3.addNode(n4);
		 n4.addNode(n1);
		 n5.addNode(n6).addNode(n7);
		 n7.addNode(n2);
		 n8.addNode(n9).addNode(n10);
		 
		 
		 Arrays.asList(n1,n2,n3,n4,n5,n6,n7,n8,n9,n10).forEach(n->g.addNode(n));
	}

	@Test
	public void shouldReturnFalseForTwoUnconnectedPointsInaGraph() {
		
		
         GraphPathFinder pathfinder = new GraphPathFinderStackSolution();
         boolean result = pathfinder.isThereAPath(n1, n8, g);
         
         assertEquals(Boolean.FALSE, result);
	}
	
	@Test
	public void shouldReturnTrueForTwoConnectedPointsInaGraph() {
		
		
         GraphPathFinder pathfinder = new GraphPathFinderStackSolution();
         boolean result = pathfinder.isThereAPath(n1, n4, g);
         
         assertEquals(Boolean.TRUE, result);
	}

}
