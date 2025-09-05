package com.lumen;

import java.util.Arrays;

//You are given an integer array arr[]. You need to find the maximum sum of a subarray (containing at least 
//one element) in the array arr[].
//Note : A subarray is a continuous part of an array.
//Examples:
//Input: arr[] = [2, 3, -8, 7, -1, 2, 3]
//Output: 11
//Explanation: The subarray [7, -1, 2, 3] has the largest sum 11.
//Input: arr[] = [-2, -4]
//Output: -2
//Explanation: The subarray [-2] has the largest sum -2.
//Input: arr[] = [5, 4, 1, 7, 8]
//Output: 25
//Explanation: The subarray [5, 4, 1, 7, 8] has the largest sum 25.

public class IKadaneAlgorithm {
	
	static int maxSubarraySum(int[] arr) {
	    int n = arr.length;
	    int prefix = 0;              // running prefix sum
	    int minPrefix = 0;           // smallest prefix seen so far
	    int maxSum = Integer.MIN_VALUE;
	    //int [] arr1 = {2, 3, -8, 7, -1, 2, 3};
	    System.out.println("maxSum -> "+maxSum);
	    for (int i = 0; i < n; i++) {
	    	System.out.println(i);
	        prefix += arr[i];
	        System.out.println("prefix -> "+prefix);
	        maxSum = Math.max(maxSum, prefix - minPrefix);
	        System.out.println("maxSum -> "+ maxSum);
	        minPrefix = Math.min(minPrefix, prefix);
	        System.out.println("minPrefix -> "+minPrefix);
	    }
	    return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr1 = {2, 3, -8, 7, -1, 2, 3};
		int maxSum = maxSubarraySum(arr1);
		System.out.println("maxSum -> "+maxSum); //11
		System.out.println("********************************");
		
		int arr2[] = {-2, -4};
		maxSum = maxSubarraySum(arr2);
		System.out.println("maxSum -> "+maxSum);//-2
		System.out.println("********************************");
		
		int arr3[] = {5, 4, 1, 7, 8};//25
		maxSum = maxSubarraySum(arr3);
		System.out.println("maxSum -> "+maxSum);//25
		System.out.println("********************************");
		
		int [] arr4 = {1,2,3,4,5,6};
		maxSum = maxSubarraySum(arr4);
		System.out.println("maxSum -> "+maxSum); //21	
		System.out.println("********************************");
		

	}

}
