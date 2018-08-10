/*

   Boolean Question
   
   Write a program that prompts the user for two words
   and reports whether they "rhyme" 
   (end with the same last two letters) 
   and/or "alliterate" (start with the same letter).

   Example output:
   
   Type two words: car STAR 
   They rhyme!
   
   Type two words: Bare blare 
   They rhyme!
   They alliterate!
   Type two words: booyah socks 
   They don't rhyme.
   
*/

import java.util.*;

public class Rhyme {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("Type two words: ");
      String s1 = console.next();
      String s2 = console.next();
      
      if (rhyme(s1, s2)) {
         System.out.println("They rhyme!");
      }
      
      if (alliterate(s1, s2)) {
        System.out.println("They alliterate!");
      }  
   }
   
   // Takes string s1 and s2 as parameters
   // returns when the length of s2 is greater than 2
   // and s1 last two characters are the same as last
   // two characters of s2.
   public static boolean rhyme(String s1, String s2) {
      return s2.length() >= 2 && s1.endsWith(s2.substring(s2.length() - 2));
   }
   
   // Takes s1 and s2 as parameters
   // returns the first character of string 1 and 2.
   public static boolean alliterate(String s1, String s2) {
      return s1.startsWith(s2.substring(0, 1)); 
   }
}
