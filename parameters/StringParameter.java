/*
 
  Strings as parameters: create a program
  that uses strings as parameters
  to welcome a specific person.
  
  Example output:
 
  Welcome, Jane!
  Welcome, Jacob!
  Welcome, Aaron!
  
*/

// Prints three welcome messages

public class StringParameter {
   public static void main(String[] args) {
      String name = "Jane";
      sayWelcome(name);
      sayWelcome("John");
      sayWelcome("Aaron");
   }
   
   // Takes a string as a parameter and prints 
   // out a welcome message
   public static void sayWelcome(String name) {
      System.out.println("Welcome, " + name + "!");
   }
}
