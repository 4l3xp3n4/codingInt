package StackQueues;

import static org.junit.Assert.*;

import org.junit.Test;

import StacksQueues.ThreeStackArray;

public class ThreeStackArrayTest {

	@Test
	public void test() {
		ThreeStackArray stacks = new ThreeStackArray(100);
		
		
		stacks.push(5, 1);
		stacks.pop(1);
		
		stacks.push(6, 2);
		stacks.pop(2);
		
		stacks.pop(1);
		
		
		
	}

}
