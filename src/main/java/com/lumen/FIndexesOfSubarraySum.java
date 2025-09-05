package com.lumen;

import java.util.ArrayList;
//Given an array arr[] containing only non-negative integers, your task is to find a continuous 
//subarray (a contiguous sequence of elements) whose sum equals a specified value target.
//You need to return the 1-based indices of the leftmost and rightmost elements of this subarray. 
//You need to find the first subarray whose sum is equal to the target.
//Note: If no such array is possible then, return [-1].
//Examples:
//Input: arr[] = [1, 2, 3, 7, 5], target = 12
//Output: [2, 4]
//Explanation: The sum of elements from 2nd to 4th position is 12.
//Input: arr[] = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], target = 15
//Output: [1, 5]
//Explanation: The sum of elements from 1st to 5th position is 15.
//Input: arr[] = [5, 3, 4], target = 2
//Output: [-1]
//Explanation: There is no subarray with sum 2.

public class FIndexesOfSubarraySum {

	static ArrayList<Integer> subarraySum(int[] arr, int target) {
		// code here
		// Arrays.sort(arr);
		int start = 0;
		int end = 0;
		ArrayList<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < arr.length; i++) {
			start = i;
			int sum = arr[i];
			int equalSum =  0;
			if (target == sum && equalSum == 0) 
				equalSum = i+1;				
						
			for (int j = i + 1; j < arr.length; j++) {
				sum += arr[j];
				
				if (sum == target) {
					end = j;
					break;
				} else if (sum > target) {
					break;
				}
			}
			if (end > start) {
				res.add(start + 1);
				res.add(end + 1);
				break;
			} else if(equalSum != 0) {
				res.add(equalSum);
				res.add(equalSum);
				break;
			}
		}
		if (res.isEmpty()) {
			res.add(-1);
			return res;
		} else {
			return res;
		}
	}
	
	//ChatGPT
	static ArrayList<Integer> subarraySum1(int[] arr, int target) {
        int start = 0;
        int currentSum = 0;
        ArrayList<Integer> res = new ArrayList<>();

        for (int end = 0; end < arr.length; end++) {
            currentSum += arr[end];

            // shrink window while sum is too big
            while (currentSum > target && start < end) {
                currentSum -= arr[start];
                start++;
            }

            // check for match
            if (currentSum == target) {
                res.add(start + 1); // 1-based index
                res.add(end + 1);
                return res;
            }
        }

        res.add(-1);
        return res;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 5, 3, 4 };
		ArrayList<Integer> subarraySum = subarraySum(arr, 15);
		System.out.println("Own ->" + subarraySum );
		subarraySum = subarraySum1(arr, 15);
		System.out.println("ChatGPT ->" + subarraySum );

		int[] arr1 = { 19, 23, 15, 6, 6, 2, 28, 2 };
		subarraySum = subarraySum(arr1, 2);
		System.out.println("Own ->" + subarraySum );
		subarraySum = subarraySum1(arr1, 2);
		System.out.println("ChatGPT ->" + subarraySum );
		
		int[] arr2 = { 5, 1, 24, 15, 12, 41, 1 };
		subarraySum = subarraySum(arr2, 5);
		System.out.println("Own ->" + subarraySum );
		subarraySum = subarraySum1(arr2, 5);
		System.out.println("ChatGPT ->" + subarraySum );
		
		
		
	}

}
