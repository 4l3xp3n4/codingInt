package sortingSearching;

public class RotatedSortedArraySorterImplementation implements RotatedSortedArraySorter {


	
	private int getPivotIndex(int[] array){
		
		int arrayCurrentElement = array[0];
		int indexNextElement = array[1];
		
		for(int i = 1; i < array.length -1; i++){
			if(arrayCurrentElement > indexNextElement){
				return i;
			}
			
			arrayCurrentElement = array[i];
			indexNextElement = array[i+1];
		}
		
		return 0;
	}

	@Override
	public boolean search(int[] testCase, int element) {
		return search(testCase,0, testCase.length-1,element) >0;
	}

	private int search(int[] numbers, int top, int button, int element) {
		if(top > button){
			return -1;
		}
		
		int pivot = (top + button)/2;
		if(numbers[pivot] == element){
			return pivot;
		}
		
		if(numbers[pivot] < numbers[button]){
		 if(element > numbers[pivot] && element < numbers[button]){
			 return search(numbers, pivot+1, button, element);
		 }else{
			 return search(numbers, top, pivot--, element);
		 }
		}else{
			 if(element > numbers[top] && element < numbers[pivot]){
				 return search(numbers,top, pivot --,element); 
			 }else{
				 return search(numbers,pivot++, button,element);  
			 }
		}
	}
	

}
