 /*  
   Exercise: Write a program that repeatedly prompts 
   the user for words until 
   the user types "goodbye", 
   then outputs the longest word that was typed.
   
   Type a word (or goodbye to quit): tim
   Type a word (or goodbye to quit): superdude
   The longest word you typed was superdude with 9 letters

*/


import java.util.*;

public class LongestName {
   public static final String SENTINEL = "goodbye";
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      readNames(input);
   }
   
   // Takes scanner input as a parameter
   // Prompts user to type word,
   // Summarizes which word had the most character.
   // Prints results
   public static void readNames(Scanner input) {
      String word = "";
      String longest = "";
      System.out.print("Type a word (or " + SENTINEL + " to quit): ");
      word = input.next();
      while (!word.equals(SENTINEL)) {
         if (word.length() > longest.length()) {
            longest = word;
         }
         System.out.print("Type a word (or " + SENTINEL + " to quit): ");
         word = input.next();
     }
     System.out.print("The longest word you typed was " + longest +
                 " " + "with "  + longest.length() + " letters");
   }
}