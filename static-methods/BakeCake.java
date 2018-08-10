// Create a program that gives instructions 
// on how to bake a cake twice.
// Produce the exact output

/* 
   Gather ingridents
   Preheat oven to 325 degrees Farenheight
   Cream and butter the sugar 
   Add the eggs and Vanilla
   Stir in the cake flour
   Pour the batter into the pan 
   bake for 1 hour and 15 minutes
   
   Gather ingridents
   Preheat oven to 325 degrees Farenheight
   Cream and butter the sugar 
   Add the eggs and Vanilla
   Stir in the cake flour
   Pour the batter into the pan 
   bake for 1 hour and 15 minutes
   
*/


// Prints out the instructions for baking a vanilla cake twice.
public class BakeCake {
   public static void main(String[] args) {
      bakeInstructions(); // Calling method inside main
      System.out.println();
      bakeInstructions(); // Calling it a second time
   }
   
   // Prints instructions for baking a vanilla cake
   public static void bakeInstructions() {
      System.out.println("Gather ingridents");
      System.out.println("Preheat oven to 325 degrees Farenheight");
      System.out.println("Cream and butter the sugar");
      System.out.println("Add the eggs and Vanilla");
      System.out.println("Stir in the cake flour");
      System.out.println("Pour the batter into the pan");
      System.out.println("Bake for 1 hour and 15 minutes");
   }
}
