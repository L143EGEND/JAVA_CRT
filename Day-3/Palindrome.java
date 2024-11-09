// Write a JAVAprogram to check whether a number is palindrome or not.

import java.util.Scanner;

class Palindrome {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int number = sc.nextInt();

        int originalNumber = number;  
        int reverse = 0;

        while (number != 0) {
            int digit = number % 10;           
            reverse = reverse * 10 + digit;    
            number = number / 10;              
        }
        if (originalNumber == reverse) {
            System.out.println("The number is a palindrome.");
        } else {
            System.out.println("The number is not a palindrome.");
        }
    }
}
