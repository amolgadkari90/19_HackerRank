package com.lumen;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

//Given an array of positive integers arr[], return the second largest element from the array. 
//If the second largest element doesn't exist then return -1.
//Note: The second largest element should not be equal to the largest element.
//Examples:
//Input: arr[] = [12, 35, 1, 10, 34, 1]
//Output: 34
//Explanation: The largest element of the array is 35 and the second largest element is 34.
//Input: arr[] = [10, 5, 10]
//Output: 5
//Explanation: The largest element of the array is 10 and the second largest element is 5.
//Input: arr[] = [10, 10, 10]
//Output: -1
//Explanation: The largest element of the array is 10 and the second largest element does not exist.

public class HSecondLargest {
	
    public static int getSecondLargest(int[] arr) {
        int secondMax = 0;
    	Integer sm = 0;
    	Set<Integer> treeSet = new TreeSet<>();
    	Arrays.stream(arr).forEach(e -> treeSet.add(e));
    	if(treeSet.size() > 1) {
    		sm = treeSet.stream().skip(treeSet.size()-2).findFirst().get();
    		secondMax = sm.intValue();
    	} else {
    		secondMax = -1;
    	}
    	
    	
    	//System.out.println("secondMax -> "+ secondMax);
    	
    	return secondMax;
    	
        
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr1[] = {12, 35, 1, 10, 34, 1}; 	// 34
		int secondLargest = HSecondLargest.getSecondLargest(arr1);
		System.out.println("secondLargest -> "+ secondLargest);
		
		int arr2[] = {10, 5, 10}; 				// 5
		secondLargest = HSecondLargest.getSecondLargest(arr2);
		System.out.println("secondLargest -> "+ secondLargest);
		
		int arr3[] = {10, 10, 10};				// -1	
		secondLargest = HSecondLargest.getSecondLargest(arr3);
		System.out.println("secondLargest -> "+ secondLargest);

	}

}
