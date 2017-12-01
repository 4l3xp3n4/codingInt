package Recursion;

import java.util.LinkedList;
import java.util.List;

public class AllStringPermutationRecursiveCreator implements AllPermutationsCreator {

	@Override
	public LinkedList<String> createPermutations(String testCase) {
		LinkedList<String> result = new LinkedList<String>();
		
		if(testCase.length() == 0){
			result.add("");
			return result;
		}
		
		char firstChar = testCase.charAt(0);
		String remainder  = testCase.substring(1);
		
		List<String> previousPermutations = createPermutations(remainder); 
		
		for(String word: previousPermutations){
			for(int i = 0 ; i <= word.length(); i ++){
				result.add(insertCharAt(word,i,firstChar));
			}
		}
		
		return result;
	}
	
	private String insertCharAt(String word, int index, char c){
		StringBuilder sb = new StringBuilder();
		sb.append(word.substring(0,index));
		sb.append(c);
		sb.append(word.substring(index));
		return sb.toString(); 
		
	}

}
