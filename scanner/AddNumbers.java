/*
   
   Write an interactive
   program that sums up a chosen amount of numbers.
   Example:
   
   How many numbers to add? 2
   Type a number: 2
   Type a number: 9
   The sum is: 6
   
*/

// Computes the sum of choosen numbers to add.
// Uses a cumulative sum loop to compute sum.

import java.util.*;

public class AddNumbers {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("How many numbers to add? ");
      int count = console.nextInt();
      addNumbers(console, count);
   }
   
   // Takes Scanner and count as parameters
   // Uses cumulative sum loop to add numbers and
   // Prints sum.
   public static void addNumbers (Scanner console, int count) {
      int sum = 0;
      for (int i = 1; i <= count; i++) {
         System.out.print("Type a number: ");
         sum = sum + console.nextInt();
      }
      System.out.print("The sum is: " + sum);
   }
}
