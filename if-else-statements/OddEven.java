/*
   Create a program that 
   tells a user if there number is odd 
   or even.
   
   Example output: 
   
   This program will tell
   you if your number is odd or even
  
   Enter number: 2
   2 is even
  
   This program will tell
   you if your number is odd or even
  
   Enter number: 3
   3 is odd

*/

// Tells you if a number entered
// is odd or even.

import java.util.*;

public class OddEven {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      giveIntro();
      oddEven(console);
   }
   
   // Introduces program
   public static void giveIntro() {
      System.out.println("This program will tell");
      System.out.println("you if your number is odd or even");
      System.out.println();
   }
   
   // Takes scanner as a parameter
   // Prompts user to enter number
   // number is determined to be odd or even
   public static void oddEven(Scanner console) {
      System.out.print("Enter number: ");
      int number = console.nextInt();
      if (number % 2 == 0) {
        System.out.print(number + " is even");
      } else {
        System.out.print(number + " is odd");
      }
   }
}