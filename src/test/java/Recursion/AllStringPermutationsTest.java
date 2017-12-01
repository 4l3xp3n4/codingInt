package Recursion;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

public class AllStringPermutationsTest {

	@Test
	public void test() {
		String testCase ="MaximilianoAlvarado";
		
		AllPermutationsCreator creator = new AllStringPermutationRecursiveCreator();
		List<String> result =creator.createPermutations(testCase);
		
	}

}
