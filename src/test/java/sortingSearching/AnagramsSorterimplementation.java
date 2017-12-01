package sortingSearching;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class AnagramsSorterimplementation implements AnagramsSorter {

	@Override
	public List<String> sort(List<String> testCase) {
		return testCase.stream()
				.sorted((a,b)-> sortString(a).compareTo(sortString(b)))
				.collect(Collectors.toList());
	}
	
	private String sortString(String s){
		char[] stringChars = s.toCharArray();
		Arrays.sort(stringChars);
		StringBuilder sb = new StringBuilder();
		
		for(char c : stringChars){
			sb.append(c);
		}
		
		return  sb.toString();
	}

}
