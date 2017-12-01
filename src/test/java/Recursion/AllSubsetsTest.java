package Recursion;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.TestResult;

public class AllSubsetsTest {

	@Test
	public void test() {
		
		List<Integer> testCase = Arrays.asList( new Integer[]{1,2,3,4,5});
		AllSubSets allsubsets = new AllsubSetsRecursiveSolution();
		
		 allsubsets.getSubsets(testCase);
		 
	}

}
