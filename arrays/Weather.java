/*

  Use an array to solve this problem

  How many days' temperatures? 7 
   Day 1's high temp: 45
   Day 2's high temp: 44
   Day 3's high temp: 39
   Day 4's high temp: 48 
   Day 5's high temp: 37 
   Day 6's high temp: 46 
   Day 7's high temp: 53 
   Average temp = 44.6
   4 days were above average
 
*/

import java.util.*;

public class Weather {
   public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      System.out.print("How many days' temperatures? ");
      int days = console.nextInt();
      
      int temperatures [] = new int[days];
      int sum = 0;
      
      for (int i = 0; i < days; i++) {
         System.out.print("Day " + (i + 1) + "'s high temp: ");
         temperatures[i] = console.nextInt(); // accessing array
         sum += temperatures[i];
      }
      double average = (double) sum / days;
      
      int count = 0;
      for (int i = 0; i < days; i++) {
         if (temperatures[i] > average) {
            count++;
         }
      }
      System.out.printf("Average temp = %.1f\n", average);
      System.out.println(count + " days were above average.");
   }
}
