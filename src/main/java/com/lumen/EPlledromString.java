package com.lumen;

import java.util.Scanner;

public class EPlledromString {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();

        boolean isPalindrome = true;
        
        for (int i = 0; i < A.length() / 2; i++) {
            if (A.charAt(i) != A.charAt(A.length() - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            System.out.println("The string " + A + " is palindrome");
        } else {
            System.out.println("The string " + A + " is not palindrome");
        }

        sc.close();
    }
}
