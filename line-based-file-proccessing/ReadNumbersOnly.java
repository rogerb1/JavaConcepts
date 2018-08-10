
/*
   
  Modify the program to
  process the entire file
  even though they contain non
  numeric values. (Skipping them)
  
*/

// Displays each number in a given file
// and shows their sum at the end.

import java.util.*;
import java.io.*;

public class ReadNumbersOnly {
   public static void main(String[] args) throws FileNotFoundException {
      Scanner input = new Scanner(new File("numbers2.txt"));
      double sum = 0.0;
      while (input.hasNext()) {
         if (input.hasNextDouble()) {
            double next = input.nextDouble();
            System.out.println("number = " + next);
            sum = sum + next;
         } else {
            input.next(); // throw away bad tokens
         }
      }
      System.out.printf("Sum = %.1f\n", sum); 
   }
}