/*

 Write a program that prompts the user
 for a name or names, and counts the letters 
 in each of them.

 Example output:

 This program gives you the 
 amount of letters in a name.

 How many names? 3

 Name 1: John
 John has 4 letters
 Name 2: Alice
 Alice has 5 letters
 Name 3: Pamela 
 Pamela has 6 letters

*/

// Counts the amount of letters
// in a give name or names.

import java.util.*;

public class CountLetters {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      giveIntro();
      wordAmount(console);
   }
   
   // Introduces program
   public static void giveIntro() {
      System.out.println("This program gives you the");
      System.out.println("amount of letters in a name.");
      System.out.println();
   }
   
   // Takes scanner as a parameter
   // Prompts for amount of names
   // and counts the letters in a name.
   public static void wordAmount(Scanner console) {
      System.out.print("How many names? ");
      int amount = console.nextInt();
      for (int i = 1; i <= amount; i++) {
         System.out.print("Name " + i + ": ");
         String words = console.next();
         System.out.println(words + " has " + words.length() + " letters");
      }
   }
}