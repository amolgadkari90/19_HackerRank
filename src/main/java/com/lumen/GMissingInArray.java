package com.lumen;

import java.util.Arrays;

//You are given an array arr[] of size n - 1 that contains distinct integers in the range from 1 to n (inclusive). 
//This array represents a permutation of the integers from 1 to n with one element missing. 
//Your task is to identify and return the missing element.
//Examples:
//Input: arr[] = [1, 2, 3, 5]
//Output: 4
//Explanation: All the numbers from 1 to 5 are present except 4.
//Input: arr[] = [8, 2, 4, 5, 3, 7, 1]
//Output: 6
//Explanation: All the numbers from 1 to 8 are present except 6.
//Input: arr[] = [1]
//Output: 2
//Explanation: Only 1 is present so the missing element is 2.

public class GMissingInArray {
	
	static int missingNum(int arr[]) {
        // code here
//        Arrays.sort(arr);
//        int start = 0;
//        //System.out.println("arr.length ->"+ arr.length);
//        int end = arr.length - 1;
//        int missingNumber = 0;
//        //System.out.println("End -> "+ end);
//        if(end > 2) {
//        	while(start <= end) {
//           	 
//            	if (arr[start +1 ] - arr[start] != 1) {
//            		missingNumber = arr[start] +1;
//            		break;
//            	} else if(arr[end] - arr[end -1] != 1) {
//            		missingNumber = arr[end] - 1;
//            		break;
//            	} 
//            	start++;
//            	end--;
//            }
//        	
//        }
//        
//        if(end == 0)        		
//    		missingNumber = arr[start] +1; 
//    	if (arr.length < 3 || missingNumber == 0){
//    	    if(arr[0] > 1)
//    	        missingNumber = arr[0]-1;
//    	    else missingNumber = arr[arr.length-1]+1; 
//    	} 
//    	
//    	
//		return missingNumber; 
		
		Arrays.sort(arr);
	    for (int i = 0; i < arr.length - 1; i++) {
	        if (arr[i+1] - arr[i] != 1) {
	            return arr[i] + 1;
	        }
	    }
	    // if nothing missing inside, either before first or after last
	    return arr[0] - 1 > 0 ? arr[0] - 1 : arr[arr.length - 1] + 1;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {1, 2, 3, 5};
		int missingNum = missingNum(arr);
		System.out.println("1 Missing number -> "+ missingNum); //4
	
		int arr1[] = {8, 2, 4, 5, 3, 7, 1};
		missingNum = missingNum(arr1);
		System.out.println("2 Missing number -> "+ missingNum); //6
		
		int arr2[] = {1};
		missingNum = missingNum(arr2);
		System.out.println("3 Missing number -> "+ missingNum); //2
		
		int arr3[] = {2, 3};
		missingNum = missingNum(arr3);
		System.out.println("4 Missing number -> "+ missingNum); //1
		
		int arr4[] = {7, 6, 9, 5, 4, 8, 2, 3};
		missingNum = missingNum(arr4);
		System.out.println("5 Missing number -> "+ missingNum); //1
		
		int arr5[] = {3, 1};
		missingNum = missingNum(arr5);
		System.out.println("6 Missing number -> "+ missingNum); //2
		
		
		
		
		

	}

}
