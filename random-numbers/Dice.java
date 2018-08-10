/*

   Write a program that simulates
   rolling of two 6-sided dice
   until their combined result
   comes up as 7

   2 + 4 = 6
   3 + 5 = 8
   4 + 3 = 7
   
   You won after 3 tries!
   
   Modify the program to play 3 dice games using a method.

*/

import java.util.*;

public class Dice {
   public static void main(String[] args) {
      Random rand = new Random();
      
      int sum = 0;
      int count = 0;
      
      while (sum != 7) {
         int num1 = rand.nextInt(6) + 1;
         int num2 = rand.nextInt(6) + 1;
         sum = num1 + num2;
         System.out.println(num1 + " + " + num2 + " = " +sum);
         count++;
      }
      System.out.print("You won after " + count + " tries!");
   }
}
