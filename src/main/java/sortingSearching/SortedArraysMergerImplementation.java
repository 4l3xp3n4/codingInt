package sortingSearching;

public class SortedArraysMergerImplementation implements SortedArraysMerger {

	@Override
	public Integer[] merge(Integer[] firstArray, Integer[] secondArray) {
		int firstArrayIndex = firstArray.length-1;
		int secondArrayIndex = secondArray.length-1;
		int firstArrayLastElementPosition = getLastArrayElementPosition(firstArray);
		 
		while(secondArrayIndex >= 0){
			if(firstArray[firstArrayLastElementPosition] > secondArray[secondArrayIndex]){
				firstArray[firstArrayIndex] = firstArray[firstArrayLastElementPosition];
				firstArrayLastElementPosition--;
			}
			else{
				firstArray[firstArrayIndex] = secondArray[secondArrayIndex];
				secondArrayIndex--;
			}
			
			firstArrayIndex--;
		}
		
		return firstArray;
	}
	
	private int getLastArrayElementPosition(Integer[] array){
		Integer value;
		value = array[0];
		int result = 0;
		while( value != null){
			value = array[result];
			result++;
		} ;
		
		return result-2;
	}

}
