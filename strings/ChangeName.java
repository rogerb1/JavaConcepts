/*
   
   Write a program that reads a persons name 
   and converts it into a "cool name"

*/

import java.util.*;

public class ChangeName {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.print("What is your name? ");
      String name = input.nextLine();
      System.out.print("(M)ale or (F)emale ");
      String gender = input.next();
      processInfo(input, name, gender);
   }

   // Takes string name, gender, and scanner as parameters.
   // takes the first character and capatalizes it.
   // Adds amazing if gender is male or amazingly
   // for anything else.
   // Prints new generated name.
   public static void processInfo(Scanner input, String name,
                                  String gender) {
      String first = name.substring(0, name.indexOf(" "));
      String last = name.substring(name.indexOf(" ") + 1);
      last = last.toUpperCase();
      String firstL = first.substring(0, 1);
      String title;
      if (gender.equalsIgnoreCase("m")) {
        title = "Amazing";
      } else {
        title = "Amazingly";
      }
      System.out.println("Your cool name is \"" + firstL + ". "
        + last + " " + title + " " + first + "-izzle\"");
    }
}