/*
   Create a program that returns the age of a person
   according to birth year and any chosen year. This program
   must take two parameters. Sample output:
   
   In the year 2018, you are 20 years old.

*/

// Calculates the age of a person
// according to birth year and any choosen year.

public class ReturnAge {
   public static void main (String[] args) {
      int answer = getAge(2018, 1998);
   }
   
   // Takes current year and year born as parameters.
   // Prints out current year and age. Also, returns
   // calculated age.
   
   public static int getAge(int currentYear, int yearBorn) {
      int totalAge = currentYear - yearBorn;
      System.out.print("In the year " + currentYear 
                           + ", you are " + totalAge + " years old.");
      return totalAge;
   }
}