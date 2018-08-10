/*

  Exercise one: Scanner
  
  Create a program that 
  prompts a user for a phrase
  and repeats it any amount of times.
  
  Example output: 
  
  Enter a phrase: Hello
  How many times should I say it? 2
  Hello
  Hello
  
*/

// Prints out a given phrase
// a given amount of times.
// Output example: 

import java.util.*; 

public class RepeatPhrase {
   public static void main(String[] args) { 
      Scanner console = new Scanner(System.in);
      sayPhrase(console);
   }
   
   // Takes scanner as a parameter and prompts
   // user to enter phrase and number.
   // Loops the number and phrase.
   public static void sayPhrase(Scanner console) {
      System.out.print("Enter a phrase: ");
      String phrase = console.nextLine();
      System.out.print("How many times should I say it? ");
      int times = console.nextInt();
      for (int i = 1; i <= times; i++) {
         System.out.println(phrase);
      }
   }
}