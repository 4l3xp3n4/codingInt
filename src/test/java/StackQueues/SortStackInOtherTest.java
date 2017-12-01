package StackQueues;

import static org.junit.Assert.*;

import java.util.Stack;

import org.junit.Test;

import StacksQueues.SortStackInOtherTestSolution;

public class SortStackInOtherTest {

	@Test
	public void test() {
		SortStackInOtherTestSolution stackSorter = new TwoStackSolution();
		Stack<Integer> unsortedStack = new Stack<Integer>();
		unsortedStack.push(3);
		unsortedStack.push(5);
		unsortedStack.push(8);
		unsortedStack.push(2);
		unsortedStack.push(9);
		unsortedStack.push(2);
		unsortedStack.push(3);
		
		
		Stack<Integer> result = stackSorter.sort(unsortedStack);
	}

}
