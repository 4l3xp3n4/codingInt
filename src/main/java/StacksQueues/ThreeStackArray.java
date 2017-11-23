package StacksQueues;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeStackArray {
	private int[] hosterArray;
	private Integer stackSize;
	private List<Integer> stackIndexes;
	
	public ThreeStackArray(Integer stackSize){
		hosterArray = new int[stackSize*3];
		this.stackSize = stackSize;
		this.stackIndexes = Arrays.asList(new Integer[]{-1,-1,-1});
	}
	
	public void push(Integer value, Integer stackNumber){
		int newElementPosition =  getHostIndexPosition(stackNumber) +1;
		if(newElementPosition >= (stackNumber * stackSize)){
			throw new IllegalArgumentException();
		}
		incrementStackIndex(stackNumber);
		hosterArray[newElementPosition]= value ;
	}
	
	public Integer pop(Integer stackNumber){
		int result = getPeek(stackNumber);
		decrementStackIndex(stackNumber);
		return result;
	}
	
	public boolean isEmpty(int stackNumber){
		if(stackIndexes.get(stackNumber-1) < 0){
			return true;
		}
		return false;
	}
	
	public Integer getPeek(int stackNumber){
		if(isEmpty(stackNumber)){
			return null;
		}
		int peekPosition = getHostIndexPosition(stackNumber);
		return hosterArray[peekPosition];
	}
	
	private int getHostIndexPosition(int stackNumber){
		return ((stackNumber -1) * stackSize) + getStackIndex(stackNumber);
	}
	
	private int getStackIndex(int stackNumber){
		return stackIndexes.get(stackNumber -1);
	}
	
	private void decrementStackIndex(int stackNumber){
		int newValue = getStackIndex(stackNumber) - 1;
		stackIndexes.set(stackNumber -1, newValue);
	}
	
	private void incrementStackIndex(int stackNumber){
		int newValue = getStackIndex(stackNumber) + 1;
		stackIndexes.set(stackNumber -1, newValue);
	}

}
