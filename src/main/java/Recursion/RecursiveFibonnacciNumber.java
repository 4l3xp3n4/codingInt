package Recursion;

public class RecursiveFibonnacciNumber implements FibonacciNumbers {

	public int getFibbonacciOf(int n) {
		if( n == 1 || n == 2){
			return 1;
		}
		
		return (getFibbonacciOf(n-1) + getFibbonacciOf(n-2)); 
	}

}
