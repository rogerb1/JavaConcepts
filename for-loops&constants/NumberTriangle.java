/*
  
  Create the following output
  
     1
    22
   333
  4444
 55555
 
*/

public class NumberTriangle {
   public static void main(String [] args) {
      reversedTriangle();
   }
   
   public static void reversedTriangle() {
      for (int i = 1; i <= 5; i++) {
         for (int j = 5 - i; j >= 0; j--) {
            System.out.print(" ");
         }
         for (int k = 1; k <= i; k++) {
            System.out.print(i);
         }
         System.out.println();
      }
   }
}

