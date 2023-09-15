package edu.citadel;

import java.util.Scanner;


public class PasswordChecker {
    public static void main(String[] args) {
        // write your program here.
        // Don't forget to plan and write pseudocode.
        // Post to discord if you have questions.
        Scanner input = new Scanner(System.in);
        System.out.println("ENTER PASSWORD PLEASE:");
        String pw = input.nextLine();

        // you can make any variables you think will help:



    
        // this loop will iterate over each character in the string
        // ch will be the current character
        // the loop will end when all characters have been processed
        for (char ch : pw.toCharArray()) {
            // add code in here to check the current character


        }
    
        //end the program by printing GOOD or BAD depending on what you saw.
    

    }
}
