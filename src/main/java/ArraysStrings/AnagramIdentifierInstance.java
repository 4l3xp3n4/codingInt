package ArraysStrings;

import java.util.HashMap;
import java.util.Map;

public class AnagramIdentifierInstance implements AnagramIdentifier {

	public boolean areAnagrams(String firstString, String secondString) {
		if(firstString == null || secondString == null ){
			return false;
		}
		if(firstString.length() != secondString.length()){
			return false;
		}
		
		Map<Character, Integer> charactersMap = new HashMap<Character, Integer>();
		
		for(int i = 0 ; i < firstString.length() ; i++){
			char c = firstString.charAt(i);
			if(charactersMap.containsKey(firstString.charAt(i))){
				int charCount = charactersMap.get(c);
				charCount++;
				charactersMap.put(c, charCount);
			}
			else{
				charactersMap.put(c, 1);
			}
		}
		
		for(int i = 0 ; i < secondString.length() ; i++){
			char c = secondString.charAt(i);
			Integer count = charactersMap.get(c);
			if(count == null){
				return false;
			}
			else if(count == 1){
				charactersMap.remove(c);
			}
			else{
				count--;
				charactersMap.put(c, count);
			}
		}
		
		return charactersMap.keySet().isEmpty();
	}

}
