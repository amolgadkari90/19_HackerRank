package com.lumen;

import java.util.Scanner;

public class DStringBreakdown {

	 public static String getSmallestAndLargest(String s, int k) {
		 System.out.println("Input String -> " + s);
	        int length = s.length();
	        System.out.println("Length -> " + length);

	        // initialize with the first substring
	        String smallest = s.substring(0, k);
	        String largest  = s.substring(0, k);

	        for (int i = 0; i <= length - k; i++) {
	            String subStr = s.substring(i, i + k);
	            System.out.println("Substring -> " + subStr);

	            if (subStr.compareTo(smallest) < 0) {
	                smallest = subStr;
	            }
	            if (subStr.compareTo(largest) > 0) {
	                largest = subStr;
	            }
	        }
	        return smallest + "\n" + largest;
	    }


	    public static void main(String[] args) {
	        Scanner scan = new Scanner(System.in);
	        String s = scan.next();
	        int k = scan.nextInt();
	        System.out.println(s + " "+k);
	        
	      
	        System.out.println("Result -> (smallest) + (largest) "+getSmallestAndLargest(s, k));
	        scan.close();
	    }
	    

}
