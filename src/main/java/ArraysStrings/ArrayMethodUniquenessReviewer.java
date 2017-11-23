package ArraysStrings;

public class ArrayMethodUniquenessReviewer implements UniquenesReviewer {

	public Boolean hasUniqueCharacters(String toReviewString) {
		Boolean[] characters = new Boolean[256];
		
		for(int i =0; i < toReviewString.length() ; i ++){
			char c = toReviewString.charAt(i);
			if(characters[c] == Boolean.TRUE){
				return false;
			}else{
				characters[c] = Boolean.TRUE;
			}
		}
		return true;
	}

}
