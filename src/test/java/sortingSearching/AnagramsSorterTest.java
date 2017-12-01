package sortingSearching;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class AnagramsSorterTest {

	@Test
	public void shoultSortTheStringGroupingAnagrams() {
		//anagram = perro & errop
		List<String> testCase = Arrays.asList(new String[]{"perro","dad","errop","ujup","add","pollo","iuo","ololp"});
		List<String> expectedResult = Arrays.asList(new String[]{"add","dad","errop","perro","iuo","ujup","ololp","pollo"});
		
		AnagramsSorter sorter = new AnagramsSorterimplementation();
		List<String> result = sorter.sort(testCase);
		
		assertTrue(compareTwoListelements(result,expectedResult));
		
	}
	
	private boolean compareTwoListelements(List<String> l1, List<String> l2){
		if(l1 == null || l2 == null){
			return false;
		}
		if(l1.size() != l2.size()){
			
			return false;
		}
		
		for(int i = 0 ; i< l1.size(); i ++){
			if(!l1.get(i).equals(l2.get(i))){
				return false;
			}
		}
		
		return true;
	}

}
