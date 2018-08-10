/*

Exercise four: for loops
  
Create the following output
using for loops. Make the program
flexible by adding a constant.
  
Size 3:
  
  
////////\\\\\\\\
////********\\\\
****************
  
  
Size 6:
  
////////////////////\\\\\\\\\\\\\\\\\\\\
////////////////********\\\\\\\\\\\\\\\\
////////////****************\\\\\\\\\\\\
////////************************\\\\\\\\
////********************************\\\\
****************************************

  
*/

public class Stars {
   public static final int SIZE = 5;
   public static void main(String[] args) {
      figure();
   }
   
   public static void figure() {
      for (int line = 1; line <= SIZE; line++) {
         for (int slash = 1; slash <= -4 * line + (4 * SIZE); slash++) {
            System.out.print("/");
         }
         for (int stars = 1; stars <= 8 * line - 8; stars++) {
            System.out.print("*");
         }
         for (int slash = 1; slash <= -4 * line + (4 * SIZE); slash++) {
            System.out.print("\\");
         }
         System.out.println();
      }
   }
}