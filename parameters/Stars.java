/*
 
 Exercise one: Parameters

 Print out the following output
 For refrence there are 13, 7, and 35 stars.
 
 *************
 *******
 *********************************** 
 
*/


// Prints 13, 7, and 35 stars on seperate lines

public class Stars {
   public static void main(String [] args) {
      starLine(13);
      starLine(7);
      starLine(35);
   }
   
   // Takes integer count as a parameter
   // Prints stars with a for loop
   public static void starLine(int count) {
      for (int i = 1; i <= count; i++) {
         System.out.print("*");
      }
      System.out.println();
   }
}