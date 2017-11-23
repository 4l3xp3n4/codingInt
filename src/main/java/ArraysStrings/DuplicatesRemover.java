package ArraysStrings;

public class DuplicatesRemover implements DuplicateCharactersRemover {

	public String remove(String string) {
		
		if(string == null || string.length() == 0 || string.length() == 1){
			return string;
		}
		for(int i = 1; i < string.length() ; i ++){
			if(string.substring(0, i).contains(Character.toString(string.charAt(i)))){
				string = string.substring(0, i).concat(string.substring(i+1,string.length()));
				i--;
			}
		}
		return string;
	}

}
