package Recursion;

import java.util.ArrayList;
import java.util.List;

public class AllsubSetsRecursiveSolution implements AllSubSets {

	public List<List<Integer>> getSubsets(List<Integer> testCase) {
		return getSubsets(testCase, 0);
	}
	
	private  List<List<Integer>> getSubsets(List<Integer> set, int index){
		List<List<Integer>> allsubsets;
		if (set.size() == index) {
			allsubsets = new ArrayList<List<Integer>>();
			allsubsets.add(new ArrayList<Integer>()); // Empty set
		} else {
			allsubsets = getSubsets(set, index + 1);
			int item = set.get(index);
			List<List<Integer>> moresubsets =
					new ArrayList<List<Integer>>();
			for (List<Integer> subset : allsubsets) {
				List<Integer> newsubset = new ArrayList<Integer>();
				newsubset.addAll(subset); //
				newsubset.add(item);
				moresubsets.add(newsubset);
			}
			allsubsets.addAll(moresubsets);
			}
		return allsubsets;
		
	}

}
