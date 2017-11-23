package StackQueues;

import java.util.Stack;

public class TwoStackSolution implements SortStackInOtherTestSolution {

	public Stack<Integer> sort(Stack<Integer> unsortedStack) {
		Stack<Integer> result = new Stack<Integer>();
		Integer element = unsortedStack.pop();
		
		while(!unsortedStack.isEmpty()){
			if(result.isEmpty()){
				result.push(element);
			}
			else{
				while( !result.isEmpty() && result.peek() > element ){
					unsortedStack.push(result.pop());
				}
				result.push(element);
			}
			element = unsortedStack.pop();
		}
		return result;
	}

}
