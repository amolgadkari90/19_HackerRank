package com.lumen;

import java.util.Arrays;

//You are given an array arr[] of non-negative numbers. Each number tells you the maximum number 
//of steps you can jump forward from that position.
//For example:
//If arr[i] = 3, you can jump to index i + 1, i + 2, or i + 3 from position i.
//If arr[i] = 0, you cannot jump forward from that position.
//Your task is to find the minimum number of jumps needed to move from the first 
//position in the array to the last position.
//Note:  Return -1 if you can't reach the end of the array.
//Examples : 
//Input: arr[] = [1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9]
//Output: 3 
//Explanation: First jump from 1st element to 2nd element with value 3. From here we jump to 5th element 
//with value 9, and from here we will jump to the last. 
//Input: arr = [1, 4, 3, 2, 6, 7]
//Output: 2 
//Explanation: First we jump from the 1st to 2nd element and then jump to the last element.
//Input: arr = [0, 10, 20]
//Output: -1
//Explanation: We cannot go anywhere from the 1st element.

public class JMinimumJumps {
	
    public int minJumps(int[] arr) {
        // code here
        int len = arr.length;
    	//System.out.println("Length = "+ len);
        if(len == 0 || arr[0] == 0) return -1;
        if(len == 1) return 0;        
    	int sum = 0;
        int minJump = -1;
    	for(int i = 0; i < len; i++) {
    		sum += arr[i];
    		if (arr[i] == 0) return -1;
    		//System.out.println("the sum = "+sum);
    		if (sum >= len) {
    			minJump = i;
    			//System.out.println("I am here "+minJump );
    			break;
    		}
    	}       
    	return minJump;  
    }

	public static void main(String[] args) {
		JMinimumJumps mj = new JMinimumJumps();
		
		int arr1[] = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9}; 
		System.out.println("The MinimumJumps = "+ mj.minJumps(arr1));//3
		
		int arr2[] = {1, 4, 3, 2, 6, 7};
		System.out.println("The MinimumJumps = "+ mj.minJumps(arr2));//2
		
		int arr3[] = {0, 10, 20};
		System.out.println("The MinimumJumps = "+ mj.minJumps(arr3));//-1
		
		

	}

}
